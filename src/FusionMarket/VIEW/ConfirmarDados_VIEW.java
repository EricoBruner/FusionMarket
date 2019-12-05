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
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(93, 185, 169, 51);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(93, 303, 168, 51);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "     1", "     2", "     3", "     4", "     5", "     6", "     7", "     8", "     9 ", "    10", " " }));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(236, 411, 52, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_ConfirmarDados_VIEW.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
