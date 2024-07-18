package vistas.admin;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.IngredienteDTO;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modelo.TipoComida;
import modeloDAO.ingredienteDAO;
import modeloDAO.recetaDAO;
import modeloDAO.recetaIngredientesDAO;
import modeloDAO.tipoComidaDAO;

public class admin_recetas extends javax.swing.JPanel {

    //Declarar un objeto de la clase ingredientes
    IngredienteDTO i;
    //Declarar un objeto de la clase ingredineteDAO
    ingredienteDAO id;
    //Declarar un objeto de la clase receta
    RecetaDTO r;
    recetaDAO rd;

    //Para almacenar el detalle de cada ingrediente en la receta: RecetaIngredientes
    RecetaIngredientesDTO dd;
    ArrayList<RecetaIngredientesDTO> listaDetalle = new ArrayList<>();

    //Modelo de la tabla donde se agregan los ingredientes de la receta
    DefaultTableModel modelo2 = new DefaultTableModel();

    //ArrayList mostrar los tipos de comida en el cbx
    TipoComida tc;
    tipoComidaDAO tcd = new tipoComidaDAO();
    ArrayList<TipoComida> listaTipos = new ArrayList<>();

    File file;
    ImageIcon icono;
    ImageIcon iconoDefault = new ImageIcon("/img/cuenta/Profe.png");

    public admin_recetas() {
        initComponents();
        mostrarTipoComida();
        generaCodigoAutomatico();
        establecerColumnas2();

        //Ocultar paneles
        pnlIngredientes.setVisible(false);
        pnlPreparacion.setVisible(false);
        pnlFoto.setVisible(false);
    }

    private void establecerColumnas2() {
        modelo2.addColumn("Ingrediente");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Medida");
        tblDetalle.setModel(modelo2);
    }

