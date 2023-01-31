/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author ferna
 */
public class DaoProdutosVendasProdutos extends ConexaoMySql{
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDao(int pCodigoVenda){
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendaProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try{
            this.conectar();
            this.executarSQL("SELECT "
                    + "tbl_produto.pk_id_produto, "
                    + "tbl_produto.pro_estoque, "
                    + "tbl_produto.pro_nome, "
                    + "tbl_produto.pro_valor, "
                    + "tbl_vendas_produtos.fk_produto, "
                    + "tbl_vendas_produtos.fk_vendas, "
                    + "tbl_vendas_produtos.pk_id_venda_produto, "
                    + "tbl_vendas_produtos.ven_pro_quantidade, "
                    + "tbl_vendas_produtos.ven_pro_valor "
                    + "FROM tbl_vendas_produtos "
                    + "INNER JOIN tbl_produto ON tbl_produto.pk_id_produto = tbl_vendas_produtos.fk_produto "
                    + "WHERE tbl_vendas_produtos.fk_vendas = '" + pCodigoVenda +"';");
            
            while(this.getResultSet().next()){
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutosVendaProdutos = new ModelProdutosVendasProdutos();
                
                 
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));                
                modelProdutos.setProEstoque(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                
                modelVendasProdutos.setProdutoId(this.getResultSet().getInt(5));                
                modelVendasProdutos.setVendaId(this.getResultSet().getInt(6));
                modelVendasProdutos.setVendaProdutosId(this.getResultSet().getInt(7));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getDouble(8));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(9));

                modelProdutosVendaProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendaProdutos.setModelVendasProdutos(modelVendasProdutos);
                
                listaModelProdutosVendasProdutos.add(modelProdutosVendaProdutos);


                
            }
        }catch (Exception e){
            e.printStackTrace();
            
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
        
        
    }
}
