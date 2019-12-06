package FusionMarket.VIEW;

import FusionMarket.DAO.Produto_DAO;
import FusionMarket.MODEL.Produto_MODEL;
import FusionMarket.POJO.Produto_POJO;
import FusionMarket.POJO.Usuario_POJO;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Pesquisa_VIEW extends javax.swing.JInternalFrame {

    Usuario_POJO usuarioPojo;
    
    public Pesquisa_VIEW(Usuario_POJO up , String nome) 
    {
        initComponents();
        Produto_DAO cd= new Produto_DAO();
        DefaultTableModel dtm=(DefaultTableModel)TTable.getModel();
        List lista=cd.buscar_produto_like(nome);
        Produto_POJO cp = new Produto_POJO();
        Produto_MODEL cm = new Produto_MODEL();
        
        
         for(int i=0;i<lista.size();i++)
        {
        cp=(Produto_POJO)lista.get(i);
  
        dtm.addRow(new Object[]{
            cp.getTitulo(),cp.getCategoria(),cp.getQuantidade(),cp.getPreco()
            //"Titulo", "Categoria", "Quantidade", "Preço"    
        
        });
        
                
        
        }
         
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        usuarioPojo = up;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel3.setBounds(20, 0, 200, 50);

        TTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Categoria", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(TTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 930, 450);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(774, 0, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FusionMarket/IMAGENS/Painel_TelaPesquisa.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -40, 950, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        ConfirmarDados_VIEW tela = new ConfirmarDados_VIEW(usuarioPojo);
        TelaPrincipal_VIEW.Painel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 
        
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
