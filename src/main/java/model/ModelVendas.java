/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;

/**
 *
 * @author marla
 */
public class ModelVendas {
    private int vendasId;
    private int clienteId;
    private Date venData;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;   

    public int getVendasId() {
        return vendasId;
    }

    public void setVendasId(int vendasId) {
        this.vendasId = vendasId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Date getVenData() {
        return venData;
    }

    public void setVenData(Date venData) {
        this.venData = venData;
    }

    public double getVenValorLiquido() {
        return venValorLiquido;
    }

    public void setVenValorLiquido(double venValorLiquido) {
        this.venValorLiquido = venValorLiquido;
    }

    public double getVenValorBruto() {
        return venValorBruto;
    }

    public void setVenValorBruto(double venValorBruto) {
        this.venValorBruto = venValorBruto;
    }

    public double getVenDesconto() {
        return venDesconto;
    }

    public void setVenDesconto(double venDesconto) {
        this.venDesconto = venDesconto;
    }
    
    
}
