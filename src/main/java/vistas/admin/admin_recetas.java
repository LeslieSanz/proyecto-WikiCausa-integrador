package vistas.admin;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.IngredienteDTO;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modeloDAO.ingredienteDAO;
import modeloDAO.recetaDAO;
import modeloDAO.recetaIngredientesDAO;


public class admin_recetas extends javax.swing.JPanel {
    //Declarar un objeto de la clase ingredientes
    IngredienteDTO i;
    //Declarar un objeto de la clase ingredineteDAO
    ingredienteDAO id;
    
    RecetaDTO r;
    
    //RecetaIngredientes
    RecetaIngredientesDTO dd;
    ArrayList<RecetaIngredientesDTO> listaDetalle = new ArrayList<>();
    
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    
    public admin_recetas() {
        initComponents();
        establecerColumnas();
        establecerColumnas2();
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        tblIngredientesGeneral.setModel(modelo);
    }
    
    private void establecerColumnas2(){
        modelo2.addColumn("Ingrediente");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Medida");
        tblDetalle.setModel(modelo2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreReceta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxBuscarCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientesGeneral = new javax.swing.JTable();
        btnAgregarReceta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPorcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxUnidadMedida = new javax.swing.JComboBox<>();
        txtCant = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCalorias = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtCodIngre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtTipoComida = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIdReceta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPreparacion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Recetas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 29, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 123, -1, -1));
        jPanel1.add(txtNombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 120, 232, -1));

        jLabel3.setText("Ingrediente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jPanel1.add(cbxBuscarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 100, -1));

        jLabel4.setText("Buscar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 151, -1));

        tblIngredientesGeneral.setModel(new javax.swing.table.DefaultTableModel(
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
        tblIngredientesGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngredientesGeneralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIngredientesGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 286, 290));

        btnAgregarReceta.setText("Agregar");
        btnAgregarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRecetaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        jLabel5.setText("Porcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel1.add(txtPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, -1));

        jLabel6.setText("Tiempo preparacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 90, -1));

        jLabel7.setText("min");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDetalle);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 128, 366, 277));

        jLabel8.setText("Cant.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabel9.setText("Unidad de medida");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        cbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Presas", "Tazas", "Cucharadas", "Pedazo" }));
        jPanel1.add(cbxUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 149, -1));

        jLabel10.setText("Nro. de calorias");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        jPanel1.add(txtCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 120, -1));

        btnAgregar.setText("Agregar receta");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        jButton2.setText("Limpiar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        jButton3.setText("Eliminar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        jLabel11.setText("Lista de ingredientes para la receta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 520, 20));

        jLabel12.setText("Agregar ingredientes");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        txtCodIngre.setEditable(false);
        jPanel1.add(txtCodIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 110, -1));

        jLabel13.setText("Cod. Ingrediente");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel14.setText("Id. Tipo comida");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        jPanel1.add(txtTipoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, -1));

        jLabel15.setText("Id. Receta");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel1.add(txtIdReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, -1));

        jLabel16.setText("Preparacion");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        jPanel1.add(txtPreparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 210, -1));

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

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarTablaIngredientes();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void tblIngredientesGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngredientesGeneralMouseClicked
        int row = tblIngredientesGeneral.getSelectedRow();
        
        int codIngre = Integer.parseInt(tblIngredientesGeneral.getValueAt(row, 0)+"");
        txtCodIngre.setText(codIngre+"");
    }//GEN-LAST:event_tblIngredientesGeneralMouseClicked

    private void btnAgregarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRecetaActionPerformed
        //Obteniendo los datos de los campos
        int cant = Integer.parseInt(txtCant.getText());
        String medida = cbxUnidadMedida.getSelectedItem().toString();
        
        //Buscando ingrediente
        String codigo = txtCodIngre.getText();
        id = new ingredienteDAO();
        i = id.listarUno(codigo);
        
        dd = new RecetaIngredientesDTO();
        dd.setIngrediente(i);
        dd.setCantidad(cant);
        dd.setMedida(medida);
        dd.setIdReceta(txtIdReceta.getText());
        
        //Agregandolo a la tabla de ingredientes
        listaDetalle.add(dd);
        txtCant.setText(null);
        mostrarTablaDetalle();
    }//GEN-LAST:event_btnAgregarRecetaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Primero, agregamos la receta
        r = new RecetaDTO();
        recetaDAO rd = new recetaDAO();
        r.setId(Integer.parseInt(txtIdReceta.getText()));
        r.setNombre(txtNombreReceta.getText());
        r.setTipo(Integer.parseInt(txtTipoComida.getText()));
        r.setPorcion(Integer.parseInt(txtPorcion.getText()));
        r.setTiempo(Integer.parseInt(txtTiempo.getText()));
        r.setCalorias(Double.parseDouble(txtCalorias.getText()));
        r.setPreparacion(txtPreparacion.getText());
        rd.agregar(r);
        
        //Luego, sus detalles
        //Agregando detalles a la venta
        for (int i = 0; i < listaDetalle.size(); i++) {
            recetaIngredientesDAO rid = new recetaIngredientesDAO();
            rid.agregar(listaDetalle.get(i));
        }
        
        // Limpiar la listaDetalle para la próxima receta
        eliminarElementosTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    public void mostrarTablaIngredientes(){
        //Mostrar productos en la tabla
        modelo.setRowCount(0);
        id = new ingredienteDAO();   
        ArrayList<IngredienteDTO> listaIngredientes = new ArrayList<>();
        listaIngredientes = id.listarTodos();
        for(int i=0; i<listaIngredientes.size(); i++){
            Object[] data = {
                listaIngredientes.get(i).getId(), 
                listaIngredientes.get(i).getNombre(),
                };
            modelo.addRow(data);
        }
    }
    
    public void eliminarElementosTabla() {
        for (int i = tblDetalle.getRowCount() - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
    }

    public void mostrarTablaDetalle() {
        eliminarElementosTabla();
        for (int i = 0; i < listaDetalle.size(); i++) {
            Object[] data = {
                listaDetalle.get(i).getIngrediente().getNombre(),
                listaDetalle.get(i).getCantidad(),
                listaDetalle.get(i).getMedida(),
                };
            modelo2.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarReceta;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbxBuscarCategoria;
    private javax.swing.JComboBox<String> cbxUnidadMedida;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTable tblIngredientesGeneral;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodIngre;
    private javax.swing.JTextField txtIdReceta;
    private javax.swing.JTextField txtNombreReceta;
    private javax.swing.JTextField txtPorcion;
    private javax.swing.JTextField txtPreparacion;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTipoComida;
    // End of variables declaration//GEN-END:variables
}
