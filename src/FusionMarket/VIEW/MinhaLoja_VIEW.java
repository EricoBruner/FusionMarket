package FusionMarket.VIEW;

public class MinhaLoja_VIEW extends javax.swing.JFrame 
{
    public MinhaLoja_VIEW() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_Voltar = new javax.swing.JLabel();
        B_Adicionar = new javax.swing.JLabel();
        Paine_Minha_Loja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        B_Voltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        B_Voltar.setText(" Voltar");
        B_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Voltar);
        B_Voltar.setBounds(850, 10, 80, 37);

        B_Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Adicionar.png"))); // NOI18N
        B_Adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AdicionarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Adicionar);
        B_Adicionar.setBounds(80, 140, 110, 100);

        Paine_Minha_Loja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_Minha_Loja.png"))); // NOI18N
        getContentPane().add(Paine_Minha_Loja);
        Paine_Minha_Loja.setBounds(0, 0, 1010, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_B_VoltarMouseClicked

    private void B_AdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AdicionarMouseClicked
        AdicionarProduto_VIEW Tela_AdicionarProduto = new AdicionarProduto_VIEW();
        Tela_AdicionarProduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_AdicionarMouseClicked

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MinhaLoja_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhaLoja_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhaLoja_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaLoja_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MinhaLoja_VIEW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_Adicionar;
    private javax.swing.JLabel B_Voltar;
    private javax.swing.JLabel Paine_Minha_Loja;
    // End of variables declaration//GEN-END:variables
}
