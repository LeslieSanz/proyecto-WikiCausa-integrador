package vistas.admin;

import java.util.ArrayList;
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
    
    //Para almacenar el detalle de cada ingrediente en la receta: RecetaIngredientes
    RecetaIngredientesDTO dd;
    ArrayList<RecetaIngredientesDTO> listaDetalle = new ArrayList<>();
    
    //Modelo de la tabla donde se agregan los ingredientes de la receta
    DefaultTableModel modelo2 = new DefaultTableModel();
    
    //ArrayList mostrar los tipos de comida en el cbx
    TipoComida tc;
    tipoComidaDAO tcd = new tipoComidaDAO();
    ArrayList<TipoComida> listaTipos = new ArrayList<>();

    
    public admin_recetas() {
        initComponents();
        mostrarTipoComida();
        establecerColumnas2();
    }

    private void establecerColumnas2(){
        modelo2.addColumn("Ingrediente");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Medida");
        tblDetalle.setModel(modelo2);
    }
    
    //Metodo que recorre la lista de TipoComida, obtiene su nombre y los agrega uno por uno
    //al cbTipoComida
    private void mostrarTipoComida(){
        listaTipos = tcd.listarTodos();
        for(int i=0; i<listaTipos.size(); i++){
            cbxTipoComida.addItem(listaTipos.get(i).getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreReceta = new javax.swing.JTextField();
        btnEliminarIngre = new javax.swing.JButton();
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
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtCodIngre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdReceta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnBuscarIngredientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPreparacion = new javax.swing.JTextArea();
        pnlGuardar = new javax.swing.JPanel();
        btnGuardarCambios = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        txtNomImagen = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        cbxTipoComida = new javax.swing.JComboBox<>();
        btnAgregarIngre = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Agregar receta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtNombreReceta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtNombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 220, -1));

        btnEliminarIngre.setBackground(new java.awt.Color(210, 76, 0));
        btnEliminarIngre.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnEliminarIngre.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarIngre.setText("Eliminar");
        btnEliminarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIngreActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 90, 30));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Porción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txtPorcion.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Tiempo preparación");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txtTiempo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 90, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("min");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 320, 160));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cant.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Unidad de medida");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        cbxUnidadMedida.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbxUnidadMedida.setForeground(new java.awt.Color(102, 102, 102));
        cbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Presas", "Tazas", "Cucharadas", "Pedazo" }));
        jPanel1.add(cbxUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        txtCant.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 80, -1));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setText("Nro. de calorias");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        txtCalorias.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, -1));

        btnRegistrar.setBackground(new java.awt.Color(18, 91, 0));
        btnRegistrar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar receta");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 150, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 930, 20));

        txtCodIngre.setEditable(false);
        txtCodIngre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtCodIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 110, -1));

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Ingrediente");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel14.setText("Tipo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel15.setText("Id. Receta");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtIdReceta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtIdReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, -1));

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel16.setText("Seleccionar foto");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        btnBuscarIngredientes.setText("Buscar");
        btnBuscarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngredientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 80, -1));

        taPreparacion.setColumns(20);
        taPreparacion.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        taPreparacion.setRows(5);
        jScrollPane1.setViewportView(taPreparacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 410, 140));

        pnlGuardar.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardarCambios.setBackground(new java.awt.Color(241, 208, 75));
        btnGuardarCambios.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("Guardar");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnSeleccionar.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnSeleccionar.setText("Subir foto");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        txtNomImagen.setEditable(false);

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGuardarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar)
                    .addComponent(txtNomImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnSeleccionar)
                .addGap(18, 18, 18)
                .addComponent(txtNomImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(pnlGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 400, 230));

        cbxTipoComida.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbxTipoComida.setForeground(new java.awt.Color(102, 102, 102));
        cbxTipoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(cbxTipoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        btnAgregarIngre.setBackground(new java.awt.Color(18, 91, 0));
        btnAgregarIngre.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAgregarIngre.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarIngre.setText("Agregar");
        btnAgregarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngreActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 90, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 30, 390));

        jLabel17.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel17.setText("Ingredientes");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel18.setText("Preparación");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

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

    private void btnEliminarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIngreActionPerformed
        
    }//GEN-LAST:event_btnEliminarIngreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Primero, agregamos la receta
        r = new RecetaDTO();
        recetaDAO rd = new recetaDAO();
        r.setId(Integer.parseInt(txtIdReceta.getText()));
        r.setNombre(txtNombreReceta.getText());
        
        int indice_tipo = cbxTipoComida.getSelectedIndex();
        r.setTipo(listaTipos.get(indice_tipo-1));

        r.setPorcion(Integer.parseInt(txtPorcion.getText()));
        r.setTiempo(Integer.parseInt(txtTiempo.getText()));
        r.setCalorias(Double.parseDouble(txtCalorias.getText()));
        r.setPreparacion(taPreparacion.getText());
        rd.agregar(r);
        
        //Luego, sus detalles
        //Agregando detalles de cada ingrediente a la receta
        for (int i = 0; i < listaDetalle.size(); i++) {
            recetaIngredientesDAO rid = new recetaIngredientesDAO();
            rid.agregar(listaDetalle.get(i));
        }
        
        // Limpiar la listaDetalle para la próxima receta
        eliminarElementosTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngredientesActionPerformed
        buscarIngredientes busIng =new buscarIngredientes();
        busIng.setVisible(true);
    }//GEN-LAST:event_btnBuscarIngredientesActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
