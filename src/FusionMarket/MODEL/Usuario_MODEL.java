/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FusionMarket.MODEL;

import FusionMarket.POJO.Usuario_POJO;

/**
 *
 * @author metag
 */
public class Usuario_MODEL {
      public void verificar_campos (Usuario_POJO contato) throws IllegalAccessException
    {
        if (contato.getNome().equals(""))
        {
            contato.setErro("Nome");
            throw new IllegalArgumentException("Nome");
             
        }
        
        if (contato.getEmail().equals(""))
        {
            contato.setErro("Email");
            throw new IllegalAccessException("Email");
        
        }
        
           if (contato.getCpf().equals(""))
        {
            contato.setErro("CPF ou CNPJ");
            throw new IllegalAccessException("Email");
        
        }

       if (contato.getEndereco().equals(""))
        {
            contato.setErro("Endereço");
            throw new IllegalAccessException("Endereco");
        
        }
}
    
    }
    
    
 

