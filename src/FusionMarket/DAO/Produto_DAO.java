package FusionMarket.DAO;

import FusionMarket.POJO.Produto_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List buscar_produto()
    {
        List lista = new ArrayList();
        Connection con = cn.getConnection();
        String sql = "select * from produto where titulo like ?;";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, "%");
            ResultSet rs = p.executeQuery();
            while (rs.next())
            {
                Produto_POJO produto = new Produto_POJO();
                produto.setTitulo(rs.getString("titulo"));
                produto.setPreco(rs.getString("preco"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setQuantidade(rs.getInt("quantidade"));
                lista.add(produto);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
        }
        return lista;
        }
    
        public List buscar_produto_unico()
    {
        List lista = new ArrayList();
        Connection con = cn.getConnection();
        String sql = "select * from produto where id_usuario like ?;";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, "%");
            ResultSet rs = p.executeQuery();
            while (rs.next())
            {
                Produto_POJO produto = new Produto_POJO();
                produto.setTitulo(rs.getString("titulo"));
                produto.setPreco(rs.getString("preco"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setQuantidade(rs.getInt("quantidade"));
                lista.add(produto);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
        }
        return lista;
        }   
}

