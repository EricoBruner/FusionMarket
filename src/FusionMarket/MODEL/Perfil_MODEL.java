/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FusionMarket.MODEL;

import FusionMarket.POJO.Usuario_POJO;

/**
 *
 * @author cedup
 */
public class Perfil_MODEL {
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
            throw new IllegalArgumentException("Email");
        }
    
                 if (contato.getCpf().equals(""))
        {
            contato.setErro("CPF/CNPJ");
            throw new IllegalArgumentException("CPF/CNPJ");
        }
                 
                 if (contato.getEndereco().equals(""))
        {
            contato.setErro("Endereco");
            throw new IllegalArgumentException("Endereco");
        }

          
          
          }
}