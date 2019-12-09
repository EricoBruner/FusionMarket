package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.POJO.Produto_POJO;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AlterarProduto_VIEW extends javax.swing.JInternalFrame {
    
    String Descricao;
    
    Produto_POJO pp = new Produto_POJO();
    Produto_DAO pd = new Produto_DAO();
    
    int Id_usuario;
    
    int Id_produto;
    
    public void Pegar_Dados_Nova_Descricao()
    {
        pp.setTitulo(TTitulo.getText());
        pp.setPreco(TPreco.getText());
        pp.setQuantidade(Integer.parseInt(TQuantidade.getText()));
        String Descricao = "<html>"+Descricao1.getText();
        Descricao = Descricao+"<p>"+ Descricao2.getText();
        Descricao = Descricao+"<p>"+ Descricao3.getText();
        Descricao = Descricao+"<p>"+ Descricao4.getText();
        Descricao = Descricao+"<p>"+ Descricao5.getText();
        Descricao = Descricao+"<p>"+ Descricao6.getText()+"<html>";
        pp.setDescricao(Descricao);
        pp.setCategoria(TCategoria.getText());
        pp.setCondicao(""+TCondicao.getSelectedItem());
        pp.setId_usuario(Id_usuario);
        pp.setId_produto(Id_produto);
    }
        public void Pegar_Dados()
    {
        pp.setTitulo(TTitulo.getText());
        pp.setPreco(TPreco.getText());
        pp.setQuantidade(Integer.parseInt(TQuantidade.getText()));
        pp.setDescricao(TDescricao.getText());
        pp.setCategoria(TCategoria.getText());
        pp.setCondicao(""+TCondicao.getSelectedItem());
        pp.setId_usuario(Id_usuario);
        pp.setId_produto(Id_produto);
    }
    
    public AlterarProduto_VIEW(Produto_POJO produto, int Id) 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        Id_produto = produto.getId_produto();
        
        TTitulo.setText(produto.getTitulo());
        
        Id_usuario = Id;
        
        Descricao = "Sem_mudança";
        
        String cond = produto.getCondicao();
        int condicao = 0;
        
        if (cond .equals ("Novo"))
        {
            condicao = 0;
        }
        
        if(cond .equals("Usado"))
        {   
            condicao = 1;
        }
        
        if(cond .equals("Semi-novo"))
        {
            condicao = 2;
        }
        
        TCondicao.setSelectedIndex(condicao);
        TCategoria.setText(produto.getCategoria());
        TQuantidade.setText(""+produto.getQuantidade());
        TPreco.setText(produto.getPreco());
        TDescricao.setText(produto.getDescricao());
        
        Icon1.setVisible(false);Icon2.setVisible(false);Icon3.setVisible(false);Icon4.setVisible(false);Icon5.setVisible(false);Icon6.setVisible(false);Icon7.setVisible(false);
        Descricao1.setVisible(false);Descricao2.setVisible(false);Descricao3.setVisible(false);Descricao4.setVisible(false);Descricao5.setVisible(false);Descricao6.setVisible(false);
        LCancelar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTitulo = new javax.swing.JTextField();
        TCategoria = new javax.swing.JTextField();
        TPreco = new javax.swing.JTextField();
        TQuantidade = new javax.swing.JTextField();
        TCondicao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LNovaDescricao = new javax.swing.JLabel();
        TDescricao = new javax.swing.JLabel();
        LCancelar = new javax.swing.JLabel();
        Icon1 = new javax.swing.JLabel();
        Icon2 = new javax.swing.JLabel();
        Icon3 = new javax.swing.JLabel();
        Icon4 = new javax.swing.JLabel();
        Icon5 = new javax.swing.JLabel();
        Icon6 = new javax.swing.JLabel();
        Icon7 = new javax.swing.JLabel();
        Descricao1 = new javax.swing.JTextField();
        Descricao2 = new javax.swing.JTextField();
        Descricao3 = new javax.swing.JTextField();
        Descricao4 = new javax.swing.JTextField();
        Descricao5 = new javax.swing.JTextField();
        Descricao6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        TTitulo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        TTitulo.setBorder(null);
        TTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTituloActionPerformed(evt);
            }
        });
        getContentPane().add(TTitulo);
        TTitulo.setBounds(29, 150, 340, 40);

        TCategoria.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        TCategoria.setBorder(null);
        getContentPane().add(TCategoria);
        TCategoria.setBounds(30, 256, 340, 40);

        TPreco.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        TPreco.setBorder(null);
        TPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(TPreco);
        TPreco.setBounds(30, 367, 340, 40);

        TQuantidade.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TQuantidade.setBorder(null);
        getContentPane().add(TQuantidade);
        TQuantidade.setBounds(30, 476, 340, 40);

        TCondicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Novo", "Usado", "Semi-novo" }));
        TCondicao.setLightWeightPopupEnabled(false);
        TCondicao.setMaximumSize(new java.awt.Dimension(302, 50));
        TCondicao.setMinimumSize(new java.awt.Dimension(302, 50));
        TCondicao.setPreferredSize(new java.awt.Dimension(302, 50));
        getContentPane().add(TCondicao);
        TCondicao.setBounds(413, 470, 302, 50);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(17, 16, 73, 63);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(746, 362, 170, 50);

        LNovaDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNovaDescricao.setForeground(new java.awt.Color(102, 0, 0));
        LNovaDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LNovaDescricao.setText("NOVA DESCRIÇÃO");
        LNovaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LNovaDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LNovaDescricaoMouseClicked(evt);
            }
        });
        getContentPane().add(LNovaDescricao);
        LNovaDescricao.setBounds(589, 376, 120, 30);

        TDescricao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(TDescricao);
        TDescricao.setBounds(430, 150, 280, 260);

        LCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LCancelar.setForeground(new java.awt.Color(102, 0, 0));
        LCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LCancelar.setText("Cancelar");
        LCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(LCancelar);
        LCancelar.setBounds(589, 376, 120, 30);

        Icon1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon1.setText("-");
        getContentPane().add(Icon1);
        Icon1.setBounds(420, 150, 20, 22);

        Icon2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon2.setText("-");
        getContentPane().add(Icon2);
        Icon2.setBounds(420, 190, 20, 22);

        Icon3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon3.setText("-");
        getContentPane().add(Icon3);
        Icon3.setBounds(420, 227, 20, 22);

        Icon4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon4.setText("-");
        getContentPane().add(Icon4);
        Icon4.setBounds(420, 265, 20, 22);

        Icon5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon5.setText("-");
        getContentPane().add(Icon5);
        Icon5.setBounds(420, 304, 20, 22);

        Icon6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon6.setText("-");
        getContentPane().add(Icon6);
        Icon6.setBounds(420, 344, 20, 22);

        Icon7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Icon7.setText("-");
        getContentPane().add(Icon7);
        Icon7.setBounds(420, 383, 20, 22);

        Descricao1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Descricao1.setBorder(null);
        Descricao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descricao1ActionPerformed(evt);
            }
        });
        getContentPane().add(Descricao1);
        Descricao1.setBounds(430, 148, 280, 30);

        Descricao2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Descricao2.setBorder(null);
        getContentPane().add(Descricao2);
        Descricao2.setBounds(430, 186, 280, 30);

        Descricao3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Descricao3.setBorder(null);
        getContentPane().add(Descricao3);
        Descricao3.setBounds(430, 224, 280, 30);

        Descricao4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Descricao4.setBorder(null);
        getContentPane().add(Descricao4);
        Descricao4.setBounds(430, 262, 280, 30);

        Descricao5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Descricao5.setBorder(null);
        getContentPane().add(Descricao5);
        Descricao5.setBounds(430, 301, 280, 30);

        Descricao6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Descricao6.setBorder(null);
        getContentPane().add(Descricao6);
        Descricao6.setBounds(430, 340, 280, 30);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(747, 469, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_EditarProduto.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTituloActionPerformed

    private void TPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPrecoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LNovaDescricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LNovaDescricaoMouseClicked
        
        TDescricao.setVisible(false);
        LNovaDescricao.setVisible(false);
        Icon1.setVisible(true);Icon2.setVisible(true);Icon3.setVisible(true);Icon4.setVisible(true);Icon5.setVisible(true);Icon6.setVisible(true);Icon7.setVisible(true);
        Descricao1.setVisible(true);Descricao2.setVisible(true);Descricao3.setVisible(true);Descricao4.setVisible(true);Descricao5.setVisible(true);Descricao6.setVisible(true);
        LCancelar.setVisible(true);
        Descricao = "Nova_mudança";
        
    }//GEN-LAST:event_LNovaDescricaoMouseClicked

    private void LCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCancelarMouseClicked
        
        Icon1.setVisible(false);Icon2.setVisible(false);Icon3.setVisible(false);Icon4.setVisible(false);Icon5.setVisible(false);Icon6.setVisible(false);Icon7.setVisible(false);
        Descricao1.setVisible(false);Descricao2.setVisible(false);Descricao3.setVisible(false);Descricao4.setVisible(false);Descricao5.setVisible(false);Descricao6.setVisible(false);
        TDescricao.setVisible(true);
        LNovaDescricao.setVisible(true);
        LCancelar.setVisible(false);
        Descricao = "Sem_mudança";
        
    }//GEN-LAST:event_LCancelarMouseClicked

    private void Descricao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descricao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Descricao1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        if (Descricao.equals("Nova_mudança"))
        {
            Pegar_Dados_Nova_Descricao();
            pd.alterar_produto(pp);
            
            TelaPrincipal_VIEW.Painel.removeAll();
            MinhaLoja_VIEW tela = new MinhaLoja_VIEW(Id_usuario);
            TelaPrincipal_VIEW.Painel.add(tela);
            tela.setVisible(true);
            
        }
        
        if(Descricao.equals("Sem_mudança"))
        {
            Pegar_Dados();
            pd.alterar_produto(pp);
            
            TelaPrincipal_VIEW.Painel.removeAll();
            MinhaLoja_VIEW tela = new MinhaLoja_VIEW(Id_usuario);
            TelaPrincipal_VIEW.Painel.add(tela);
            tela.setVisible(true);
            
        }
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descricao1;
    private javax.swing.JTextField Descricao2;
    private javax.swing.JTextField Descricao3;
    private javax.swing.JTextField Descricao4;
    private javax.swing.JTextField Descricao5;
    private javax.swing.JTextField Descricao6;
    private javax.swing.JLabel Icon1;
    private javax.swing.JLabel Icon2;
    private javax.swing.JLabel Icon3;
    private javax.swing.JLabel Icon4;
    private javax.swing.JLabel Icon5;
    private javax.swing.JLabel Icon6;
    private javax.swing.JLabel Icon7;
    private javax.swing.JLabel LCancelar;
    private javax.swing.JLabel LNovaDescricao;
    private javax.swing.JTextField TCategoria;
    private javax.swing.JComboBox TCondicao;
    private javax.swing.JLabel TDescricao;
    private javax.swing.JTextField TPreco;
    private javax.swing.JTextField TQuantidade;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
