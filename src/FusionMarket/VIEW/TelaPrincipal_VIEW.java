package FusionMarket.VIEW;

import java.awt.Frame;
import javax.swing.JFrame;

public class TelaPrincipal_VIEW extends javax.swing.JFrame 
{
    public TelaPrincipal_VIEW() 
    {
        initComponents();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BotãoLoja = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Painel = new javax.swing.JDesktopPane();
        TelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Home_1.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jLabel2.setMaximumSize(new java.awt.Dimension(52, 52));
        jLabel2.setMinimumSize(new java.awt.Dimension(52, 52));
        jLabel2.setName(""); // NOI18N
        jLabel2.setNextFocusableComponent(TelaPrincipal);
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(52, 52));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(354, 52, 52, 52);

        BotãoLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Loja.png"))); // NOI18N
        BotãoLoja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotãoLoja.setMaximumSize(new java.awt.Dimension(53, 53));
        BotãoLoja.setMinimumSize(new java.awt.Dimension(53, 53));
        BotãoLoja.setPreferredSize(new java.awt.Dimension(53, 53));
        BotãoLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoLojaMouseClicked(evt);
            }
        });
        getContentPane().add(BotãoLoja);
        BotãoLoja.setBounds(503, 51, 53, 53);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Fechar_2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(18, 18));
        jLabel1.setMinimumSize(new java.awt.Dimension(18, 18));
        jLabel1.setPreferredSize(new java.awt.Dimension(18, 18));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1341, 6, 18, 18);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Minimizar_1.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(18, 18));
        jLabel4.setMinimumSize(new java.awt.Dimension(18, 18));
        jLabel4.setPreferredSize(new java.awt.Dimension(18, 18));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1319, 6, 18, 18);

        Painel.setMaximumSize(new java.awt.Dimension(950, 550));
        Painel.setMinimumSize(new java.awt.Dimension(950, 550));
        Painel.setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().add(Painel);
        Painel.setBounds(353, 154, 950, 550);

        TelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_TelaPrincipal.png"))); // NOI18N
        getContentPane().add(TelaPrincipal);
        TelaPrincipal.setBounds(0, -30, 1366, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoLojaMouseClicked
        MinhaLoja_VIEW Tela_MinhaLoja = new MinhaLoja_VIEW();
        Painel.add(Tela_MinhaLoja);
        Tela_MinhaLoja.setVisible(true);
    }//GEN-LAST:event_BotãoLojaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaPrincipal_VIEW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotãoLoja;
    public static javax.swing.JDesktopPane Painel;
    private javax.swing.JLabel TelaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
