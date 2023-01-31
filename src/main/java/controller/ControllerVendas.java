/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoVendas;
import model.ModelVendas;
import java.util.ArrayList;

/**
 *
 * @author marla
 */
public class ControllerVendas {
    private DaoVendas daoVendas = new DaoVendas();
    
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendaDAO(pModelVendas);
    }
    
    public boolean excluirVendasController(int pCodigo){
        return this.daoVendas.excluirVendaDAO(pCodigo);
    }
    
    public boolean alterarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.alterarVendaDAO(pModelVendas);
    }
    
    public ModelVendas retornarVendaController(int pCodigo){
        return this.daoVendas.retornarVendaDAO(pCodigo);
    }
    
    public ArrayList<ModelVendas> retornarListaVendasController(){
        return this.daoVendas.retornarListaVendasDAO();
    }
    
    public void salvarVendaController(ModelVendas modelVendas){
        throw new UnsupportedOperationException("Not Supported yet.");
    }
}
