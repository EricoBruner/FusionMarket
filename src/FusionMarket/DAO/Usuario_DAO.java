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


/**
 *
 * @author metag
 */
public class Usuario_DAO 
{
    public static ConPooling cn = ConPooling.getInstance();
    
    public Usuario_POJO checkLogin(String login, String senha)  
    {   
        Connection con= cn.getConnection();
        
        PreparedStatement stmt=null;
        ResultSet rs=null;
        boolean check = false;
        Usuario_POJO up=new Usuario_POJO();
        try
        {
            stmt=con.prepareStatement("SELECT * FROM usuario where nome=? and senha=?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
               
            rs=stmt.executeQuery();
               
            while(rs.next())
               {
                up.setId(rs.getInt("id_usuario"));
                up.setNome(rs.getString("nome"));
                up.setEmail(rs.getString("email"));
                up.setEndereco(rs.getString("endereco"));
                up.setEndereco(""+rs.getInt("cpf_cnpj"));
               }
        }
        catch (SQLException ex) 
        {

        } 
        return up;  
    } 
}
    