/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

/**
 *
 * @author ferna
 */
public class ControllerProdutosVendasProdutos {
    private DaoProdutosVendasProdutos dAOProutosVendasProdutos = new DaoProdutosVendasProdutos();
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda){
        return this.dAOProutosVendasProdutos.getListaProdutosVendasProdutosDao(pCodigoVenda);
        
    }
    
}
