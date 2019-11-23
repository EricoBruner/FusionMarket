package FusionMarket.VIEW;

public class AdicionarProduto_VIEW extends javax.swing.JInternalFrame 
{

    public AdicionarProduto_VIEW() 
    {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JLabel();
        Publicar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        PainelAdicionarProduto = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Voltar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(22, 20, 60, 60);

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Cancelar.png"))); // NOI18N
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(750, 362, 160, 50);

        Publicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Publicar.png"))); // NOI18N
        Publicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublicarMouseClicked(evt);
            }
        });
        getContentPane().add(Publicar);
        Publicar.setBounds(750, 470, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_AdicionarImagem.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(750, 150, 160, 160);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(29, 150, 340, 40);

        jTextField2.setBorder(null);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(30, 256, 340, 40);

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(30, 367, 340, 40);

        jTextField4.setBorder(null);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(30, 476, 340, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Novo", "Usado", "Semi-novo" }));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setMaximumSize(new java.awt.Dimension(302, 50));
        jComboBox1.setMinimumSize(new java.awt.Dimension(302, 50));
        jComboBox1.setPreferredSize(new java.awt.Dimension(302, 50));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(413, 470, 302, 50);

        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(419, 148, 290, 260);

        PainelAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel _AdicionarProduto.png"))); // NOI18N
        getContentPane().add(PainelAdicionarProduto);
        PainelAdicionarProduto.setBounds(0, 0, 950, 550);

        setBounds(-1, -22, 966, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelarMouseClicked

    private void PublicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublicarMouseClicked
        //Colocar codigo para salvar dados no banco de dados
    }//GEN-LAST:event_PublicarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Colocar opção pro usuario colocar imagem
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel PainelAdicionarProduto;
    private javax.swing.JLabel Publicar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
