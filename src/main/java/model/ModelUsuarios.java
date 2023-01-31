/*
 * Usuck nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Usuck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fernando
 */
public class ModelUsuarios {
    private int idUsuario;
    private String usuNome;
    private String usuLogin;
    private String usuSenha;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    
}
