/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FusionMarket.DAO;

import FusionMarket.POJO.Historico_POJO;
import java.sql.Connection;

/**
 *
 * @author Win8.1
 */
public class Historico_DAO {
    
    public static ConPooling cn = ConPooling.getInstance();
    
    public void inserir_historico(Historico_POJO hitorico){
    
        Connection con = cn.getConnection();
        //int sql = "insert into historico(data_compra_venda, n_do_pedido, compra_venda,valor) values(?,?,?,?);";
        //String sql = "insert into historico(forma_de_pagamento,erro) values(?,?);";
    
    
    }
}
