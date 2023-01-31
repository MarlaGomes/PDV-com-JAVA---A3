/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoVendasClientes;
import java.util.ArrayList;
import model.ModelVendasClientes;
/**
 *
 * @author marla
 */
public class ControllerVendasClientes {
    private DaoVendasClientes daoVendasClientes = new DaoVendasClientes();
     public ArrayList<ModelVendasClientes> retornarListaVendasClientesController(){
        return this.daoVendasClientes.retornarListaVendasClientesDAO();
    }
     
     
    
}
