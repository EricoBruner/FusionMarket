package FusionMarket.VIEW;

import FusionMarket.POJO.Usuario_POJO;
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ConfirmarDados_VIEW extends javax.swing.JInternalFrame 
{
    
    String tipo_pagamento = "vazio";
    
    public ConfirmarDados_VIEW(Usuario_POJO up) 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        LNome.setText(up.getNome());
        LEmail.setText(up.getEmail());
        LCpf.setText(up.getCpf());
        LEndereco.setText(up.getEndereco());
        
        LCartao.setBackground(new Color(255,0,0,60));
        LCartao.setVisible(false);
        LBoleto.setBackground(new Color(255,0,0,60));
        LBoleto.setVisible(false);
        
        Aviso.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LCpf = new javax.swing.JLabel();
        LEndereco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LCartao = new javax.swing.JLabel();
        LBoleto = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Aviso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 300, 180, 60);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 180, 170, 60);
        getContentPane().add(LNome);
        LNome.setBounds(510, 140, 400, 40);
        getContentPane().add(LEmail);
        LEmail.setBounds(508, 217, 400, 40);
        getContentPane().add(LCpf);
        LCpf.setBounds(512, 294, 400, 40);
        getContentPane().add(LEndereco);
        LEndereco.setBounds(513, 370, 400, 40);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(14, 14, 80, 60);

        LCartao.setBackground(new java.awt.Color(255, 0, 0));
        LCartao.setOpaque(true);
        LCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCartaoMouseClicked(evt);
            }
        });
        getContentPane().add(LCartao);
        LCartao.setBounds(93, 186, 169, 50);

        LBoleto.setBackground(new java.awt.Color(255, 0, 0));
        LBoleto.setOpaque(true);
        LBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBoletoMouseClicked(evt);
            }
        });
        getContentPane().add(LBoleto);
        LBoleto.setBounds(93, 303, 169, 51);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   1", "   2", "   3", "   4", "   5", "   6", "   8", "   9 ", "  10" }));
        jComboBox1.setBorder(null);
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(237, 412, 50, 38);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(742, 461, 168, 50);

        Aviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Aviso.setForeground(new java.awt.Color(255, 0, 0));
        Aviso.setText("Nenhum metodo de pagamento selecionado");
        getContentPane().add(Aviso);
        Aviso.setBounds(667, 440, 250, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_ConfirmarDados_VIEW.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCartaoMouseClicked
        
       
        
    }//GEN-LAST:event_LCartaoMouseClicked

    private void LBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBoletoMouseClicked
        
 
        
    }//GEN-LAST:event_LBoletoMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        LCartao.setVisible(true);
        LBoleto.setVisible(false);
        tipo_pagamento = "cartão"; 
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        LBoleto.setVisible(true);
        LCartao.setVisible(false);
        tipo_pagamento = "boleto";
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        if (tipo_pagamento=="vazio")
        {   
            Aviso.setVisible(true);
        }
        
        if (tipo_pagamento == "boleto")
        {
            PagamentoRealizado_VIEW aviso = new PagamentoRealizado_VIEW(tipo_pagamento);
            MaisVendidos_VIEW tela = new MaisVendidos_VIEW();
            TelaPrincipal_VIEW.Painel.removeAll();
            TelaPrincipal_VIEW.Painel.add(tela);
            TelaPrincipal_VIEW.Painel.add(aviso);
            tela.setVisible(true);
            tela.setVisible(true);    
        }
        
        if (tipo_pagamento == "cartão")
        {
            PagamentoRealizado_VIEW aviso = new PagamentoRealizado_VIEW(tipo_pagamento);
            MaisVendidos_VIEW tela = new MaisVendidos_VIEW();
            TelaPrincipal_VIEW.Painel.removeAll();
            TelaPrincipal_VIEW.Painel.add(tela);
            TelaPrincipal_VIEW.Painel.add(aviso);
            tela.setVisible(true);
            aviso.setVisible(true);    
        }
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aviso;
    private javax.swing.JLabel LBoleto;
    private javax.swing.JLabel LCartao;
    private javax.swing.JLabel LCpf;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEndereco;
    private javax.swing.JLabel LNome;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}