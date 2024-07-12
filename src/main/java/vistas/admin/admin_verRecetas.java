package vistas.admin;

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
import static vistas.admin.admin_sidebar.content;



public class admin_verRecetas extends javax.swing.JPanel {

    RecetaDTO r;
    recetaDAO rd;
    DefaultTableModel modelo = new DefaultTableModel();
    
    String codReceta;
    
    //ArrayList mostrar los tipos de comida en el cbx
    TipoComida tc;
    tipoComidaDAO tcd = new tipoComidaDAO();
    ArrayList<TipoComida> listaTipos = new ArrayList<>();
    
    public admin_verRecetas() {
        initComponents();
        establecerColumnas();
        mostrarRecetas();
        mostrarTipoComida();
        
        // Cambiar la fuente del encabezado de la tabla
        JTableHeader header = tblRecetas.getTableHeader();
        header.setFont(new Font("Poppins", Font.BOLD, 14)); // Cambia a la fuente deseada
        
    }
    
    private void establecerColumnas() {
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Porción");
        modelo.addColumn("Tiempo");
        modelo.addColumn("Calorías");
        tblRecetas.setModel(modelo);
    }
    
    public void mostrarRecetas(){
    modelo.setRowCount(0);
    rd =new recetaDAO();
    ArrayList<RecetaDTO> lista = new ArrayList<>();
    lista = rd.listarTodos();
    for(int i=0; i<lista.size(); i++){
        Object[] data = {
            lista.get(i).getId(),
            lista.get(i).getNombre(), 
            lista.get(i).getPorcion(),
            lista.get(i).getTiempo(),
            lista.get(i).getCalorias(),
            };
        modelo.addRow(data);
    }
}
    
    //Metodo que recorre la lista de TipoComida, obtiene su nombre y los agrega uno por uno
    //al cbTipoComida
    private void mostrarTipoComida(){
        listaTipos = tcd.listarTodos();
        for(int i=0; i<listaTipos.size(); i++){
            cbxTipoComida.addItem(listaTipos.get(i).getNombre());
        }
    }

    admin_verUnaReceta v1r;
    admin_recetas ar;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreReceta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetas = new javax.swing.JTable();
        btnDetalleReceta = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxTipoComida = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreReceta.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        lblNombreReceta.setForeground(new java.awt.Color(170, 89, 19));
        lblNombreReceta.setText("Listado de recetas");
        jPanel1.add(lblNombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 710, 440));

        btnDetalleReceta.setText("Ver detalle");
        btnDetalleReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleRecetaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetalleReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 120, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 120, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 120, -1));

        jLabel1.setText("Categoría");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        jPanel1.add(cbxTipoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 180, -1));

        jButton4.setText("Filtrar");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, -1, -1));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDetalleRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleRecetaActionPerformed
        int fila = tblRecetas.getSelectedRow();
          
       if (fila==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una clase de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            codReceta = tblRecetas.getValueAt(fila, 0).toString();
            // Abrir sección
            v1r = new admin_verUnaReceta(codReceta);
            mostrarPanel(v1r);

       }
    }//GEN-LAST:event_btnDetalleRecetaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Abrir sección
        ar = new admin_recetas();
        mostrarPanel(ar);
    }//GEN-LAST:event_btnAgregarActionPerformed
    
 
   private void mostrarPanel(JPanel p) {
        p.setSize(1050, 720);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDetalleReceta;
    private javax.swing.JComboBox<String> cbxTipoComida;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreReceta;
    private javax.swing.JTable tblRecetas;
    // End of variables declaration//GEN-END:variables
}
