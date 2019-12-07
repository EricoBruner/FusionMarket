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
            String sql = "insert into produto (titulo, preco, quantidade, categoria, descricao, id_usuario, foto) values (?,?,?,?,?,?,?);";
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
                p.setBytes(7, imgArray);
                p.executeUpdate();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }catch(IOException e){

            }
        }else
        {
            String sql = "insert into produto (titulo, preco, quantidade, categoria, descricao, id_usuario) values (?,?,?,?,?,?);";
            try
            {
                
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1, produto.getTitulo());
                p.setString(2, produto.getPreco());
                p.setInt(3, produto.getQuantidade());
                p.setString(4, produto.getCategoria());
                p.setString(5, produto.getDescricao());
                p.setInt(6, produto.getId_usuario());
               
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
                lista.add(produto);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
        }
        return lista;
        }
        public Produto_POJO buscar_produto_id(int id)
    {
        Produto_POJO pp = new Produto_POJO();
        Connection con = cn.getConnection();
        String sql = "select * from produto where id_produto=?;";
        try
        {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, id+"");
            ResultSet rs = p.executeQuery();
            while (rs.next())
            {
                pp.setId_produto(rs.getInt("id_produto"));
                pp.setTitulo(rs.getString("titulo"));
                pp.setPreco(rs.getString("preco"));
                pp.setCategoria(rs.getString("categoria"));
                pp.setQuantidade(rs.getInt("quantidade"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog( null, e ) ;
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
                lista.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
}

