package FusionMarket.DAO;

import FusionMarket.POJO.Produto_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Produto_DAO 
{
    public static ConPooling cn = ConPooling.getInstance();
    
    public void inserir_produto(Produto_POJO produto)
    {
        Connection con = cn.getConnection();
        String sql = "insert into produto (titulo, preco, quantidade, categoria, descricao) values (?,?,?,?,?);";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, produto.getTitulo());
            p.setString(2, produto.getPreco());
            p.setInt(3, produto.getQuantidade());
            p.setString(4, produto.getCategoria());
            p.setString(5, produto.getDescricao());
            
            p.executeUpdate();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
