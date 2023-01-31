/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendasProdutos;


/**
 *
 * @author marla
 */
public class DaoVendasProdutos extends ConexaoMySql {
    public int salvarVendaProdutosDAO(ModelVendasProdutos pModelVendaProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_vendas_produtos ("
                    + "fk_produto, "
                    + "fk_vendas, "
                    + "ven_pro_valor, "
                    + "ven_pro_quantidade) VALUES ("
                    + "'" + pModelVendaProdutos.getProdutoId() + "',"
                    + "'" + pModelVendaProdutos.getVendaId() + "',"
                    + "'" + pModelVendaProdutos.getVenProValor() + "',"
                    + "'" + pModelVendaProdutos.getVenProQuantidade() + "'"
                    +");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
 
  

    public boolean excluirVendaProdutosDAO(int pIdVendaProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas_produtos WHERE fk_vendas = '" + pIdVendaProdutos + "';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarVendaProdutosDAO(ModelVendasProdutos pModelVendaProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas_produtos SET "
                            + "pk_id_venda_produto = '"+pModelVendaProdutos.getVendaProdutosId()+"', "
                    + "fk_produto = '" + pModelVendaProdutos.getProdutoId() + "',"
                    + "fk_vendas = '" + pModelVendaProdutos.getVendaId() + "',"
                    + "ven_pro_valor = '" + pModelVendaProdutos.getVenProValor() + "',"
                    + "ven_pro_quantidade" + pModelVendaProdutos.getVenProQuantidade() + "'"
                    + "WHERE pk_id_vendas_produtos = '" + pModelVendaProdutos.getVendaProdutosId() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelVendasProdutos retornarVendaProdutosDAO(int pVendaProdutosId) {
        ModelVendasProdutos modelVendaProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_vebdas_produtos"
                    + "fk_produto, "
                    + "fk_vendas, "
                    + "ven_pro_valor, "
                    + "ven_pro_quantidade "
                    + "FROM tbl_vendas_produtos WHERE pk_id_vendas_produtos = '" + pVendaProdutosId + "'");
            while (this.getResultSet().next()) {
                modelVendaProdutos.setVendaProdutosId(this.getResultSet().getInt(1));
                modelVendaProdutos.setProdutoId(this.getResultSet().getInt(2));
                modelVendaProdutos.setVendaId(this.getResultSet().getInt(3));
                modelVendaProdutos.setVenProValor(this.getResultSet().getInt(4));
                modelVendaProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendaProdutos;
    }

    public ArrayList<ModelVendasProdutos> retornarListaVendasProdutosDAO() {

        ArrayList<ModelVendasProdutos> listaModelVendaProdutos = new ArrayList<>();
        ModelVendasProdutos modelVendaProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_vebdas_produtos "
                    + "fk_produto, "
                    + "fk_vendas, "
                    + "ven_pro_valor, "
                    + "ven_pro_quantidade "
                    + "FROM tbl_vendas_produtos");
            while (this.getResultSet().next()) {
                modelVendaProdutos = new ModelVendasProdutos();
                modelVendaProdutos.setVendaProdutosId(this.getResultSet().getInt(1));
                modelVendaProdutos.setProdutoId(this.getResultSet().getInt(2));
                modelVendaProdutos.setVendaId(this.getResultSet().getInt(3));
                modelVendaProdutos.setVenProValor(this.getResultSet().getInt(4));
                modelVendaProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendaProdutos;
    }

    public boolean salvarVendaProdutosDAO(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        try {
            this.conectar(); 
            int cont = pListaModelVendasProdutos.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO tbl_vendas_produtos ("
                        +"fk_vendas,"
                        + "fk_produto,"
                        + "ven_pro_valor,"
                        + "ven_pro_quantidade) VALUES ("
                        + "'" + pListaModelVendasProdutos.get(i).getVendaId() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getProdutoId()+"',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProValor() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProQuantidade() + "');"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
