package FusionMarket.DAO;

import FusionMarket.POJO.Produto_POJO;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Produto_DAO 
{
    public static ConPooling cn = ConPooling.getInstance();
    
    public void inserir_produto(Produto_POJO produto, String ruta,int adfoto)
    {
        Connection con = cn.getConnection();
        //**************************
        FileInputStream fi = null;
        PreparedStatement ps = null;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        //**************************
        if(adfoto==1)
        {
            String sql = "insert into produto (titulo, preco, quantidade, categoria, descricao, id_usuario, condicao, foto) values (?,?,?,?,?,?,?,?);";
            try
            {
                //*************************
                File file = new File(ruta);
                //fi = new FileInputStream(file);
                BufferedImage img = ImageIO.read( file );
                BufferedImage aux = new BufferedImage(164, 165, img.getType());
                Graphics2D g = aux.createGraphics();
                AffineTransform at = AffineTransform.getScaleInstance((double) 164 / img.getWidth(), (double) 165 / img.getHeight());//cria a transformacao
                g.drawRenderedImage(img, at);
                ImageIO.write( aux, "png", b ); 
                byte[] imgArray = b.toByteArray(); 
                //******************
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1, produto.getTitulo());
                p.setString(2, produto.getPreco());
                p.setInt(3, produto.getQuantidade());
                p.setString(4, produto.getCategoria());
                p.setString(5, produto.getDescricao());
                p.setInt(6, produto.getId_usuario());
                p.setString(7, produto.getCondicao());
                p.setBytes(8, imgArray);
                p.executeUpdate();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }catch(IOException e){

            }
        }else
        {
            String sql = "insert into produto (titulo, preco, quantidade, categoria, descricao, id_usuario, condicao) values (?,?,?,?,?,?,?);";
            try
            {
                
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1, produto.getTitulo());
                p.setString(2, produto.getPreco());
                p.setInt(3, produto.getQuantidade());
                p.setString(4, produto.getCategoria());
                p.setString(5, produto.getDescricao());
                p.setInt(6, produto.getId_usuario());
                p.setString(7, produto.getCondicao());
               
                p.executeUpdate();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
           
        }
    }
    
    public List buscar_produto_nome()
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
                produto.setDescricao(rs.getString("descricao"));
                produto.setCondicao(rs.getString("condicao"));
                lista.add(produto);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
        }
        return lista;
        }
    public List buscar_produto(int id)
    {
        List lista = new ArrayList();
        Connection con = cn.getConnection();
        String sql = "select * from produto where id_usuario=?;";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            while (rs.next())
            {
                Produto_POJO produto = new Produto_POJO();
                produto.setId_produto(rs.getInt("id_produto"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setPreco(rs.getString("preco"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setCondicao(rs.getString("condicao"));
                lista.add(produto);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
        }
        return lista;
        }
    
        public Produto_POJO buscar_produto_id(String id)  
    {   
        Connection con= cn.getConnection();
        
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Produto_POJO pp=new Produto_POJO();
        try
        {
            stmt=con.prepareStatement("SELECT * FROM produto where id_produto=?");
            stmt.setString(1, id);
               
            rs=stmt.executeQuery();
               
            while(rs.next())
               {
                   
                pp.setTitulo(rs.getString("titulo"));
                pp.setCondicao(rs.getString("condicao"));
                pp.setDescricao(rs.getString("descricao"));
                pp.setPreco(rs.getString("preco"));
                pp.setQuantidade(rs.getInt("quantidade"));
                pp.setId_usuario(rs.getInt("id_usuario"));
                pp.setId_produto(rs.getInt("id_produto"));
                pp.setCategoria(rs.getString("categoria"));
                
               }
        }
        catch (SQLException ex) 
        {

        } 
        return pp;  
    }   
        
        public List buscar_produto_like(String nome){
        List lista = new ArrayList();
        Connection con = cn.getConnection();
        String sql = "select * from produto where titulo like ?;";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, nome+"%");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                Produto_POJO produto = new Produto_POJO();
                produto.setId_produto(rs.getInt("id_produto"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getString("preco"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setCondicao(rs.getString("condicao"));
                lista.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
    
        public void alterar_produto(Produto_POJO produto)
    {
        Connection con = cn.getConnection();
        String sql = "update produto set titulo = ?, preco = ?, quantidade = ?, categoria = ?, descricao = ?, condicao = ? where id_produto = ?;";
            try
            {
                
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1, produto.getTitulo());
                p.setString(2, produto.getPreco());
                p.setInt(3, produto.getQuantidade());
                p.setString(4, produto.getCategoria());
                p.setString(5, produto.getDescricao());
                p.setString(6, produto.getCondicao());
                p.setInt(7, produto.getId_produto());
               
                p.executeUpdate();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }
    
        public void excluir_produto(int id)
    {
        Connection con = cn.getConnection();
        String sql = "delete from produto where id_produto = ?;";
            try
            {    
                PreparedStatement p = con.prepareStatement(sql);
                p.setInt(1, id); 
                p.executeUpdate();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }
        
    public void retirar_produto_comprado(Produto_POJO produto, int nova_quantidade)
    {
        Connection con = cn.getConnection();
        String sql = "update produto set quantidade = ? where id_produto = ?;";
            try
            {
                
                PreparedStatement p = con.prepareStatement(sql);
                p.setInt(3, nova_quantidade);
                p.setInt(7, produto.getId_produto());
               
                p.executeUpdate();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }
}

