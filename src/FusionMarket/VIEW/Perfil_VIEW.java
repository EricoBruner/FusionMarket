package FusionMarket.VIEW;

import FusionMarket.DAO.Perfil_DAO;
import FusionMarket.DAO.Usuario_DAO;
import FusionMarket.MODEL.Perfil_MODEL;
import FusionMarket.MODEL.Usuario_MODEL;
import FusionMarket.POJO.Usuario_POJO;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Perfil_VIEW extends javax.swing.JInternalFrame {

            Perfil_DAO cd = new Perfil_DAO();
            Perfil_MODEL cm = new Perfil_MODEL();
            Usuario_POJO cp = new Usuario_POJO();
            
            public Perfil_VIEW(Usuario_POJO up) 
                    
            {
        
        initComponents();
            
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
            
    
    
        TNome.setText(up.getNome());
        TEmail1.setText(up.getEmail());
        TCPF.setText(""+up.getCpf());
        TEndereco.setText(up.getEndereco());

        
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TNome = new javax.swing.JTextField();
        TEndereco = new javax.swing.JTextField();
        LSalvar = new javax.swing.JLabel();
        TEmail1 = new javax.swing.JTextField();
        TCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        TNome.setBorder(null);
        TNome.setOpaque(false);
        getContentPane().add(TNome);
        TNome.setBounds(510, 140, 400, 40);

        TEndereco.setBorder(null);
        TEndereco.setOpaque(false);
        TEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(TEndereco);
        TEndereco.setBounds(510, 370, 400, 40);

        LSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LSalvarMouseClicked(evt);
            }
        });
        LSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(LSalvar);
        LSalvar.setBounds(740, 460, 170, 50);

        TEmail1.setBorder(null);
        TEmail1.setOpaque(false);
        TEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(TEmail1);
        TEmail1.setBounds(510, 220, 400, 40);

        TCPF.setBorder(null);
        TCPF.setOpaque(false);
        TCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCPFActionPerformed(evt);
            }
        });
        getContentPane().add(TCPF);
        TCPF.setBounds(510, 300, 400, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_Perfil.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEnderecoActionPerformed

    private void TEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEmail1ActionPerformed

    private void TCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCPFActionPerformed

    private void LSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LSalvarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LSalvarKeyPressed

    private void LSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSalvarMouseClicked
        


        // TODO add your handling code here:
    }//GEN-LAST:event_LSalvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LSalvar;
    private javax.swing.JTextField TCPF;
    private javax.swing.JTextField TEmail1;
    private javax.swing.JTextField TEndereco;
    private javax.swing.JTextField TNome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
