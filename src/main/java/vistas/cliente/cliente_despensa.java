package vistas.cliente;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.DespensaDTO;
import modelo.IngredienteDTO;
import modelo.TipoIngrediente;
import modelo.Usuario;
import modeloDAO.DespensaDAO;
import modeloDAO.UsurarioDAO;
import modeloDAO.ingredienteDAO;

public class cliente_despensa extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    String dni;
    UsurarioDAO usDao = new UsurarioDAO();
    DespensaDAO despDao;
    ingredienteDAO ingDAO;
    TipoIngrediente tP = new TipoIngrediente();
    IngredienteDTO ingD = new IngredienteDTO();
    int cod;
    ArrayList<DespensaDTO> listaDetalle = new ArrayList<>();

    public cliente_despensa() {

    }

    public cliente_despensa(String dniob) {
        initComponents();
        dni = dniob;
        prueba();
        establecerColumnas();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        frutasVerduras = new javax.swing.JButton();
        lacteos = new javax.swing.JButton();
        abarrotes = new javax.swing.JButton();
        carnes = new javax.swing.JButton();
        pastas = new javax.swing.JButton();
        congelados = new javax.swing.JButton();
        QueCocinareHoy = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cbxAlimentos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDespensa = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(1049, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Mi despensa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 89, 19));
        jLabel2.setText("de");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 60, -1));

        jLNombre.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(170, 89, 19));
        jLNombre.setText("nombre");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 180, -1));

        frutasVerduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/frutasverduras.png"))); // NOI18N
        frutasVerduras.setBorder(null);
        frutasVerduras.setBorderPainted(false);
        frutasVerduras.setContentAreaFilled(false);
        frutasVerduras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/FrutasVerduras2.png"))); // NOI18N
        frutasVerduras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/FrutasVerduras2.png"))); // NOI18N
        frutasVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frutasVerdurasActionPerformed(evt);
            }
        });
        jPanel1.add(frutasVerduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lacteos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/lacteos.png"))); // NOI18N
        lacteos.setBorder(null);
        lacteos.setBorderPainted(false);
        lacteos.setContentAreaFilled(false);
        lacteos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/Lacteos2.png"))); // NOI18N
        lacteos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/Lacteos2.png"))); // NOI18N
        lacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacteosActionPerformed(evt);
            }
        });
        jPanel1.add(lacteos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        abarrotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/abarrotes.png"))); // NOI18N
        abarrotes.setBorder(null);
        abarrotes.setBorderPainted(false);
        abarrotes.setContentAreaFilled(false);
        abarrotes.setOpaque(true);
        abarrotes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/abarrotes2.png"))); // NOI18N
        abarrotes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/abarrotes2.png"))); // NOI18N
        abarrotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abarrotesActionPerformed(evt);
            }
        });
        jPanel1.add(abarrotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 125, 150, 150));

        carnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/carnes1.png"))); // NOI18N
        carnes.setToolTipText("");
        carnes.setBorder(null);
        carnes.setBorderPainted(false);
        carnes.setContentAreaFilled(false);
        carnes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/carnes2.png"))); // NOI18N
        carnes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/carnes2.png"))); // NOI18N
        carnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnesActionPerformed(evt);
            }
        });
        jPanel1.add(carnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        pastas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/especias.png"))); // NOI18N
        pastas.setBorder(null);
        pastas.setBorderPainted(false);
        pastas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/Especias2.png"))); // NOI18N
        pastas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/especias2.png"))); // NOI18N
        pastas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastasActionPerformed(evt);
            }
        });
        jPanel1.add(pastas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        congelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/enlatados.png"))); // NOI18N
        congelados.setBorder(null);
        congelados.setBorderPainted(false);
        congelados.setContentAreaFilled(false);
        congelados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/enlatados2.png"))); // NOI18N
        congelados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/enlatados2.png"))); // NOI18N
        congelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congeladosActionPerformed(evt);
            }
        });
        jPanel1.add(congelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 150, -1));

        QueCocinareHoy.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        QueCocinareHoy.setText("¿Qué tengo para cocinar?");
        jPanel1.add(QueCocinareHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(46, 46, 46));
        jLabel11.setText("¡Selecciona un producto y agrégalo a tu despensa!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(46, 46, 46));
        jLabel12.setText("Alimento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/Line 135.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 20, -1));

        jButton5.setBackground(new java.awt.Color(18, 91, 0));
        jButton5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 80, 30));

        jButton6.setBackground(new java.awt.Color(210, 76, 0));
        jButton6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, 30));

        cbxAlimentos.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        cbxAlimentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAlimentosItemStateChanged(evt);
            }
        });
        cbxAlimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxAlimentosMouseClicked(evt);
            }
        });
        cbxAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAlimentosActionPerformed(evt);
            }
        });
        jPanel1.add(cbxAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 240, 30));

        tblDespensa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "N°", "Ingrediente"
            }
        ));
        tblDespensa.setToolTipText("");
        tblDespensa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDespensa.setDragEnabled(true);
        jScrollPane1.setViewportView(tblDespensa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 480, 210));

        txtBuscar.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setText("Buscar");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 315, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void prueba() {
        System.out.println(dni);
        Usuario us = usDao.ObtenerUsuario(dni);
        System.out.println(us.getNombre() + " cli_despensa");
        jLNombre.setText(us.getNombre());
    }

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if (txtBuscar.getText().equals("Buscar")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.black);
        }

