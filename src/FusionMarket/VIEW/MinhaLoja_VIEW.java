package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.POJO.Produto_POJO;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class MinhaLoja_VIEW extends javax.swing.JInternalFrame 
{
    int Id_usuario;
    Produto_POJO dados_produto;
    Produto_DAO pd;
    
    public void produto_selecionado()
    {
        int linha = TTabela.getSelectedRow();
        
        if(linha < 0 )
        {
            LAviso.setVisible(true);
        }
        if(linha > 0)
        {
            int id = Integer.parseInt(""+TTabela.getValueAt(linha, 0));
            dados_produto = pd.buscar_produto_id(id);
            AlterarProduto_VIEW tela = new AlterarProduto_VIEW(dados_produto);
            TelaPrincipal_VIEW.Painel.add(tela);
            tela.setVisible(true);     
        }
    }
    public MinhaLoja_VIEW(int id) 
    {
        initComponents();
        
        LAviso.setVisible(false);
        
        Id_usuario=id;
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        Produto_DAO pd = new Produto_DAO();
        Produto_POJO pp = new Produto_POJO();
        List lista = pd.buscar_produto(id);
        DefaultTableModel dtm = (DefaultTableModel)TTabela.getModel();
        for (int i=0 ; i < lista.size() ; i++)
        {
            pp = (Produto_POJO)lista.get(i);
            dtm.addRow(new Object[]
            {
                pp.getId_produto(),pp.getTitulo(), pp.getCategoria(), pp.getQuantidade(), pp.getPreco()
            });
        }    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        B_Adicionar = new javax.swing.JLabel();
        B_Voltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LAviso = new javax.swing.JLabel();
        Painei_MinhaLoja = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(966, 580));
        setMinimumSize(new java.awt.Dimension(966, 580));
        setPreferredSize(new java.awt.Dimension(966, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 130, 50));

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
        B_Voltar.setToolTipText("");
        B_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(B_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, 70, 60));

        TTabela.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo","Titulo", "Categoria", "Quantidade", "Preço"
            }
        ));
        TTabela.setOpaque(false);
        jScrollPane1.setViewportView(TTabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 930, 360));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        LAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LAviso.setForeground(new java.awt.Color(255, 0, 0));
        LAviso.setText("Nenhum produto selecionado");
        getContentPane().add(LAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 125, 180, 20));

        Painei_MinhaLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_MinhaLoja.png"))); // NOI18N
        getContentPane().add(Painei_MinhaLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        setBounds(0, 0, 950, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void B_AdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AdicionarMouseClicked
        
        AdicionarProduto_VIEW Tela_AdicionarProduto = new AdicionarProduto_VIEW(Id_usuario);
        TelaPrincipal_VIEW.Painel.add(Tela_AdicionarProduto);
        Tela_AdicionarProduto.setVisible(true);
        
    }//GEN-LAST:event_B_AdicionarMouseClicked

    private void B_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_B_VoltarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_Adicionar;
    private javax.swing.JLabel B_Voltar;
    private javax.swing.JLabel LAviso;
    private javax.swing.JLabel Painei_MinhaLoja;
    private javax.swing.JTable TTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