//        pd = new PersonaDao();
//        p = pd.listarUno(codigo);
//
//        //Modificar datos
//        p.setDni(txtDNIProfe.getText());
//        p.setNombre(txtNombreProfe.getText());
//        p.setApellido(txtApellidosProfe.getText());
//        p.setEmail(txtCorreoProfe.getText());
//        pd.modificar(p);
//
//        //Si se requiere agregar y/o modificar la foto
//        if(file!=null){
//            // Obtener solo el nombre del archivo sin la ruta
//            String nombreArchivo = file.getName();
//            p.setNom_imagen(nombreArchivo);
//            p.setArchivoFoto(file);
//            try {
//                pd.agregarFoto(p);
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(admin_profes.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, "Cambios guardados", "Información", JOptionPane.INFORMATION_MESSAGE);
//        limpiarCampos();
//        lblTitulo.setText("Registro de profesores");
//        btnAgregarProfe.setVisible(true);
//        //btnEliminarProfe.setVisible(true);
//        mostrarProfes();
//        pnlGuardar.setVisible(false);
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
//        // Crear un filtro para permitir solo archivos con extensión JPEG (JPG, JPEG)
//        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivos JPEG(*.JPG;*.JPEG)", "jpg", "jpeg");
//        // Crear un selector de archivos
//        JFileChooser archivo = new JFileChooser();
//        // Añadir el filtro al selector de archivos
//        archivo.addChoosableFileFilter(filtro);
//        // Establecer el título del diálogo del selector de archivos
//        archivo.setDialogTitle("Abrir archivo");
//        // Mostrar el diálogo de selección de archivos y guardar la respuesta del usuario
//        int ventana = archivo.showOpenDialog(null);
//        // Verificar si el usuario seleccionó un archivo (aprobó la selección)
//        if (ventana == JFileChooser.APPROVE_OPTION) {
//            // Obtener el archivo seleccionado
//            file = archivo.getSelectedFile();
//            // Establecer la ruta del archivo seleccionado en un campo de texto (txtNomImagen)
//            txtNomImagen.setText(String.valueOf(file));
//            // Cargar la imagen desde la ruta del archivo
//            Image foto = getToolkit().getImage(txtNomImagen.getText());
//            // Escalar la imagen a un tamaño de 200x200 píxeles
//            foto = foto.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//            // Establecer la imagen escalada como un icono en una etiqueta (lblFoto)
//            lblFoto.setIcon(new ImageIcon(foto));
//        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnAgregarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngreActionPerformed
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
    }//GEN-LAST:event_btnAgregarIngreActionPerformed
    
   
    
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
    private javax.swing.JButton btnAgregarIngre;
    private javax.swing.JButton btnBuscarIngredientes;
    private javax.swing.JButton btnEliminarIngre;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbxTipoComida;
    private javax.swing.JComboBox<String> cbxUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JTextArea taPreparacion;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCant;
    public static javax.swing.JTextField txtCodIngre;
    private javax.swing.JTextField txtIdReceta;
    private javax.swing.JTextField txtNomImagen;
    private javax.swing.JTextField txtNombreReceta;
    private javax.swing.JTextField txtPorcion;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
