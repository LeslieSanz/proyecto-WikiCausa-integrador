package vistas.cliente;

import vistas.admin.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modelo.TipoComida;
import modeloDAO.recetaDAO;
import modeloDAO.recetaIngredientesDAO;
import modeloDAO.tipoComidaDAO;




public class cliente_verRecetas extends javax.swing.JPanel {

    TipoComida tp;
    tipoComidaDAO tpd;
    
    RecetaDTO r;
    recetaDAO rd;
    DefaultTableModel modelo = new DefaultTableModel();
    
    int codTipoComida;
    
    
    public cliente_verRecetas(int cod) {
        initComponents();
        establecerColumnas();
        codTipoComida = cod;
        
        tpd = new tipoComidaDAO();
        tp = tpd.listarUno(codTipoComida+"");
        lblNombreTipo.setText("Recetas de " + tp.getNombre());
        
        FiltrarRecetas(codTipoComida);

        // Cambiar la fuente del encabezado de la tabla
        JTableHeader header = tblRecetas.getTableHeader();
        header.setFont(new Font("Poppins", Font.BOLD, 14)); // Cambia a la fuente deseada
        
    }
    
    private void establecerColumnas() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Porción");
        modelo.addColumn("Tiempo");
        modelo.addColumn("Calorías");
        tblRecetas.setModel(modelo);
    }
         
    public void FiltrarRecetas(int codTipoComida){
    modelo.setRowCount(0);
    rd =new recetaDAO();
    ArrayList<RecetaDTO> lista = new ArrayList<>();
    lista = rd.listarRecetasPorCat(codTipoComida);
    for(int i=0; i<lista.size(); i++){
        Object[] data = {
            lista.get(i).getNombre(), 
            lista.get(i).getPorcion(),
            lista.get(i).getTiempo(),
            lista.get(i).getCalorias(),
            };
        modelo.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreTipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetas = new javax.swing.JTable();
        btnDetalleReceta = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreTipo.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        lblNombreTipo.setForeground(new java.awt.Color(170, 89, 19));
        lblNombreTipo.setText("Recetas de tipo");
        jPanel1.add(lblNombreTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        tblRecetas.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRecetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 540, 380));

        btnDetalleReceta.setBackground(new java.awt.Color(0, 124, 238));
        btnDetalleReceta.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnDetalleReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalleReceta.setText("Ver detalle");
        btnDetalleReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleRecetaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetalleReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetalleRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleRecetaActionPerformed
//        int fila = tblRecetas.getSelectedRow();
//          
//       if (fila==-1){
//            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
//            JOptionPane.showMessageDialog(this, "Por favor, seleccione una receta de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
//        }else{
//            codReceta = tblRecetas.getValueAt(fila, 0).toString();
//            // Abrir sección
//            v1r = new admin_verUnaReceta(codReceta);
//            mostrarPanel(v1r);
//
//       }
    }//GEN-LAST:event_btnDetalleRecetaActionPerformed
    
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalleReceta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreTipo;
    private javax.swing.JTable tblRecetas;
    // End of variables declaration//GEN-END:variables
}
