/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;


/**
 *
 * @author marla
 */
public class ModelVendasClientes {
    private ModelVendas modelVendas;
    private ModelClientes modelClientes;
    private ArrayList<ModelVendasClientes> listaModelVendasClientes;    

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelClientes
     */
    public ModelClientes getModelClientes() {
        return modelClientes;
    }

    /**
     * @param modelClientes the modelClientes to set
     */
    public void setModelClientes(ModelClientes modelClientes) {
        this.modelClientes = modelClientes;
    }

    /**
     * @return the listaModelVendasClientes
     */
    public ArrayList<ModelVendasClientes> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param listaModelVendasClientes the listaModelVendasClientes to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasClientes> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
    
    
}