    //Metodo que recorre la lista de TipoComida, obtiene su nombre y los agrega uno por uno
    //al cbTipoComida
    private void mostrarTipoComida() {
        listaTipos = tcd.listarTodos();
        for (int i = 0; i < listaTipos.size(); i++) {
            cbxTipoComida.addItem(listaTipos.get(i).getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdReceta = new javax.swing.JTextField();
        pnlDatosBasicos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreReceta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbxTipoComida = new javax.swing.JComboBox<>();
        txtPorcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCalorias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSig1 = new javax.swing.JButton();
        pnlIngredientes = new javax.swing.JPanel();
        txtCodIngre = new javax.swing.JTextField();
        btnBuscarIngredientes = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarIngre = new javax.swing.JButton();
        btnEliminarIngre = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cbxUnidadMedida = new javax.swing.JComboBox<>();
        btnSig2 = new javax.swing.JButton();
        txtNomIngrediente = new javax.swing.JTextField();
        pnlPreparacion = new javax.swing.JPanel();
        btnValidar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPreparacion = new javax.swing.JTextArea();
        lblFalta = new javax.swing.JLabel();
        pnlFoto = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        txtNomImagen = new javax.swing.JTextField();
        pnlGuardar = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Agregar receta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Porción :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 10));

        txtIdReceta.setEditable(false);
        txtIdReceta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtIdReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 80, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Nombre :");

        txtNombreReceta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtNombreReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRecetaActionPerformed(evt);
            }
        });
        txtNombreReceta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreRecetaKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel14.setText("Tipo :");

        cbxTipoComida.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbxTipoComida.setForeground(new java.awt.Color(102, 102, 102));
        cbxTipoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        txtPorcion.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPorcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcionKeyTyped(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/people.png"))); // NOI18N

        txtTiempo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTiempoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel11.setText("Tiempo de preparación :");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/relojcito.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/info.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setText("Calorías :");

        txtCalorias.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaloriasActionPerformed(evt);
            }
        });
        txtCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaloriasKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("kcal/porción");

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("minutos.");

        btnSig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/sig.png"))); // NOI18N
        btnSig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSig1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosBasicosLayout = new javax.swing.GroupLayout(pnlDatosBasicos);
        pnlDatosBasicos.setLayout(pnlDatosBasicosLayout);
        pnlDatosBasicosLayout.setHorizontalGroup(
            pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(63, 63, 63)
                        .addComponent(txtPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                        .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSig1))
                            .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 38, Short.MAX_VALUE))
        );
        pnlDatosBasicosLayout.setVerticalGroup(
            pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbxTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(pnlDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98))
                    .addGroup(pnlDatosBasicosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSig1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(pnlDatosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 520, 180));

        pnlIngredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodIngre.setEditable(false);
        txtCodIngre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtCodIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodIngreActionPerformed(evt);
            }
        });
        pnlIngredientes.add(txtCodIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 15, 40, -1));

        btnBuscarIngredientes.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnBuscarIngredientes.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarIngredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/buscar.png"))); // NOI18N
        btnBuscarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngredientesActionPerformed(evt);
            }
        });
        pnlIngredientes.add(btnBuscarIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, -1, -1));

        jLabel17.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel17.setText("Ingredientes");
        pnlIngredientes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 29, -1, -1));

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Ingrediente :");
        pnlIngredientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 84, -1, 30));

        txtCant.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });
        pnlIngredientes.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 87, 100, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cant: ");
        pnlIngredientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 89, -1, 20));

        btnAgregarIngre.setBackground(new java.awt.Color(18, 91, 0));
        btnAgregarIngre.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAgregarIngre.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarIngre.setText("Agregar");
        btnAgregarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngreActionPerformed(evt);
            }
        });
        pnlIngredientes.add(btnAgregarIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 178, 90, 30));

        btnEliminarIngre.setBackground(new java.awt.Color(210, 76, 0));
        btnEliminarIngre.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnEliminarIngre.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarIngre.setText("Eliminar");
        btnEliminarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIngreActionPerformed(evt);
            }
        });
        pnlIngredientes.add(btnEliminarIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 90, 30));

        tblDetalle.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        tblDetalle.setForeground(new java.awt.Color(102, 102, 102));
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

        pnlIngredientes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 178, 320, 140));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Unidad de medida :");
        pnlIngredientes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 130, -1, 30));

        cbxUnidadMedida.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbxUnidadMedida.setForeground(new java.awt.Color(102, 102, 102));
        cbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Unidades", "Tazas", "Cucharadas", "Cucharaditas", "Gramos", "Presas" }));
        cbxUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadMedidaActionPerformed(evt);
            }
        });
        pnlIngredientes.add(cbxUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        btnSig2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/sig.png"))); // NOI18N
        btnSig2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSig2ActionPerformed(evt);
            }
        });
        pnlIngredientes.add(btnSig2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 268, -1, -1));

        txtNomIngrediente.setEditable(false);
        txtNomIngrediente.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtNomIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomIngredienteActionPerformed(evt);
            }
        });
        pnlIngredientes.add(txtNomIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 87, 140, -1));

        jPanel1.add(pnlIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 520, 330));

        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/sig.png"))); // NOI18N
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel18.setText("Preparación");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/preparacion.png"))); // NOI18N

        taPreparacion.setColumns(10);
        taPreparacion.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        taPreparacion.setRows(5);
        jScrollPane1.setViewportView(taPreparacion);

        lblFalta.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblFalta.setForeground(new java.awt.Color(204, 51, 0));
        lblFalta.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout pnlPreparacionLayout = new javax.swing.GroupLayout(pnlPreparacion);
        pnlPreparacion.setLayout(pnlPreparacionLayout);
        pnlPreparacionLayout.setHorizontalGroup(
            pnlPreparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreparacionLayout.createSequentialGroup()
                .addGroup(pnlPreparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlPreparacionLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pnlPreparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPreparacionLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(pnlPreparacionLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlPreparacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblFalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValidar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlPreparacionLayout.setVerticalGroup(
            pnlPreparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreparacionLayout.createSequentialGroup()
                .addGroup(pnlPreparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPreparacionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPreparacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPreparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(pnlPreparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 450, 290));

        btnRegistrar.setBackground(new java.awt.Color(18, 91, 0));
        btnRegistrar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar ");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSeleccionar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(102, 102, 102));
        btnSeleccionar.setText("Buscar foto");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        txtNomImagen.setEditable(false);

        pnlGuardar.setBackground(new java.awt.Color(255, 255, 255));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/receta-default.png"))); // NOI18N

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGuardarLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFotoLayout = new javax.swing.GroupLayout(pnlFoto);
        pnlFoto.setLayout(pnlFotoLayout);
        pnlFotoLayout.setHorizontalGroup(
            pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlFotoLayout.createSequentialGroup()
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlFotoLayout.setVerticalGroup(
            pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFotoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionar)
                    .addComponent(txtNomImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(pnlFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 450, 360));

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

    private void btnEliminarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIngreActionPerformed
        int selectedRow = tblDetalle.getSelectedRow();
        if (selectedRow != -1) {
            // Remover el elemento de la lista `listaDetalle`
            listaDetalle.remove(selectedRow);
            // Actualizar la tabla
            mostrarTablaDetalle();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarIngreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Primero, agregamos la receta
        r = new RecetaDTO();
        rd = new recetaDAO();
        r.setId(txtIdReceta.getText());
        r.setNombre(txtNombreReceta.getText());

        int indice_tipo = cbxTipoComida.getSelectedIndex();
        r.setTipo(listaTipos.get(indice_tipo - 1));

        r.setPorcion(Integer.parseInt(txtPorcion.getText()));
        r.setTiempo(Integer.parseInt(txtTiempo.getText()));
        r.setCalorias(Double.parseDouble(txtCalorias.getText()));
        r.setPreparacion(taPreparacion.getText());

        //Para agregar la foto
        if (file != null) {
            // Obtener solo el nombre del archivo sin la ruta
            String nombreArchivo = file.getName();
            System.out.println("El nombre del archivo es" + nombreArchivo);
            r.setImagen(nombreArchivo);

        }

        // Llamar al método agregar del DAO
        boolean resultado = rd.agregar(r);

        // Verificar si la receta se agregó correctamente
        if (resultado) {
            // Copiar el archivo de imagen a la carpeta del proyecto
            if (file != null) {
                String carpetaDestino = "recetas";
                File destino = new File(carpetaDestino, file.getName());
                try {
                    Files.copy(file.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    JOptionPane.showMessageDialog(this, "Receta agregada exitosamente con imagen");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Receta agregada, pero error al copiar la imagen");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Receta agregada exitosamente");
            }
        }

        //Luego, sus detalles
        //Agregando detalles de cada ingrediente a la receta
        for (int i = 0; i < listaDetalle.size(); i++) {
            recetaIngredientesDAO rid = new recetaIngredientesDAO();
            rid.agregar(listaDetalle.get(i));
        }

        //Limpiar los txt la próxima receta
        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // Crear un filtro para permitir solo archivos con extensión JPEG (JPG, JPEG)
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivos JPEG(*.JPG;*.JPEG)", "jpg", "jpeg");
        // Crear un selector de archivos
        JFileChooser archivo = new JFileChooser();
        // Añadir el filtro al selector de archivos
        archivo.addChoosableFileFilter(filtro);
        // Establecer el título del diálogo del selector de archivos
        archivo.setDialogTitle("Abrir archivo");
        // Mostrar el diálogo de selección de archivos y guardar la respuesta del usuario
        int ventana = archivo.showOpenDialog(null);
        // Verificar si el usuario seleccionó un archivo (aprobó la selección)
        if (ventana == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            file = archivo.getSelectedFile();
            // Establecer la ruta del archivo seleccionado en un campo de texto (txtNomImagen)
            txtNomImagen.setText(String.valueOf(file));
            // Cargar la imagen desde la ruta del archivo
            Image foto = getToolkit().getImage(txtNomImagen.getText());
            // Escalar la imagen a un tamaño de 200x200 píxeles
            foto = foto.getScaledInstance(312, 234, Image.SCALE_DEFAULT);
            // Establecer la imagen escalada como un icono en una etiqueta (lblFoto)
            lblFoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnAgregarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngreActionPerformed

        if (txtNomIngrediente.getText().isEmpty() || txtCant.getText().isEmpty() || cbxUnidadMedida.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ingrediente o complete los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
// Obteniendo los datos de los campos
            String cant = txtCant.getText();
            String medida = cbxUnidadMedida.getSelectedItem().toString();

            // Buscando ingrediente
            String codigo = txtCodIngre.getText();
            id = new ingredienteDAO();
            i = id.listarUno(codigo);

            // Creando un nuevo objeto RecetaIngredientesDTO
            RecetaIngredientesDTO dd = new RecetaIngredientesDTO();
            dd.setIngrediente(i);
            dd.setCantidad(cant);
            dd.setMedida(medida);
            dd.setIdReceta(txtIdReceta.getText());

            // Agregando a la lista
            listaDetalle.add(dd);

            // Actualizar la tabla
            mostrarTablaDetalle();

            // Limpiar los campos de entrada
            txtNomIngrediente.setText("");
            txtCant.setText("");
            cbxUnidadMedida.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnAgregarIngreActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // Obtener el texto ingresado en el textarea
        String textoPreparacion = taPreparacion.getText().toLowerCase();

        System.out.println(textoPreparacion);

        // StringBuilder para ingredientes faltantes
        StringBuilder ingredientesFaltantes = new StringBuilder();

        // Verificar si todos los ingredientes están presentes
        for (int i = 0; i < listaDetalle.size(); i++) {
            if (!textoPreparacion.contains(listaDetalle.get(i).getIngrediente().getNombre().toLowerCase())) {
                if (ingredientesFaltantes.length() > 0) {
                    ingredientesFaltantes.append(", ");
                }
                ingredientesFaltantes.append(listaDetalle.get(i).getIngrediente().getNombre().toLowerCase());
            }
        }

        // Mostrar el resultado el un panel
        if (ingredientesFaltantes.length() == 0) {
            //JOptionPane.showMessageDialog(this, "Todos los ingredientes están incluidos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            lblFalta.setText("Todos los ingredientes están incluidos c: ");
            pnlFoto.setVisible(true);
        } else {
            lblFalta.setText("Faltan ingredientes: " + ingredientesFaltantes.toString());
            //JOptionPane.showMessageDialog(this, "Faltan ingredientes: " + ingredientesFaltantes.toString(), "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnBuscarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngredientesActionPerformed
        buscarIngredientes busIng = new buscarIngredientes();
        busIng.setVisible(true);
    }//GEN-LAST:event_btnBuscarIngredientesActionPerformed

    private void btnSig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSig1ActionPerformed
        // Verificar que todos los campos estén llenos
        if (txtNombreReceta.getText().isEmpty()
                || cbxTipoComida.getSelectedItem().equals("Seleccionar")
                || txtPorcion.getText().isEmpty()
                || txtTiempo.getText().isEmpty()
                || txtCalorias.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.");
            return;
        }

        // Validar que txtNombreReceta solo tenga letras
        String nombreReceta = txtNombreReceta.getText();
        if (!nombreReceta.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan letras en el nombre de la receta.");
            txtNombreReceta.requestFocus();
            return;
        }

        // Validar que cbxTipoComida tenga una opción seleccionada distinta de "Seleccionar"
        if (cbxTipoComida.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida para el tipo de comida.");
            cbxTipoComida.requestFocus();
            return;
        }

        // Validar que txtPorcion solo tenga números enteros
        try {
            Integer.parseInt(txtPorcion.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan números enteros en la porción.");
            txtPorcion.requestFocus();
            return;
        }

        // Validar que txtTiempo solo tenga números enteros
        try {
            Integer.parseInt(txtTiempo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan números enteros en el tiempo.");
            txtTiempo.requestFocus();
            return;
        }

        // Validar que txtCalorias solo tenga números con decimales
        try {
            Double.parseDouble(txtCalorias.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan números con decimales en las calorías.");
            txtCalorias.requestFocus();
            return;
        }

        // Si todas las validaciones pasan, hacer visible pnlIngredientes
        pnlIngredientes.setVisible(true);
    }//GEN-LAST:event_btnSig1ActionPerformed

    private void btnSig2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSig2ActionPerformed
        // Validar que haya al menos un ingrediente agregado
        if (listaDetalle.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ingredientes");
            btnBuscarIngredientes.requestFocus();
        } else {
            pnlPreparacion.setVisible(true);
        }


    }//GEN-LAST:event_btnSig2ActionPerformed

    private void cbxUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUnidadMedidaActionPerformed

    private void txtNomIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomIngredienteActionPerformed

    private void txtCodIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodIngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodIngreActionPerformed

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
        if (txtCant.getText().length() >= 5) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtCantKeyTyped

    private void txtPorcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcionKeyTyped

    private void txtTiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoKeyTyped

    private void txtCaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaloriasKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0' && c <= '9') || c == '.')) {
            evt.consume(); // Consume el evento para evitar que se escriba el carácter
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaloriasKeyTyped

    private void txtCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaloriasActionPerformed

    private void txtNombreRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRecetaActionPerformed

    private void txtNombreRecetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRecetaKeyTyped
       char c = evt.getKeyChar();
        if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
            evt.consume();
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRecetaKeyTyped

    public void limpiarCampos() {
        txtIdReceta.setText(null);
        txtNombreReceta.setText(null);
        txtPorcion.setText(null);
        txtCalorias.setText(null);
        txtTiempo.setText(null);
        txtCodIngre.setText(null);
        txtCant.setText(null);
        cbxUnidadMedida.setSelectedIndex(0);
        cbxTipoComida.setSelectedIndex(0);
        taPreparacion.setText(null);
        eliminarElementosTabla();
        generaCodigoAutomatico();
    }

    public void eliminarElementosTabla() {
        for (int i = tblDetalle.getRowCount() - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
    }

    private void generaCodigoAutomatico() {
        //Generar el codigo del producto a partir del ultimo en la base de datos
        rd = new recetaDAO();
        String codReceta = rd.generaCodReceta();
        //Seteando el valor obtenido en el txtCodEntrada
        txtIdReceta.setText(codReceta);
    }

    public void mostrarTablaDetalle() {
        modelo2.setRowCount(0); // Esto eliminará todas las filas de la tabla

        // Agrega los elementos de la lista `listaDetalle` al modelo de la tabla
        for (RecetaIngredientesDTO item : listaDetalle) {
            Object[] data = {
                item.getIngrediente().getNombre(),
                item.getCantidad(),
                item.getMedida()
            };
            modelo2.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarIngre;
    private javax.swing.JButton btnBuscarIngredientes;
    private javax.swing.JButton btnEliminarIngre;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSig1;
    private javax.swing.JButton btnSig2;
    private javax.swing.JButton btnValidar;
    private javax.swing.JComboBox<String> cbxTipoComida;
    public static javax.swing.JComboBox<String> cbxUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel lblFalta;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel pnlDatosBasicos;
    private javax.swing.JPanel pnlFoto;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlIngredientes;
    private javax.swing.JPanel pnlPreparacion;
    private javax.swing.JTextArea taPreparacion;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCant;
    public static javax.swing.JTextField txtCodIngre;
    private javax.swing.JTextField txtIdReceta;
    private javax.swing.JTextField txtNomImagen;
    public static javax.swing.JTextField txtNomIngrediente;
    private javax.swing.JTextField txtNombreReceta;
    private javax.swing.JTextField txtPorcion;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
