package FusionMarket.VIEW;

public class MinhaLoja_VIEW extends javax.swing.JInternalFrame {

    public MinhaLoja_VIEW() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_Adicionar = new javax.swing.JLabel();
        B_Voltar = new javax.swing.JLabel();
        Painei_MinhaLoja = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_AdicionarProduto.png"))); // NOI18N
        B_Adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AdicionarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 114, 160, 150));

        B_Voltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        B_Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Voltar.png"))); // NOI18N
        B_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 60, 60));

        Painei_MinhaLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painei_MinhaLoja.png"))); // NOI18N
        getContentPane().add(Painei_MinhaLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        setBounds(-1, -22, 966, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void B_AdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AdicionarMouseClicked
        AdicionarProduto_VIEW Tela_AdicionarProduto = new AdicionarProduto_VIEW();
        TelaPrincipal_VIEW.Painel.add(Tela_AdicionarProduto);
        Tela_AdicionarProduto.setVisible(true);
    }//GEN-LAST:event_B_AdicionarMouseClicked

    private void B_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_B_VoltarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_Adicionar;
    private javax.swing.JLabel B_Voltar;
    private javax.swing.JLabel Painei_MinhaLoja;
    // End of variables declaration//GEN-END:variables
}
