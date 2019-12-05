package FusionMarket.VIEW;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ConfirmarDados_VIEW extends javax.swing.JInternalFrame {

    public ConfirmarDados_VIEW() 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        LNome = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LCpf = new javax.swing.JLabel();
        LEndereco = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(93, 185, 169, 51);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(93, 303, 168, 51);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "     1", "     2", "     3", "     4", "     5", "     6", "     7", "     8", "     9 ", "    10", " " }));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(236, 411, 52, 40);
        getContentPane().add(LNome);
        LNome.setBounds(510, 142, 400, 40);
        getContentPane().add(LEmail);
        LEmail.setBounds(510, 216, 400, 40);
        getContentPane().add(LCpf);
        LCpf.setBounds(510, 294, 400, 40);
        getContentPane().add(LEndereco);
        LEndereco.setBounds(510, 370, 400, 40);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(740, 460, 170, 50);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(16, 13, 75, 65);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_ConfirmarDados_VIEW.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCpf;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEndereco;
    private javax.swing.JLabel LNome;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
