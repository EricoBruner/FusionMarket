package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.POJO.Produto_POJO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MinhaLoja_VIEW extends javax.swing.JInternalFrame {

    public MinhaLoja_VIEW() 
    {
        initComponents();
        Produto_DAO pd = new Produto_DAO();
        Produto_POJO pp = new Produto_POJO();
        List lista = pd.buscar_produto();
        DefaultTableModel dtm = (DefaultTableModel)TTabela.getModel();
        for (int i=0 ; i < lista.size() ; i++)
        {
            pp = (Produto_POJO)lista.get(i);
            dtm.addRow(new Object[]
            {
                pp.getTitulo(), pp.getPreco(), pp.getCategoria(), pp.getQuantidade()
            });
        }    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_Adicionar = new javax.swing.JLabel();
        B_Voltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTabela = new javax.swing.JTable();
        Painei_MinhaLoja = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_AdicionarProduto.png"))); // NOI18N
        B_Adicionar.setMaximumSize(new java.awt.Dimension(300, 46));
        B_Adicionar.setMinimumSize(new java.awt.Dimension(300, 46));
        B_Adicionar.setPreferredSize(new java.awt.Dimension(300, 46));
        B_Adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AdicionarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 50));

        B_Voltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        B_Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Botão_Voltar.png"))); // NOI18N
        B_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 60, 60));

        TTabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Preço", "Categoria", "Quantidade"
            }
        ));
        TTabela.setOpaque(false);
        jScrollPane1.setViewportView(TTabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 930, 360));

        Painei_MinhaLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_MinhaLoja.png"))); // NOI18N
        getContentPane().add(Painei_MinhaLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        setBounds(-1, -22, 966, 583);
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
    private javax.swing.JTable TTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
