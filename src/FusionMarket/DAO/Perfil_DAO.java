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
public class Perfil_DAO {
         public static ConPooling cn = ConPooling.getInstance();
        
         public Usuario_POJO buscar_contatos_unico(int codigo){
            Connection con = cn.getConnection();
            String sql = "select * from contato where id_usuario=?;";
            Usuario_POJO cp = new Usuario_POJO ();
            
                try {
           
                PreparedStatement p = con.prepareStatement(sql);
                
                p.setInt(1, codigo);
                ResultSet rs = p.executeQuery();
                rs.next();
                cp.setNome(rs.getString("nome"));
                cp.setCpf(rs.getInt("cpf_cnpj"));
                cp.setEmail(rs.getString("email"));
                cp.setEndereco(rs.getString("endereco"));
            
           
                } catch (SQLException e) {
           
                   
                }
        
             return cp;
         }
}         
       


