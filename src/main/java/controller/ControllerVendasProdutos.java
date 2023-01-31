/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVendasProdutos;
import java.util.ArrayList;
import model.ModelVendasProdutos;

/**
 *
 * @author marla
 */
public class ControllerVendasProdutos {

    private DaoVendasProdutos daoVendaProdutos = new DaoVendasProdutos();

    public int salvarVendaProdutosController(ModelVendasProdutos pModelVendaProdutos) {
        return this.daoVendaProdutos.salvarVendaProdutosDAO(pModelVendaProdutos);
    }

    public boolean excluirVendaProdutosController(int pCodigo) {
        return this.daoVendaProdutos.excluirVendaProdutosDAO(pCodigo);
    }

    public boolean alterarProdutoController(ModelVendasProdutos pModelVendaProdutos) {
        return this.daoVendaProdutos.alterarVendaProdutosDAO(pModelVendaProdutos);
    }

    public ModelVendasProdutos retornarVendaProdutosController(int pCodigo) {
        return this.daoVendaProdutos.retornarVendaProdutosDAO(pCodigo);
    }

    public ArrayList<ModelVendasProdutos> retornarListaVendaProdutosController() {
        return this.daoVendaProdutos.retornarListaVendasProdutosDAO();
    }
    
    public boolean salvarVendaProdutosController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos){
        return this.daoVendaProdutos.salvarVendaProdutosDAO(pListaModelVendasProdutos);
    }

}
