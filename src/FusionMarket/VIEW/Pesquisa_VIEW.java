package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.DAO.Usuario_DAO;
import FusionMarket.MODEL.Produto_MODEL;
import FusionMarket.POJO.Produto_POJO;
import FusionMarket.POJO.Usuario_POJO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Pesquisa_VIEW extends javax.swing.JInternalFrame {

    Produto_POJO pp = new Produto_POJO();
    Produto_DAO pd = new Produto_DAO();
    Usuario_DAO ud = new Usuario_DAO();
    Produto_POJO produtoPojo;
    Usuario_POJO usuarioPojo;
    Usuario_POJO vendedor;
    
    public void produto_selecionado()
    {
        int linha = TTable.getSelectedRow();
        
        if(linha < 0 )
        {
            LAviso.setVisible(true);
        }
        if(linha > 0)
        {
            //int id_vendedor = produtoPojo.getId_usuario();
            //vendedor = ud.buscar_usuario_id(id_vendedor);
            int id = Integer.parseInt(""+TTable.getValueAt(linha, 0));
            produtoPojo = pd.buscar_produto_id(id);
            VerMais_VIEW tela_vermais = new VerMais_VIEW(produtoPojo, usuarioPojo);
            TelaPrincipal_VIEW.Painel.add(tela_vermais);
            tela_vermais.setVisible(true);
        }
    }
    public Pesquisa_VIEW(Usuario_POJO up , String nome) 
    {
        initComponents();
        
        DefaultTableModel dtm=(DefaultTableModel)TTable.getModel();
        List lista = pd.buscar_produto_like(nome);
        Produto_MODEL cm = new Produto_MODEL();
        
        
         for(int i=0;i<lista.size();i++)
        {
        pp=(Produto_POJO)lista.get(i);
  
        dtm.addRow(new Object[]{
            pp.getId_produto(),pp.getTitulo(),pp.getCategoria(),pp.getQuantidade(),pp.getPreco()
            //"Titulo", "Categoria", "Quantidade", "Preço"    
        
        });
        
                

        }
         
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        usuarioPojo = up;
        
        LAviso.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        LAviso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(null);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 200, 50);

        TTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo","Titulo", "Categoria", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(TTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 930, 450);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(775, 20, 155, 50);

        LAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LAviso.setForeground(new java.awt.Color(255, 0, 0));
        LAviso.setText("Nenhum produto selecionado");
        getContentPane().add(LAviso);
        LAviso.setBounds(410, 40, 170, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_TelaPesquisa.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        ConfirmarDados_VIEW tela_confirmardados = new ConfirmarDados_VIEW(usuarioPojo);
        TelaPrincipal_VIEW.Painel.add(tela_confirmardados);
        tela_confirmardados.setVisible(true);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        produto_selecionado();
        
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LAviso;
    private javax.swing.JTable TTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
