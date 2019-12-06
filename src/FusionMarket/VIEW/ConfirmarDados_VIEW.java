package FusionMarket.VIEW;

import FusionMarket.POJO.Usuario_POJO;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ConfirmarDados_VIEW extends javax.swing.JInternalFrame 
{

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNome = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LCpf = new javax.swing.JLabel();
        LEndereco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);
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

        jLabel3.setBackground(new java.awt.Color(255, 0, 51));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(94, 186, 168, 50);

        jLabel4.setBackground(new java.awt.Color(255, 0, 51));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(94, 304, 168, 49);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCpf;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEndereco;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}