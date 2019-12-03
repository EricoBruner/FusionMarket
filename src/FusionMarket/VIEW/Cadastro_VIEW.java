package FusionMarket.VIEW;

import FusionMarket.DAO.Cadastro_DAO;
import FusionMarket.MODEL.Produto_MODEL;
import FusionMarket.POJO.Cadastro_POJO;
import FusionMarket.POJO.Produto_POJO;
import java.awt.Color;

import javax.swing.JOptionPane;

public class Cadastro_VIEW extends javax.swing.JFrame {

    Cadastro_POJO cp = new Cadastro_POJO();
    Cadastro_DAO cd = new Cadastro_DAO();
    Produto_MODEL pm = new Produto_MODEL();
    
    public Cadastro_VIEW() 
    {
        initComponents();
        
        TNome.setEditable(true);
        TNome.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        TSenha.setEditable(true);
        TSenha.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        TEmail.setEditable(true);
        TEmail.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        TCpf_Cnpj.setEditable(true);
        TCpf_Cnpj.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        TEndereco.setEditable(true);
        TEndereco.setBackground(new Color(1.0f,1.0f,1.0f,0f));
    }
    
    public void Pegar_Dados()
    {
        cp.setNome(TNome.getText());
        cp.setSenha(TSenha.getText());
        cp.setEmail(TEmail.getText());
        cp.setCpf_cnpj(TCpf_Cnpj.getText());
        cp.setEndereco(TEndereco.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TNome = new javax.swing.JTextField();
        TSenha = new javax.swing.JTextField();
        TEmail = new javax.swing.JTextField();
        TCpf_Cnpj = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(330, 656));
        setMinimumSize(new java.awt.Dimension(330, 656));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(330, 656));
        setSize(new java.awt.Dimension(330, 656));
        getContentPane().setLayout(null);

        TNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TNome.setForeground(new java.awt.Color(255, 255, 255));
        TNome.setBorder(null);
        TNome.setCaretColor(new java.awt.Color(102, 255, 255));
        TNome.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        TNome.setOpaque(false);
        TNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomeActionPerformed(evt);
            }
        });
        getContentPane().add(TNome);
        TNome.setBounds(30, 170, 280, 40);

        TSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TSenha.setForeground(new java.awt.Color(255, 255, 255));
        TSenha.setBorder(null);
        TSenha.setMaximumSize(new java.awt.Dimension(290, 40));
        TSenha.setMinimumSize(new java.awt.Dimension(290, 40));
        TSenha.setOpaque(false);
        TSenha.setPreferredSize(new java.awt.Dimension(290, 35));
        getContentPane().add(TSenha);
        TSenha.setBounds(30, 258, 280, 35);

        TEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TEmail.setForeground(new java.awt.Color(255, 255, 255));
        TEmail.setBorder(null);
        TEmail.setMaximumSize(new java.awt.Dimension(290, 40));
        TEmail.setMinimumSize(new java.awt.Dimension(290, 40));
        TEmail.setOpaque(false);
        TEmail.setPreferredSize(new java.awt.Dimension(290, 35));
        getContentPane().add(TEmail);
        TEmail.setBounds(35, 340, 280, 35);

        TCpf_Cnpj.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TCpf_Cnpj.setForeground(new java.awt.Color(255, 255, 255));
        TCpf_Cnpj.setBorder(null);
        TCpf_Cnpj.setMaximumSize(new java.awt.Dimension(290, 35));
        TCpf_Cnpj.setMinimumSize(new java.awt.Dimension(290, 35));
        TCpf_Cnpj.setOpaque(false);
        TCpf_Cnpj.setPreferredSize(new java.awt.Dimension(290, 35));
        getContentPane().add(TCpf_Cnpj);
        TCpf_Cnpj.setBounds(35, 426, 280, 35);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 580, 100, 50);

        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 580, 160, 50);

        TEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TEndereco.setForeground(new java.awt.Color(255, 255, 255));
        TEndereco.setBorder(null);
        TEndereco.setMaximumSize(new java.awt.Dimension(288, 35));
        TEndereco.setMinimumSize(new java.awt.Dimension(288, 35));
        TEndereco.setOpaque(false);
        TEndereco.setPreferredSize(new java.awt.Dimension(288, 35));
        getContentPane().add(TEndereco);
        TEndereco.setBounds(34, 512, 280, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_Cadastro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 330, 656);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNomeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        Pegar_Dados();
        
        try
        {
            cd.inserir_usuario(cp);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, "O campo "+cp.getErro()+" é obrigatorio");
        }
        
        this.dispose();
        
        Login_VIEW tela = new Login_VIEW();
        tela.setVisible(true);
    }//GEN-LAST:event_jLabel3KeyPressed

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
            java.util.logging.Logger.getLogger(Cadastro_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Cadastro_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TCpf_Cnpj;
    private javax.swing.JTextField TEmail;
    private javax.swing.JTextField TEndereco;
    private javax.swing.JTextField TNome;
    private javax.swing.JTextField TSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
