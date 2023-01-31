/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marla
 */
public class ModelVendasProdutos {
    private int vendaProdutosId;
    private int produtoId;
    private int vendaId;
    private double venProValor;
    private int venProQuantidade;  
    
    public ModelVendasProdutos(){}

    public int getVendaProdutosId() {
        return vendaProdutosId;
    }

    public void setVendaProdutosId(int vendaProdutosId) {
        this.vendaProdutosId = vendaProdutosId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public double getVenProValor() {
        return venProValor;
    }

    public void setVenProValor(double venProValor) {
        this.venProValor = venProValor;
    }

    public int getVenProQuantidade() {
        return venProQuantidade;
    }

    public void setVenProQuantidade(double venProQuantidade) {
        this.venProQuantidade = (int)venProQuantidade;
    }
    
    
    
}
