/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FusionMarket.POJO;

/**
 *
 * @author Win8.1
 */
public class Historico_POJO {
    
    int data_compra_venda, n_do_pedido, compra_venda,valor;
    String forma_de_pagamento,erro;

    public int getData_compra_venda() {
        return data_compra_venda;
    }

    public void setData_compra_venda(int data_compra_venda) {
        this.data_compra_venda = data_compra_venda;
    }

    public int getN_do_pedido() {
        return n_do_pedido;
    }

    public void setN_do_pedido(int n_do_pedido) {
        this.n_do_pedido = n_do_pedido;
    }

    public int getCompra_venda() {
        return compra_venda;
    }

    public void setCompra_venda(int compra_venda) {
        this.compra_venda = compra_venda;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getForma_de_pagamento() {
        return forma_de_pagamento;
    }

    public void setForma_de_pagamento(String forma_de_pagamento) {
        this.forma_de_pagamento = forma_de_pagamento;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
    

}
