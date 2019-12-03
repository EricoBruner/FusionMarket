/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FusionMarket.DAO;

import FusionMarket.POJO.Usuario_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author metag
 */
public class Usuario_DAO 
{
    public static ConPooling cn = ConPooling.getInstance();
    public boolean checkLogin(String login, String senha)  {
        
        Connection con= cn.getConnection();
            PreparedStatement stmt=null;
            ResultSet rs=null;
            boolean check = false;
            
            try {
               stmt=con.prepareStatement("SELECT * FROM usuario where nome=? and senha=?");
               stmt.setString(1, login);
               stmt.setString(2, senha);
               
               rs=stmt.executeQuery();
               
               if (rs.next()){
               
                   check = true;
                   
               }
            }   catch (SQLException ex) {
                    //Logger.getLogger(Usuario_DAO.class.getName()).log(Level.SEVERE, null, ex);
            } 
          return check;  
        } 
    public void inserir_usuario(Usuario_POJO usuario)
    {
        Connection con = cn.getConnection();
        String sql = "insert into usuario (nome, cpf_cnpj, email, senha) values (?,?,?,?);";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, usuario.getNome());
            p.setString(2, usuario.getCpf_cnpj());
            p.setString(3, usuario.getEmail());
            p.setString(4, usuario.getSenha());
            
            p.executeUpdate();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
    