/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendas;
import java.util.Date;

/**
 *
 * @author marla
 */
public class DaoVendas extends ConexaoMySql {

    public int salvarVendaDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + ") VALUES ("
                    + "'" + pModelVendas.getClienteId() + "',"
                    + "'" + pModelVendas.getVenData() + "',"
                    + "'" + pModelVendas.getVenValorLiquido() + "',"
                    + "'" + pModelVendas.getVenValorBruto() + "',"
                    + "'" + pModelVendas.getVenDesconto() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirVendaDAO(int pVendasId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tbl_vendas WHERE pk_id_vendas = '" + pVendasId + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarVendaDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas SET "
                    + "fk_cliente = '" + pModelVendas.getClienteId() + "',"
                    + "ven_data_venda = '" + pModelVendas.getVenData() + "',"
                    + "ven_valor_liquido = '" + pModelVendas.getVenValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelVendas.getVenValorBruto() + "',"
                    + "ven_desconto = '" + pModelVendas.getVenDesconto() + "' "
                    + "WHERE pk_id_vendas = '" + pModelVendas.getVendasId() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public ModelVendas retornarVendaDAO(int pVendasId){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_vendas, "
                    +"fk_cliente,"
                    +"ven_data_venda,"
                    +"ven_valor_liquido,"
                    +"ven_valor_bruto,"
                    + "ven_desconto "
                    + "FROM tbl_vendas WHERE pk_id_vendas = '" +pVendasId+"'");
        while (this.getResultSet().next()){
            modelVendas.setVendasId(this.getResultSet().getInt(1));
            modelVendas.setClienteId(this.getResultSet().getInt(2));
            modelVendas.setVenData(this.getResultSet().getDate(3));
            modelVendas.setVenValorLiquido(this.getResultSet().getInt(4));
            modelVendas.setVenValorBruto(this.getResultSet().getInt(5));
            modelVendas.setVenDesconto(this.getResultSet().getInt(6));
        }
    } catch (Exception e){
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    return modelVendas;
}
    public ArrayList<ModelVendas> retornarListaVendasDAO(){
        ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_vendas, "
                    +"fk_cliente,"
                    +"ven_data_venda,"
                    +"ven_valor_liquido,"
                    +"ven_valor_bruto,"
                    + "ven_desconto "
                    + "FROM tbl_vendas");
            while (this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setVendasId(this.getResultSet().getInt(1));
                modelVendas.setClienteId(this.getResultSet().getInt(2));
                modelVendas.setVenData(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getInt(4));
                modelVendas.setVenValorBruto(this.getResultSet().getInt(5));
                modelVendas.setVenDesconto(this.getResultSet().getInt(6));
                listaModelVendas.add(modelVendas);
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendas;
    }    
    
}
