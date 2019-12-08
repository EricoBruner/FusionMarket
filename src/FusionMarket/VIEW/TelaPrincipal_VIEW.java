package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.MODEL.Produto_MODEL;
import FusionMarket.POJO.Produto_POJO;
import FusionMarket.POJO.Usuario_POJO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal_VIEW extends javax.swing.JFrame 
{
    Usuario_POJO usuarioPOJO;
    String nome;
    
    public TelaPrincipal_VIEW(Usuario_POJO up) 
    {
        initComponents();
        
        TProduto.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        TRegiao.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        TCategoria.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        
        usuarioPOJO=up;
        
        MaisVendidos_VIEW tela = new MaisVendidos_VIEW();
        Painel.add(tela);
        tela.setVisible(true);
        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BotãoLoja = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Painel = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TProduto = new javax.swing.JTextField();
        TPesquisar = new javax.swing.JLabel();
        TCategoria = new javax.swing.JComboBox();
        TRegiao = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        TelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setMaximumSize(new java.awt.Dimension(52, 52));
        jLabel2.setMinimumSize(new java.awt.Dimension(52, 52));
        jLabel2.setName(""); // NOI18N
        jLabel2.setNextFocusableComponent(TelaPrincipal);
        jLabel2.setPreferredSize(new java.awt.Dimension(52, 52));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(354, 52, 52, 52);

        BotãoLoja.setMaximumSize(new java.awt.Dimension(53, 53));
        BotãoLoja.setMinimumSize(new java.awt.Dimension(53, 53));
        BotãoLoja.setPreferredSize(new java.awt.Dimension(53, 53));
        BotãoLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoLojaMouseClicked(evt);
            }
        });
        getContentPane().add(BotãoLoja);
        BotãoLoja.setBounds(503, 51, 53, 53);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Fechar_2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(18, 18));
        jLabel1.setMinimumSize(new java.awt.Dimension(18, 18));
        jLabel1.setPreferredSize(new java.awt.Dimension(18, 18));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1341, 6, 18, 18);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Minimizar_1.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(18, 18));
        jLabel4.setMinimumSize(new java.awt.Dimension(18, 18));
        jLabel4.setPreferredSize(new java.awt.Dimension(18, 18));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1319, 6, 18, 18);

        Painel.setMaximumSize(new java.awt.Dimension(950, 550));
        Painel.setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().add(Painel);
        Painel.setBounds(353, 154, 950, 550);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 53, 50, 50);

        jLabel5.setMaximumSize(new java.awt.Dimension(50, 49));
        jLabel5.setMinimumSize(new java.awt.Dimension(50, 49));
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 49));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 53, 50, 49);

        TProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TProduto.setForeground(new java.awt.Color(255, 255, 255));
        TProduto.setBorder(null);
        TProduto.setMaximumSize(new java.awt.Dimension(231, 46));
        TProduto.setMinimumSize(new java.awt.Dimension(231, 46));
        TProduto.setOpaque(false);
        TProduto.setPreferredSize(new java.awt.Dimension(231, 46));
        TProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TProdutoActionPerformed(evt);
            }
        });
        TProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TProdutoKeyPressed(evt);
            }
        });
        getContentPane().add(TProduto);
        TProduto.setBounds(31, 406, 231, 46);

        TPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Pesquisa.png"))); // NOI18N
        TPesquisar.setMaximumSize(new java.awt.Dimension(49, 49));
        TPesquisar.setMinimumSize(new java.awt.Dimension(49, 49));
        TPesquisar.setPreferredSize(new java.awt.Dimension(49, 49));
        TPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(TPesquisar);
        TPesquisar.setBounds(268, 404, 50, 50);

        TCategoria.setEditable(true);
        TCategoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TCategoria.setForeground(new java.awt.Color(255, 255, 255));
        TCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                        ", " FPS", " MOBA", " Aventura", " Simulação", " RPG", " Ação", " Corrida" }));
        TCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TCategoria.setMaximumSize(new java.awt.Dimension(286, 46));
        TCategoria.setMinimumSize(new java.awt.Dimension(286, 46));
        TCategoria.setPreferredSize(new java.awt.Dimension(286, 46));
        TCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(TCategoria);
        TCategoria.setBounds(30, 655, 286, 46);

        TRegiao.setBackground(new java.awt.Color(84, 84, 84));
        TRegiao.setEditable(true);
        TRegiao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TRegiao.setForeground(new java.awt.Color(255, 255, 255));
        TRegiao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "               ", " Timbó", " Pomerode", " Indaial" }));
        TRegiao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TRegiao.setMaximumSize(new java.awt.Dimension(286, 46));
        TRegiao.setMinimumSize(new java.awt.Dimension(286, 46));
        TRegiao.setPreferredSize(new java.awt.Dimension(286, 46));
        TRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRegiaoActionPerformed(evt);
            }
        });
        getContentPane().add(TRegiao);
        TRegiao.setBounds(30, 530, 286, 46);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1255, 52, 50, 50);

        TelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_TelaPrincipal.png"))); // NOI18N
        getContentPane().add(TelaPrincipal);
        TelaPrincipal.setBounds(0, -30, 1366, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoLojaMouseClicked
        
        MinhaLoja_VIEW Tela_MinhaLoja = new MinhaLoja_VIEW(usuarioPOJO.getId());
        Painel.add(Tela_MinhaLoja);
        Tela_MinhaLoja.setVisible(true);
        
    }//GEN-LAST:event_BotãoLojaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        System.exit(0);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
            
            this.setState(JFrame.ICONIFIED);
            
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        Historico_VIEW Tela_Historico = new Historico_VIEW();
        TelaPrincipal_VIEW.Painel.add(Tela_Historico);
        Tela_Historico.setVisible(true);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        Perfil_VIEW tela = new Perfil_VIEW(usuarioPOJO);
        TelaPrincipal_VIEW.Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void TProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TProdutoActionPerformed
        
    }//GEN-LAST:event_TProdutoActionPerformed

    private void TRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRegiaoActionPerformed
 
    }//GEN-LAST:event_TRegiaoActionPerformed

    private void TCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCategoriaActionPerformed

    }//GEN-LAST:event_TCategoriaActionPerformed

    private void TPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPesquisarMouseClicked

        nome=TProduto.getText();
        Pesquisa_VIEW tela = new Pesquisa_VIEW(usuarioPOJO,nome);
        TelaPrincipal_VIEW.Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_TPesquisarMouseClicked

    private void TProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TProdutoKeyPressed
        
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) 
        {
            nome=TProduto.getText();
            Pesquisa_VIEW tela = new Pesquisa_VIEW(usuarioPOJO,nome);
            TelaPrincipal_VIEW.Painel.add(tela);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_TProdutoKeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        Carrinho_VIEW tela = new  Carrinho_VIEW();
        Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        MaisVendidos_VIEW tela = new MaisVendidos_VIEW();
        Painel.removeAll();
        Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotãoLoja;
    public static javax.swing.JDesktopPane Painel;
    private javax.swing.JComboBox TCategoria;
    private javax.swing.JLabel TPesquisar;
    private javax.swing.JTextField TProduto;
    private javax.swing.JComboBox TRegiao;
    private javax.swing.JLabel TelaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
