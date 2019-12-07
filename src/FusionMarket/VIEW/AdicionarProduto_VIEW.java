package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.MODEL.Produto_MODEL;
import FusionMarket.POJO.Produto_POJO;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AdicionarProduto_VIEW extends javax.swing.JInternalFrame 
{
    Produto_POJO pp = new Produto_POJO();
    Produto_DAO pd = new Produto_DAO();
    Produto_MODEL pm = new Produto_MODEL();
    int id_usuario;
    String rot="";
    int adfoto=0;
    public AdicionarProduto_VIEW(int id) 
    {
        initComponents();
        id_usuario=id;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    public void Pegar_Dados()
    {
        pp.setTitulo(TTitulo.getText());
        pp.setPreco(TPreco.getText());
        pp.setQuantidade(Integer.parseInt(TQuantidade.getText()));
        pp.setDescricao(TDescricao.getText());
        pp.setCategoria(TCategoria.getText());
        pp.setCondicao(""+TCondicao.getSelectedItem());
        pp.setId_usuario(id_usuario);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JLabel();
        Publicar = new javax.swing.JLabel();
        LFoto = new javax.swing.JLabel();
        TTitulo = new javax.swing.JTextField();
        TCategoria = new javax.swing.JTextField();
        TPreco = new javax.swing.JTextField();
        TQuantidade = new javax.swing.JTextField();
        TCondicao = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        TDescricao = new javax.swing.JTextArea();
        PainelAdicionarProduto = new javax.swing.JLabel();
        TUrl = new javax.swing.JLabel();

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

        LFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_AdicionarImagem.png"))); // NOI18N
        LFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LFotoMouseClicked(evt);
            }
        });
        getContentPane().add(LFoto);
        LFoto.setBounds(750, 145, 164, 165);

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

        TDescricao.setColumns(20);
        TDescricao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TDescricao.setRows(5);
        jScrollPane2.setViewportView(TDescricao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(420, 150, 290, 260);

        PainelAdicionarProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PainelAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel _AdicionarProduto.png"))); // NOI18N
        getContentPane().add(PainelAdicionarProduto);
        PainelAdicionarProduto.setBounds(0, 0, 950, 550);

        TUrl.setText("jLabel1");
        getContentPane().add(TUrl);
        TUrl.setBounds(330, 80, 34, 14);

        setBounds(0, 0, 950, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MinhaLoja_VIEW tela = new MinhaLoja_VIEW(id_usuario);
        tela.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    public void carregar_foto()
    {
        JFileChooser j = new JFileChooser();
        j.setCurrentDirectory(new File("Imagenes/"));
        int ap = j.showOpenDialog(this);
        String rota="";
        BufferedImage bi = null;
        if(ap == JFileChooser.APPROVE_OPTION){
            File arquivo = j.getSelectedFile();
            rota = j.getSelectedFile().getAbsolutePath();
            ImageIcon icone = new ImageIcon(rota);
            try {
                bi = ImageIO.read(arquivo);
            } catch (Exception e) {
            }

            icone.setImage(icone.getImage().getScaledInstance(LFoto.getWidth(), LFoto.getHeight(), 1));
            LFoto.setIcon(icone);
            TUrl.setText(rota);
            rot=rota;
            adfoto=1;
    }
    }
    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        MinhaLoja_VIEW tela = new MinhaLoja_VIEW(id_usuario);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarMouseClicked

    private void PublicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublicarMouseClicked
        
        Pegar_Dados();
        
        try
        {
            pd.inserir_produto(pp,rot,adfoto);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null, "O campo "+pp.getErro()+" é obrigatorio");
        }
        
        MinhaLoja_VIEW tela = new MinhaLoja_VIEW(id_usuario);
        TelaPrincipal_VIEW.Painel.add(tela);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PublicarMouseClicked

    private void LFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFotoMouseClicked

        carregar_foto();
        // Colocar opção pro usuario colocar imagem
    }//GEN-LAST:event_LFotoMouseClicked

    private void TTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTituloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel LFoto;
    private javax.swing.JLabel PainelAdicionarProduto;
    private javax.swing.JLabel Publicar;
    private javax.swing.JTextField TCategoria;
    private javax.swing.JComboBox TCondicao;
    private javax.swing.JTextArea TDescricao;
    private javax.swing.JTextField TPreco;
    private javax.swing.JTextField TQuantidade;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JLabel TUrl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
