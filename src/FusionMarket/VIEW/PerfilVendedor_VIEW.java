package FusionMarket.VIEW;

import FusionMarket.POJO.Usuario_POJO;

public class PerfilVendedor_VIEW extends javax.swing.JInternalFrame 
{

    public PerfilVendedor_VIEW() 
    {
        initComponents();
        
        //LNome.setText(dados_vendedor.getNome());
        //LEmail.setText(dados_vendedor.getEmail());
        //LEndereco.setText(dados_vendedor.getEndereco());
        //LCpf.setText(""+dados_vendedor.getCpf());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNome = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LCpf = new javax.swing.JLabel();
        LEndereco = new javax.swing.JLabel();
        LContinuar = new javax.swing.JLabel();
        LCancelar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);
        getContentPane().add(LNome);
        LNome.setBounds(500, 140, 400, 40);
        getContentPane().add(LEmail);
        LEmail.setBounds(500, 210, 400, 50);
        getContentPane().add(LCpf);
        LCpf.setBounds(500, 294, 400, 40);
        getContentPane().add(LEndereco);
        LEndereco.setBounds(500, 370, 400, 40);

        LContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LContinuarMouseClicked(evt);
            }
        });
        getContentPane().add(LContinuar);
        LContinuar.setBounds(740, 460, 170, 50);

        LCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(LCancelar);
        LCancelar.setBounds(550, 460, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_PerfilVendedor.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LContinuarMouseClicked
        
  
    }//GEN-LAST:event_LContinuarMouseClicked

    private void LCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCancelarMouseClicked
        

    }//GEN-LAST:event_LCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCancelar;
    private javax.swing.JLabel LContinuar;
    private javax.swing.JLabel LCpf;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEndereco;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
