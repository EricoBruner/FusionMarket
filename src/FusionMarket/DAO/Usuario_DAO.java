package FusionMarket.DAO;

import FusionMarket.POJO.Produto_POJO;
import FusionMarket.POJO.Usuario_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuario_DAO 
{
    public static ConPooling cn = ConPooling.getInstance();
    
    public Usuario_POJO checkLogin(String login, String senha)  
    {   
        Connection con= cn.getConnection();
        
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Usuario_POJO up=new Usuario_POJO();
        try
        {
            stmt=con.prepareStatement("SELECT * FROM usuario where nome=? and senha=?;");
            stmt.setString(1, login);
            stmt.setString(2, senha);
               
            rs=stmt.executeQuery();
               
            while(rs.next())
               {
                   
                up.setId(rs.getInt("id_usuario"));
                up.setNome(rs.getString("nome"));
                up.setEmail(rs.getString("email"));
                up.setCpf(rs.getInt("cpf_cnpj"));
                up.setEndereco(rs.getString("endereco"));
                
               }
        }
        catch (SQLException ex) 
        {

        } 
        return up;  
    } 
public Usuario_POJO buscar_usuario_id(int id)
    {
        Usuario_POJO pp = new Usuario_POJO();
        Connection con = cn.getConnection();
        String sql = "select * from usuario where id_usuario=?;";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, id+"");
            ResultSet rs = p.executeQuery();
            while (rs.next())
            {
                pp.setNome(rs.getString("nome"));
                pp.setEmail(rs.getString("email"));
                pp.setCpf(rs.getInt("cpf_cnpj"));
                pp.setEndereco(rs.getString("endereco"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
        }
        return pp;
        }
}
         
 
   