//        if (unidad.getText().isEmpty()) {
//            unidad.setText("Kilogramo");
//            unidad.setForeground(new Color(204, 204, 204));
//        }

    }//GEN-LAST:event_txtBuscarMousePressed

    private void frutasVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frutasVerdurasActionPerformed
        cargarComboBox(cbxAlimentos, 1);
        tP.setNombre("Frutas y Verduras");
        System.out.println(tP.getNombre());
    }//GEN-LAST:event_frutasVerdurasActionPerformed

    private void cbxAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAlimentosActionPerformed
        // Obtener el item seleccionado del ComboBox
        String selectedItem = (String) cbxAlimentos.getSelectedItem();

        // Obtener la medida utilizando el método obtenerMedidaDesdeCadena
        String medida = ingD.obtenerMedidaDesdeCadena(selectedItem);

        // Mostrar la medida en el JTextField
//        unidad.setText(medida);
    }//GEN-LAST:event_cbxAlimentosActionPerformed

    private void lacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacteosActionPerformed
        cargarComboBox(cbxAlimentos, 2);
        tP.setNombre("Lacteos");
        System.out.println(tP.getNombre());
    }//GEN-LAST:event_lacteosActionPerformed

    private void abarrotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abarrotesActionPerformed
        cargarComboBox(cbxAlimentos, 3);
        tP.setNombre("Abarrotes");
        System.out.println(tP.getNombre());
    }//GEN-LAST:event_abarrotesActionPerformed

    private void carnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnesActionPerformed
        cargarComboBox(cbxAlimentos, 4);
        tP.setNombre("Carnes");
        System.out.println(tP.getNombre());// TODO add your handling code here:
    }//GEN-LAST:event_carnesActionPerformed

    private void pastasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastasActionPerformed
        cargarComboBox(cbxAlimentos, 5);
        tP.setNombre("Especias");
        System.out.println(tP.getNombre());// TODO add your handling code here:
    }//GEN-LAST:event_pastasActionPerformed

    private void congeladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congeladosActionPerformed
        cargarComboBox(cbxAlimentos, 6);
        tP.setNombre("Enlatados");
        System.out.println(tP.getNombre());// TODO add your handling code here:
    }//GEN-LAST:event_congeladosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String nombreIngrediente = (String) cbxAlimentos.getSelectedItem();
//        String medida = unidad.getText();
        despDao = new DespensaDAO();
        ingDAO = new ingredienteDAO();

        // Obtener los IDs de la base de datos
        int idIngrediente = ingDAO.obtenerIdIngrediente(nombreIngrediente);

        despDao.agregar(dni, idIngrediente); // Adjust method to accept idIngrediente and cant
//        unidad.setText("");

        mostrarTabla();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbxAlimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAlimentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAlimentosMouseClicked

    private void cbxAlimentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAlimentosItemStateChanged

    }//GEN-LAST:event_cbxAlimentosItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed


        int fila = tblDespensa.getSelectedRow();
        despDao = new DespensaDAO();

        cod = Integer.parseInt(tblDespensa.getValueAt(fila, 0).toString());
        despDao.eliminar(cod, dni);
        mostrarTabla();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void cargarComboBox(JComboBox c, int tipoIngredienteId) {
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        c.setModel(comboModel);

        // Agregar el primer elemento de selección
        comboModel.addElement("Ingrediente");

        // Llamar al DAO para obtener la lista de ingredientes por tipo
        ingredienteDAO ingredienteDAO = new ingredienteDAO();
        ArrayList<IngredienteDTO> ingredientes = ingredienteDAO.listaIngrexTipo(tipoIngredienteId);

        // Agregar los nombres de los ingredientes al ComboBoxModel
        for (IngredienteDTO ingrediente : ingredientes) {
            comboModel.addElement(ingrediente.getNombre()); // Agrega cada nombre de ingrediente recuperado
            System.out.println("Ingredientes: " + ingrediente.getNombre());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QueCocinareHoy;
    private javax.swing.JButton abarrotes;
    private javax.swing.JButton carnes;
    private javax.swing.JComboBox<String> cbxAlimentos;
    private javax.swing.JButton congelados;
    private javax.swing.JButton frutasVerduras;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lacteos;
    private javax.swing.JButton pastas;
    private javax.swing.JTable tblDespensa;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void establecerColumnas() {
        modelo.addColumn("N°");
        modelo.addColumn("Alimento");

        tblDespensa.setModel(modelo);
    }

    private void mostrarTabla() {
        modelo.setRowCount(0);
        despDao = new DespensaDAO();
        ArrayList<DespensaDTO> lista = new ArrayList<>();
        lista = despDao.listarTodos(dni);
        for (int i = 0; i < lista.size(); i++) {
            Object[] data = {
                lista.get(i).getIdDespensa(),
                lista.get(i).getNombre(),};
            modelo.addRow(data);
        }
        
    
    }




}
