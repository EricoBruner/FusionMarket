package FusionMarket.VIEW;

import FusionMarket.POJO.Produto_POJO;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class VerMais_VIEW extends javax.swing.JInternalFrame {

    public VerMais_VIEW(Produto_POJO dados_produto) 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        LPreco.setText(dados_produto.getPreco());
        LQuantidade.setText(""+dados_produto.getQuantidade());
        LCondicao.setText(dados_produto.getCondicao());
        LDescrição.setText("<html>"+dados_produto.getDescricao()+"<html>");
        LNome.setText(dados_produto.getTitulo());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LPreco = new javax.swing.JLabel();
        LQuantidade = new javax.swing.JLabel();
        LCondicao = new javax.swing.JLabel();
        LDescrição = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 16, 70, 60);

        LPreco.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LPreco);
        LPreco.setBounds(210, 104, 160, 40);

        LQuantidade.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LQuantidade);
        LQuantidade.setBounds(204, 170, 170, 30);

        LCondicao.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LCondicao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LCondicao);
        LCondicao.setBounds(204, 234, 170, 30);

        LDescrição.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(LDescrição);
        LDescrição.setBounds(40, 350, 330, 170);

        LNome.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(LNome);
        LNome.setBounds(210, 20, 690, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_VerMais.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.dispose();
           
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCondicao;
    private javax.swing.JLabel LDescrição;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LPreco;
    private javax.swing.JLabel LQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
