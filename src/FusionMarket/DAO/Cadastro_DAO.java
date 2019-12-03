package FusionMarket.DAO;

import FusionMarket.POJO.Cadastro_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cadastro_DAO 
{
    public static ConPooling cn = ConPooling.getInstance();
    
    public void inserir_usuario(Cadastro_POJO usuario)
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
