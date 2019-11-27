package FusionMarket.VIEW;

import static FusionMarket.VIEW.TelaPrincipal_VIEW.Painel;
import javax.swing.JFrame;

public class Login_VIEW extends javax.swing.JFrame {

    public Login_VIEW() 
    {
       initComponents();
        setSize(330, 425);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LEntrar = new javax.swing.JLabel();
        LFechar = new javax.swing.JLabel();
        LMinimizar = new javax.swing.JLabel();
        LCadastro = new javax.swing.JLabel();
        TSenha = new javax.swing.JLabel();
        TLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(330, 450));
        setMinimumSize(new java.awt.Dimension(330, 450));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(330, 450));
        getContentPane().setLayout(null);

        LEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEntrarMouseClicked(evt);
            }
        });
        getContentPane().add(LEntrar);
        LEntrar.setBounds(200, 380, 110, 50);

        LFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Fechar_2.png"))); // NOI18N
        LFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LFecharMouseClicked(evt);
            }
        });
        getContentPane().add(LFechar);
        LFechar.setBounds(300, 10, 20, 20);

        LMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Minimizar_1.png"))); // NOI18N
        LMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(LMinimizar);
        LMinimizar.setBounds(270, 10, 20, 20);

        LCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCadastroMouseClicked(evt);
            }
        });
        getContentPane().add(LCadastro);
        LCadastro.setBounds(20, 380, 160, 50);
        getContentPane().add(TSenha);
        TSenha.setBounds(20, 320, 290, 30);
        getContentPane().add(TLogin);
        TLogin.setBounds(20, 220, 290, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_Login.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 330, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFecharMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_LFecharMouseClicked

    private void LMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);

        // TODO add your handling code here:
    }//GEN-LAST:event_LMinimizarMouseClicked

    private void LEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEntrarMouseClicked
     
    Usuario_DAO dao = new Usuari();
        try {
            if (dao.checkLogin(TLogin.getText(), TSenha.getText())){
                new TelaPrincipal_VIEW().setVisible(true);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Nome do usuario ou senha incorretos!");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }                                    

    private void LCadastroMouseClicked(java.awt.event.MouseEvent evt) {                                       

        Cadastro_VIEW Tela = new Cadastro_VIEW();
        Tela.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_LEntrarMouseClicked

    private void LCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCadastroMouseClicked
          
        Cadastro_VIEW Tela = new Cadastro_VIEW();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LCadastroMouseClicked

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
            java.util.logging.Logger.getLogger(Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Login_VIEW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCadastro;
    private javax.swing.JLabel LEntrar;
    private javax.swing.JLabel LFechar;
    private javax.swing.JLabel LMinimizar;
    private javax.swing.JLabel TLogin;
    private javax.swing.JLabel TSenha;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
