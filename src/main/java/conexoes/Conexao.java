/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexoes;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ferna
 */
public class Conexao {
   public Connection conecta(){
       Connection conn = null;
       try{
           String url = "jdbc:mysql://localhost/dbpdva3?user=root&password=";
           conn = DriverManager.getConnection(url);
       }catch (SQLException erro){
           
       }
       return conn;
   }
    
}
