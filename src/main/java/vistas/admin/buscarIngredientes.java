package vistas.admin;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.IngredienteDTO;
import modelo.MedidaDTO;
import modelo.TipoIngrediente;
import modeloDAO.MedidaDAO;
import modeloDAO.ingredienteDAO;
import modeloDAO.tipoIngredienteDAO;
import static vistas.admin.admin_recetas.cbxUnidadMedida;
import static vistas.admin.admin_recetas.txtCodIngre;
import static vistas.admin.admin_recetas.txtNomIngrediente;

public class buscarIngredientes extends javax.swing.JFrame {

    //Declarar un objeto de la clase ingredientes
    IngredienteDTO i;
    //Declarar un objeto de la clase ingredienteDAO, para listar todos
    ingredienteDAO id;

    //Creando objeto medida
    MedidaDTO medida = new MedidaDTO();

    //Modelo para la tblIngredientes
    DefaultTableModel modelo = new DefaultTableModel();

    //ArrayList mostrar los tipos de ingredientes en el cbx
    TipoIngrediente ti;
    tipoIngredienteDAO tid = new tipoIngredienteDAO();
    ArrayList<TipoIngrediente> listaTipos = new ArrayList<>();
    ArrayList<MedidaDTO> medidaD = new ArrayList<>();

    //Esto es para el cbxTipoIngrediente
    String tipIng;

    //Para buscar el ingrediente por su nombre
    String filtro;
    private TableRowSorter trsfiltro;

    public buscarIngredientes() {
        initComponents();
        establecerColumnas();
        mostrarTablaIngredientes();
        mostrarTipoIngrediente();
        aplicarFiltro();
        this.setLocationRelativeTo(this);
    }

    private void establecerColumnas() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        tblIngredientes.setModel(modelo);
    }

    //Metodo que recorre la lista de TipoIngredientes, obtiene su nombre y los agrega uno por uno
    //al cbTipoIngre
    private void mostrarTipoIngrediente() {
        listaTipos = tid.listarTodos();
        for (int i = 0; i < listaTipos.size(); i++) {
            cbxTipoIngre.addItem(listaTipos.get(i).getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbxTipoIngre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        txtNomIngre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setText("¡Encuentra los ingredientes y agrégalos a la receta!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Buscar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 310, -1));

        cbxTipoIngre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbxTipoIngre.setForeground(new java.awt.Color(102, 102, 102));
        cbxTipoIngre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxTipoIngre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoIngreItemStateChanged(evt);
            }
        });
        cbxTipoIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoIngreActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 140, -1));

        tblIngredientes.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        tblIngredientes.setForeground(new java.awt.Color(102, 102, 102));
        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblIngredientes.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tblIngredientesMouseWheelMoved(evt);
            }
        });
        tblIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngredientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIngredientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 126, 379, 281));

        txtNomIngre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtNomIngre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomIngreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNomIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 180, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Ingrediente nuevo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jButton1.setBackground(new java.awt.Color(18, 91, 0));
        jButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Categoría");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngredientesMouseClicked
        int fila = tblIngredientes.getSelectedRow();
        int codigo = Integer.parseInt(tblIngredientes.getValueAt(fila, 0).toString());
        String nombre = tblIngredientes.getValueAt(fila, 1).toString();
        String tipo = tblIngredientes.getValueAt(fila, 2).toString();

        txtCodIngre.setText(codigo + "");
        txtNomIngrediente.setText(nombre);
        cargarComboBox2(cbxUnidadMedida, tipo);
        dispose();
    }//GEN-LAST:event_tblIngredientesMouseClicked

    private void cbxTipoIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoIngreActionPerformed
//        tipIng = cbxTipoIngre.getSelectedItem().toString();
//        if(cbxTipoIngre.getSelectedItem().equals("Seleccionar")){
//            mostrarTablaIngredientes();
//        }else{
//             mostrarTablaIngrexTipo(tipIng);
//             aplicarFiltro();
//        }

    }//GEN-LAST:event_cbxTipoIngreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNomIngre.getText().isEmpty() || cbxTipoIngre.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, agrega un ingrediente o completa los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            //Agregar un ingrediente
            i = new IngredienteDTO();
            id = new ingredienteDAO();
            i.setNombre(txtNomIngre.getText());
            //  Para asignar el tipo de ingrediente
            int indice_ingre = cbxTipoIngre.getSelectedIndex();
            i.setTipo(listaTipos.get(indice_ingre - 1));
            id.agregar(i);
            String tipo = cbxTipoIngre.getSelectedItem().toString();
            String nombre = txtNomIngre.getText();
            mostrarTablaIngredientes();

            int fila = tblIngredientes.getRowCount() - 1;
            int codigo = Integer.parseInt(tblIngredientes.getValueAt(fila, 0).toString());
            txtCodIngre.setText(codigo + "");
            txtNomIngrediente.setText(nombre);
            cargarComboBox2(cbxUnidadMedida, tipo);

            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxTipoIngreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoIngreItemStateChanged
//        if (evt.getStateChange() == ItemEvent.SELECTED) {
//            String tipoIngre = (String) cbxTipoIngre.getSelectedItem();
//            cargarComboBox2(cmbMedida, tipoIngre);
//        }
    }//GEN-LAST:event_cbxTipoIngreItemStateChanged

    private void tblIngredientesMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tblIngredientesMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIngredientesMouseWheelMoved

    private void txtNomIngreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomIngreKeyTyped
      char c = evt.getKeyChar();
        if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
            evt.consume();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_txtNomIngreKeyTyped

    public void aplicarFiltro() {
        txtBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = txtBuscar.getText();
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
    }

    public void filtro() {
        filtro = txtBuscar.getText();
        trsfiltro = new TableRowSorter(tblIngredientes.getModel());
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 1));
        tblIngredientes.setRowSorter(trsfiltro);
    }

    public void mostrarTablaIngredientes() {
        //Mostrar productos en la tabla
        modelo.setRowCount(0);
        id = new ingredienteDAO();
        ArrayList<IngredienteDTO> listaIngredientes = new ArrayList<>();
        listaIngredientes = id.listarTodos();
        for (int i = 0; i < listaIngredientes.size(); i++) {
            Object[] data = {
                listaIngredientes.get(i).getId(),
                listaIngredientes.get(i).getNombre(),
                listaIngredientes.get(i).getTipo().getNombre(),};
            modelo.addRow(data);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buscarIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarIngredientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxTipoIngre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngredientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNomIngre;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox2(JComboBox cmbMedida, String tipoIngre) {
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        cmbMedida.setModel(comboModel);

        if (tipoIngre == null) {
            System.out.println("No se ha seleccionado ningún ingrediente en cbxAlimentos.");
            return;
        }
        System.out.println("Ingrediente seleccionado en cbxAlimentos: " + tipoIngre);

        // Llamar al DAO para obtener la lista de medidas por nombre de ingrediente
        MedidaDAO medidaDAO = new MedidaDAO();
        ArrayList<MedidaDTO> medidas = medidaDAO.listarMedidaxTipo(tipoIngre);

        // Agregar el primer elemento de selección
        comboModel.addElement("Seleccione");

        // Agregar las medidas al ComboBoxModel de cmbMedida
        for (MedidaDTO medida : medidas) {
            comboModel.addElement(medida.getNombre());
        }
    }
//    
//
}
