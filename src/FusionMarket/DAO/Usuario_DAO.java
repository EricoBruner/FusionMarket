/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FusionMarket.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.xml.transform.Result;

/**
 *
 * @author metag
 */
public class Usuario_DAO {
    
    public boolean checkLogin(String login, String senha) throws SQLException {
        
        Connection con= Connection.getConnection();
            PreparedStatement stmt=null;
            Result rs=null;
            boolean check = false;
            
            try {
               stmt=con.prepareStatement("SELECT * FROM usuario where id_usuario=? nome=? and senha=?");
               stmt.setString(1, login);
               stmt.setString(2, senha);
               
               rs=stmt.executeQuery();
               
               if (rs.next()){
               
                   check = true;
                   
               }
            }   catch (SQLException ex) {
                    Logger.getLogger(Usuario_DAO.class.getName()).log(Level.SEVERE, null, ex);
                
          
            return check;  
    }
