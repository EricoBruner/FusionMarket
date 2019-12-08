package FusionMarket.VIEW;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Historico_VIEW extends javax.swing.JInternalFrame {

    public Historico_VIEW() 
    {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Painel_Historico = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(null);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(17, 16, 70, 60);

        Painel_Historico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_Historico.png"))); // NOI18N
        getContentPane().add(Painel_Historico);
        Painel_Historico.setBounds(0, 0, 950, 550);

        setBounds(0, 0, 950, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Painel_Historico;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
