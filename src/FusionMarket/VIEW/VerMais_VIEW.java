package FusionMarket.VIEW;

import FusionMarket.DAO.Usuario_DAO;
import FusionMarket.POJO.Produto_POJO;
import FusionMarket.POJO.Usuario_POJO;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class VerMais_VIEW extends javax.swing.JInternalFrame {
    
    Usuario_POJO up;
    Usuario_POJO vendedor;
    
    public VerMais_VIEW(Produto_POJO dados_produto, Usuario_POJO dados_usuario, Usuario_POJO dados_vendedor) 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        LPreco.setText(dados_produto.getPreco());
        LQuantidade.setText(""+dados_produto.getQuantidade());
        LCondicao.setText(dados_produto.getCondicao());
        LDescricao.setText(dados_produto.getDescricao());
        LNome.setText(dados_produto.getTitulo());
        
        //LVendedor.setText(dados_vendedor.getNome());
        
        //vendedor = dados_vendedor;
        
        up = dados_usuario;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LPreco = new javax.swing.JLabel();
        LQuantidade = new javax.swing.JLabel();
        LCondicao = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        LVendedor = new javax.swing.JLabel();
        LReputacao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LDescricao = new javax.swing.JLabel();
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

        LPreco.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LPreco);
        LPreco.setBounds(193, 106, 170, 40);

        LQuantidade.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LQuantidade);
        LQuantidade.setBounds(194, 166, 170, 40);

        LCondicao.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LCondicao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LCondicao);
        LCondicao.setBounds(194, 230, 170, 40);

        LNome.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        getContentPane().add(LNome);
        LNome.setBounds(203, 19, 700, 56);

        LVendedor.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(LVendedor);
        LVendedor.setBounds(552, 374, 340, 39);

        LReputacao.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(LReputacao);
        LReputacao.setBounds(553, 465, 340, 40);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(784, 414, 116, 26);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 100, 210, 220);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(706, 147, 168, 52);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(706, 226, 169, 50);

        LDescricao.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(LDescricao);
        LDescricao.setBounds(44, 350, 330, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_VerMais.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.dispose();
           
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        ConfirmarDados_VIEW tela = new ConfirmarDados_VIEW(up);
        TelaPrincipal_VIEW.Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        PerfilVendedor_VIEW tela = new PerfilVendedor_VIEW();
        TelaPrincipal_VIEW.Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCondicao;
    private javax.swing.JLabel LDescricao;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LPreco;
    private javax.swing.JLabel LQuantidade;
    private javax.swing.JLabel LReputacao;
    private javax.swing.JLabel LVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
