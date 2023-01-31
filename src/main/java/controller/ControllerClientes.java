/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoClientes;
import java.util.ArrayList;
import model.ModelClientes;

/**
 *
 * @author marla
 */
public class ControllerClientes {
    private DaoClientes daoClientes = new DaoClientes();
    
    public int salvarClientesController(ModelClientes pModelClientes){
        return this.daoClientes.salvarClientesDAO(pModelClientes);
    }
    
    public boolean excluiClientesController(int pIdCliente){
        return this.daoClientes.excluirClienteDAO(pIdCliente);
    }
    
    public boolean alterarClienteController(ModelClientes pModelClientes){
        return this.daoClientes.alterarClienteDAO( pModelClientes);
    }
    
    public ModelClientes retornarClienteController(int pIdCliente){
        return this.daoClientes.retornarClienteDAO(pIdCliente);
    }
    
    public ArrayList<ModelClientes> retornarListaClienteController(){
        return this.daoClientes.retornarListaClientesDAO();
    }
    
        public ModelClientes retornarNomeClienteController(String pNomeCliente){
        return this.daoClientes.retornarClienteDAO(pNomeCliente);
    }

    public void salvarClienteController(ModelClientes modelClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
