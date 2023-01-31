/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author marla
 */
public class ControllerProdutos {

    private DaoProdutos daoProdutos = new DaoProdutos();

    public int salvarProdutosController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    public boolean excluirProdutosController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }

    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }

    public ModelProdutos retornarProdutoController(int pCodigo) {
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    public ModelProdutos retornarProdutoController(String pNomeProduto) {
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }

    public ArrayList<ModelProdutos> retornarListaProdutoController() {
        return this.daoProdutos.retornarListaProdutosDAO();
    }

    public void salvarProdutoController(ModelProdutos modelProdutos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> plistaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(plistaModelProdutos);
    }
}
