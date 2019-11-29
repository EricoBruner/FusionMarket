package FusionMarket.VIEW;

import FusionMarket.DAO.Usuario_DAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login_VIEW extends javax.swing.JFrame 
{
    public void entrar()
    {
        Usuario_DAO dao = new Usuario_DAO();
        String login=TNome.getText();
        String senha=TSenha.getText();
            
        if (dao.checkLogin(login, senha))
        {
            new TelaPrincipal_VIEW().setVisible(true);
            this.dispose();
                
        }
        else 
        {
            LMensagem.setText("Nome do usuario ou senha incorretos!");
            LMensagem.setForeground(Color.red);
        }
    }
    
    public Login_VIEW() 
    {
        initComponents();
        setSize(330, 425);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TNome = new javax.swing.JTextField();
        TSenha = new javax.swing.JPasswordField();
        LMensagem = new javax.swing.JLabel();
        LEntrar = new javax.swing.JLabel();
        LFechar = new javax.swing.JLabel();
        LMinimizar = new javax.swing.JLabel();
        LCadastrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(330, 450));
        setMinimumSize(new java.awt.Dimension(330, 450));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(330, 450));
        getContentPane().setLayout(null);

        TNome.setForeground(new java.awt.Color(255, 255, 255));
        TNome.setBorder(null);
        TNome.setOpaque(false);
        getContentPane().add(TNome);
        TNome.setBounds(30, 220, 280, 30);

        TSenha.setForeground(new java.awt.Color(255, 255, 255));
        TSenha.setBorder(null);
        TSenha.setOpaque(false);
        TSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(TSenha);
        TSenha.setBounds(30, 320, 270, 30);

        LMensagem.setForeground(new java.awt.Color(102, 102, 102));
        LMensagem.setText("Digite Login e senha para Entrar no Sistema.");
        getContentPane().add(LMensagem);
        LMensagem.setBounds(20, 360, 290, 14);

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

        LCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(LCadastrar);
        LCadastrar.setBounds(20, 380, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_Login.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 330, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFecharMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_LFecharMouseClicked

    private void LMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMinimizarMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_LMinimizarMouseClicked

    private void LEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEntrarMouseClicked
        
        entrar();
    
    }//GEN-LAST:event_LEntrarMouseClicked

    private void LCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCadastrarMouseClicked
        
        Cadastro_VIEW tela = new Cadastro_VIEW();
        tela.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LCadastrarMouseClicked

    private void TSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TSenhaKeyPressed
        
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) 
        {
        Toolkit.getDefaultToolkit().beep();   
        entrar();
        }
        
    }//GEN-LAST:event_TSenhaKeyPressed

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
    private javax.swing.JLabel LCadastrar;
    private javax.swing.JLabel LEntrar;
    private javax.swing.JLabel LFechar;
    private javax.swing.JLabel LMensagem;
    private javax.swing.JLabel LMinimizar;
    private javax.swing.JTextField TNome;
    private javax.swing.JPasswordField TSenha;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
