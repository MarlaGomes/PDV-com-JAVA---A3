/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoUsuarios;
import java.util.ArrayList;
import model.ModelUsuarios;

/**
 *
 * @author fernando
 */
public class ControllerUsuarios {
    private DaoUsuarios daoUsuarios = new DaoUsuarios();
    
    public int salvarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.salvarUsuariosDAO(pModelUsuarios);
    }
    
    public boolean excluiUsuariosController(int pIdUsuario){
        return this.daoUsuarios.excluirUsuarioDAO(pIdUsuario);
    }
    
    public boolean alterarUsuarioController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.alterarUsuarioDAO( pModelUsuarios);
    }
    
    public ModelUsuarios retornarUsuarioController(int pIdUsuario){
        return this.daoUsuarios.retornarUsuarioDAO(pIdUsuario);
    }
    
    public ArrayList<ModelUsuarios> retornarListaUsuarioController(){
        return this.daoUsuarios.retornarListaUsuariosDAO();
    }

    public void salvarUsuarioController(ModelUsuarios modelUsuarios) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //validar login e senha do usuário
    public boolean getValidarUsuarioController(ModelUsuarios pModelUsuario) {
        return this.daoUsuarios.getValidarUsuarioDAO(pModelUsuario);
        
    }

}
