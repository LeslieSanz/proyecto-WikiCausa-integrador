
package vistas.admin;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.IngredienteDTO;
import modelo.TipoIngrediente;
import modeloDAO.ingredienteDAO;
import modeloDAO.tipoIngredienteDAO;
import static vistas.admin.admin_recetas.txtCodIngre;

public class buscarIngredientes extends javax.swing.JFrame {
    //Declarar un objeto de la clase ingredientes
    IngredienteDTO i;
    //Declarar un objeto de la clase ingredienteDAO, para listar todos
    ingredienteDAO id;
    
    //Modelo para la tblIngredientes
    DefaultTableModel modelo = new DefaultTableModel();
    
    //ArrayList mostrar los tipos de ingredientes en el cbx
    TipoIngrediente ti;
    tipoIngredienteDAO tid = new tipoIngredienteDAO();
    ArrayList<TipoIngrediente> listaTipos = new ArrayList<>();
    
    //Esto es para el cbxTipoIngrediente
     String tipIng;
    
    public buscarIngredientes() {
        initComponents();
         establecerColumnas();
         mostrarTablaIngredientes();
         mostrarTipoIngrediente();
         this.setLocationRelativeTo(this);
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        tblIngredientes.setModel(modelo);
    }
    
    //Metodo que recorre la lista de TipoIngredientes, obtiene su nombre y los agrega uno por uno
    //al cbTipoIngre
    private void mostrarTipoIngrediente(){
        listaTipos = tid.listarTodos();
        for(int i=0; i<listaTipos.size(); i++){
            cbxTipoIngre.addItem(listaTipos.get(i).getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        cbxTipoIngre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("¡Encuentra los ingredientes y agrégalos a la receta!");

        jLabel2.setText("Filtrar por categoría");

        jLabel3.setText("Buscar");

        cbxTipoIngre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxTipoIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoIngreActionPerformed(evt);
            }
        });

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
        tblIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngredientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIngredientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipoIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxTipoIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngredientesMouseClicked
       int fila = tblIngredientes.getSelectedRow();
       int codigo = Integer.parseInt(tblIngredientes.getValueAt(fila, 0).toString());
       txtCodIngre.setText(codigo+"");
       dispose();
    }//GEN-LAST:event_tblIngredientesMouseClicked

    private void cbxTipoIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoIngreActionPerformed
        tipIng = cbxTipoIngre.getSelectedItem().toString();
        if(cbxTipoIngre.getSelectedItem().equals("Seleccionar")){
            mostrarTablaIngredientes();
        }else{
             mostrarTablaIngrexTipo(tipIng);
        } 
    }//GEN-LAST:event_cbxTipoIngreActionPerformed

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
                listaIngredientes.get(i).getTipo().getNombre()
                };
            modelo.addRow(data);
        }
    }
    
     private void mostrarTablaIngrexTipo(String tipIng){      
         modelo.setRowCount(0);
         id = new ingredienteDAO();   
        ArrayList<IngredienteDTO> listaIngredientes = new ArrayList<>();
        listaIngredientes = id.listaIngrexTipo(tipIng);
        
         for (int i=0;i<listaIngredientes.size();i++) {
             Object v[]={
                listaIngredientes.get(i).getId(), 
                listaIngredientes.get(i).getNombre(),
                listaIngredientes.get(i).getTipo().getNombre()
             };
             modelo.addRow(v);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblIngredientes;
    // End of variables declaration//GEN-END:variables
}
