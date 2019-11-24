package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.POJO.Produto_POJO;
import javax.swing.JOptionPane;

public class AdicionarProduto_VIEW extends javax.swing.JInternalFrame 
{
    Produto_POJO pp = new Produto_POJO();
    Produto_DAO pd = new Produto_DAO();
    
    public AdicionarProduto_VIEW() 
    {
        initComponents();
    }
    public void Pegar_Dados()
    {
        pp.setTitulo(TTitulo.getText());
        pp.setPreco(TPreco.getText());
        pp.setQuantidade(Integer.parseInt(TQuantidade.getText()));
        pp.setDescricao(TDescricao.getText());
        pp.setCategoria(TCategoria.getText());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JLabel();
        Publicar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TTitulo = new javax.swing.JTextField();
        TCategoria = new javax.swing.JTextField();
        TPreco = new javax.swing.JTextField();
        TQuantidade = new javax.swing.JTextField();
        TCondicao = new javax.swing.JComboBox();
        TDescricao = new javax.swing.JTextField();
        PainelAdicionarProduto = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Voltar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(22, 20, 60, 60);

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Cancelar.png"))); // NOI18N
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(750, 362, 160, 50);

        Publicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Publicar.png"))); // NOI18N
        Publicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublicarMouseClicked(evt);
            }
        });
        getContentPane().add(Publicar);
        Publicar.setBounds(750, 470, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_AdicionarImagem.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(750, 150, 160, 160);

        TTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TTitulo.setBorder(null);
        TTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTituloActionPerformed(evt);
            }
        });
        getContentPane().add(TTitulo);
        TTitulo.setBounds(29, 150, 340, 40);

        TCategoria.setBorder(null);
        getContentPane().add(TCategoria);
        TCategoria.setBounds(30, 256, 340, 40);

        TPreco.setBorder(null);
        getContentPane().add(TPreco);
        TPreco.setBounds(30, 367, 340, 40);

        TQuantidade.setBorder(null);
        getContentPane().add(TQuantidade);
        TQuantidade.setBounds(30, 476, 340, 40);

        TCondicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Novo", "Usado", "Semi-novo" }));
        TCondicao.setLightWeightPopupEnabled(false);
        TCondicao.setMaximumSize(new java.awt.Dimension(302, 50));
        TCondicao.setMinimumSize(new java.awt.Dimension(302, 50));
        TCondicao.setPreferredSize(new java.awt.Dimension(302, 50));
        getContentPane().add(TCondicao);
        TCondicao.setBounds(413, 470, 302, 50);

        TDescricao.setBorder(null);
        TDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(TDescricao);
        TDescricao.setBounds(419, 148, 290, 260);

        PainelAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel _AdicionarProduto.png"))); // NOI18N
        getContentPane().add(PainelAdicionarProduto);
        PainelAdicionarProduto.setBounds(0, 0, 950, 550);

        setBounds(-1, -22, 966, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelarMouseClicked

    private void PublicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublicarMouseClicked
        
        Pegar_Dados();
        
        try
        {
            pd.inserir_produto(pp);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios");
        }
    }//GEN-LAST:event_PublicarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Colocar opção pro usuario colocar imagem
    }//GEN-LAST:event_jLabel1MouseClicked

    private void TTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTituloActionPerformed

    private void TDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TDescricaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel PainelAdicionarProduto;
    private javax.swing.JLabel Publicar;
    private javax.swing.JTextField TCategoria;
    private javax.swing.JComboBox TCondicao;
    private javax.swing.JTextField TDescricao;
    private javax.swing.JTextField TPreco;
    private javax.swing.JTextField TQuantidade;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
