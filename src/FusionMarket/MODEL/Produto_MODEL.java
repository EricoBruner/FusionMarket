package FusionMarket.MODEL;

import FusionMarket.POJO.Produto_POJO;

public class Produto_MODEL 
{
    public void Verificar_Campos(Produto_POJO produto) throws IllegalArgumentException
    {
        if(produto.getTitulo().equals(""))
        {
            produto.setErro("Titulo");
            throw new IllegalArgumentException("Titulo");
        }
        
        if(produto.getCategoria().equals(""))
        {
            produto.setErro("Caregoria");
            throw new IllegalArgumentException("Categoria");
        }
        
        if(produto.getPreco().equals(""))
        {
            produto.setErro("Preço");
            throw new IllegalArgumentException("Preço");
        }
        
        if(produto.getDescricao().equals(""))
        {
            produto.setErro("Descrição");
            throw new IllegalArgumentException("Descrição");
        }
        
        if(produto.getCondicao().equals(""))
        {
            produto.setErro("Condição");
            throw new IllegalArgumentException("Condição");
        }
    }
}
