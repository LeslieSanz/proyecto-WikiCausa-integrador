package vistas.cliente;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;

public class cliente_perfil extends javax.swing.JPanel {

    String dni;
    UsurarioDAO usDao = new UsurarioDAO();
    Usuario u;

    public cliente_perfil(String dniob) {
        initComponents();
        btnModificar.setEnabled(false);
        dni = dniob;
        MostrarDatosUsu(dniob);
        txtContraNue1.setEnabled(false);
        txtContraNue2.setEnabled(false);
        btnActPassword.setEnabled(false);

        //Detecta algun cambio en el jtextfield
        txtNombre.getDocument().addDocumentListener(new CambioDocumentListener());
        txtApe.getDocument().addDocumentListener(new CambioDocumentListener());
        txtCorreo.getDocument().addDocumentListener(new CambioDocumentListener());
        txtContraNue1.getDocument().addDocumentListener(new CambioDocumentListener());
        txtContraNue2.getDocument().addDocumentListener(new CambioDocumentListener());

    }

    public void MostrarDatosUsu(String dni) {
        Usuario us = usDao.ObtenerUsuario(dni);
        txtDni.setText(dni);
        txtNombre.setText(us.getNombre());
        txtApe.setText(us.getApellidos());
        txtCorreo.setText(us.getCorreo());
        jLNombre.setText(us.getNombre());
        txtNivel.setText(us.getNivel());
        txtEdad.setText(Integer.toString(us.getEdad()));
        txtAltura.setText(Double.toString(us.getAltura()));
        txtPeso.setText(Double.toString(us.getPeso()));
        gen.setText(us.getSexo());
        txtMin.setText(Double.toString(us.getCalmin()));
        txtMax.setText(Double.toString(us.getCalmax()));
        txtFrecuencia.setText(Integer.toString(us.getFrecuencia()));
        btnModificar.setEnabled(false);

        System.out.println(us.getCorreo());
    }

    public boolean validarPassword() {
        Usuario us = usDao.obtenerPassword(dni);
        String contra = us.getPassword();
        if (contra.equalsIgnoreCase(txtpassAct.getText())) {
            txtContraNue1.setEnabled(true);
            txtContraNue2.setEnabled(true);
            btnActPassword.setEnabled(true);
            return true;
        } else {
            txtContraNue1.setEnabled(false);
            txtContraNue2.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Contraseña actual incorrecta");
            return false;
        }
    }

    public void VerificarCambioPassword() {
        if (txtContraNue1.getText().equalsIgnoreCase(txtContraNue2.getText()) && validarPassword()) {
            usDao.editarContraUsu(txtContraNue1.getText(), dni);
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña no coincide");
        }
    }

    public boolean VerificarCambiosTXT(String nombres, String Ape, String Correo) {
        Usuario us = usDao.ObtenerUsuario(dni);
        String nomAc = us.getNombre();
        String apeAc = us.getApellidos();
        String corrAc = us.getCorreo();

        if (!nomAc.equalsIgnoreCase(nombres) || !apeAc.equalsIgnoreCase(Ape) || !corrAc.equalsIgnoreCase(Correo)) {
            return true;
        } else {
            return false;
        }
    }

    public void habilitarbtnMod() {

        if (VerificarCambiosTXT(txtNombre.getText(), txtApe.getText(), txtCorreo.getText())) {
            btnModificar.setEnabled(true);
        } else {
            btnModificar.setEnabled(false);
        }
    }

    private class CambioDocumentListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            habilitarbtnMod();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            habilitarbtnMod();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // No relevante para JTextComponent
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupNivel = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtpassAct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnValidarPassword = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnActPassword = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtContraNue1 = new javax.swing.JPasswordField();
        txtContraNue2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rbtnPrin = new javax.swing.JRadioButton();
        rbtnInter = new javax.swing.JRadioButton();
        rbtnAvanza = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        cbxFrec = new javax.swing.JComboBox<>();
        txtNivel = new javax.swing.JTextField();
        txtFrecuencia = new javax.swing.JTextField();
        btnModPred2 = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Recalcular = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        gen = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Perfil de usuario de");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtNombre.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 188, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Apellidos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        txtApe.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeActionPerformed(evt);
            }
        });
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });
        jPanel2.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 190, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("DNI");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtDni.setEditable(false);
        txtDni.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 185, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText("Correo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 190, -1));

        btnModificar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 607, 195));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpassAct.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel3.add(txtpassAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña actual");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        btnValidarPassword.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnValidarPassword.setText("Validar");
        btnValidarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(btnValidarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        btnActPassword.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnActPassword.setText("Actualizar");
        btnActPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActPasswordActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña nueva");

        txtContraNue1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtContraNue1.setText("jPasswordField1");

        txtContraNue2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtContraNue2.setText("jPasswordField2");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("Confirmar contraseña");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtContraNue1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtContraNue2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnActPassword))
                    .addComponent(jLabel9))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActPassword)
                    .addComponent(txtContraNue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraNue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 607, 260));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preferencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText("Nivel culinario");

        btnGroupNivel.add(rbtnPrin);
        rbtnPrin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnPrin.setText("Principiante");
        rbtnPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPrinActionPerformed(evt);
            }
        });

        btnGroupNivel.add(rbtnInter);
        rbtnInter.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnInter.setText("Intermedio");
        rbtnInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInterActionPerformed(evt);
            }
        });

        btnGroupNivel.add(rbtnAvanza);
        rbtnAvanza.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnAvanza.setText("Avanzado");

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText("Frecuencia ");

        cbxFrec.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cbxFrec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cada 7 días", "Cada 14 días", "Cada 21 días", " " }));
        cbxFrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFrecActionPerformed(evt);
            }
        });

        txtNivel.setEditable(false);
        txtNivel.setForeground(new java.awt.Color(102, 102, 102));
        txtNivel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNivel.setText("--Nivel--");
        txtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelActionPerformed(evt);
            }
        });

        txtFrecuencia.setEditable(false);
        txtFrecuencia.setForeground(new java.awt.Color(102, 102, 102));
        txtFrecuencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFrecuencia.setText("--Frecuencia--");

        btnModPred2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnModPred2.setText("Modificar");
        btnModPred2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPred2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbtnPrin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnInter))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbxFrec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(rbtnAvanza)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(btnModPred2)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFrecuencia)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPrin)
                    .addComponent(rbtnInter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnAvanza)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnModPred2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLNombre.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(170, 89, 19));
        jLNombre.setText("nombre");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recalcular calorías", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        Recalcular.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Recalcular.setText("Modificar");
        Recalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecalcularActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setText("Edad:");

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel13.setText("Peso:");

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setText("Altura:");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 51, 0));
        jLabel21.setText("Mínimo:");

        txtMin.setEditable(false);
        txtMin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 51, 0));
        jLabel22.setText("Máximo:");

        txtMax.setEditable(false);
        txtMax.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxActionPerformed(evt);
            }
        });

        Calcular.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        gen.setEditable(false);
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(57, 57, 57))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Calcular))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Recalcular)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Recalcular)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 298, 270));
        jPanel6.getAccessibleContext().setAccessibleName("Calcular calorías");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Usuario us = usDao.ObtenerUsuario(dni);
        us.setNombre(txtNombre.getText());
        us.setApellidos(txtApe.getText());
        us.setCorreo(txtCorreo.getText());
        usDao.editarDatosUsu(dni, us);
        jLNombre.setText(us.getNombre());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnValidarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarPasswordActionPerformed
        validarPassword();
    }//GEN-LAST:event_btnValidarPasswordActionPerformed

    private void btnActPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActPasswordActionPerformed
        VerificarCambioPassword();
    }//GEN-LAST:event_btnActPasswordActionPerformed

    private void rbtnPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPrinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPrinActionPerformed

    private void rbtnInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnInterActionPerformed

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        char c = evt.getKeyChar();
        if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void RecalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecalcularActionPerformed
        // Obtener datos de los campos de texto
        int edad = Integer.parseInt(txtEdad.getText());
        double peso2 = Double.parseDouble(txtPeso.getText());
        double altura2 = Double.parseDouble(txtAltura.getText()); // Asegúrate de usar el campo de altura correcto
        double minimo = Double.parseDouble(txtMin.getText());
        double maximo = Double.parseDouble(txtMax.getText());

// Mostrar cuadro de diálogo de confirmación
        int response = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea modificar los datos?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

// Si el usuario confirma, realiza la actualización
        if (response == JOptionPane.YES_OPTION) {
            // Establecer los valores en el objeto usuario
            u.setEdad(edad);
            u.setPeso(peso2);
            u.setAltura(altura2);
            u.setCalmin(minimo);
            u.setCalmax(maximo);

            // Llamar al método para editar los datos del usuario
            usDao.editarDatosUsu3(dni, u);

            // Opcional: Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Datos modificados exitosamente.");
        } else {
            // Opcional: Mostrar mensaje de cancelación
            JOptionPane.showMessageDialog(null, "Modificación cancelada.");
        }

    }//GEN-LAST:event_RecalcularActionPerformed

    private void cbxFrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFrecActionPerformed

    private void txtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelActionPerformed

    private void btnModPred2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPred2ActionPerformed
        // Obtener usuario por DNI
        Usuario us = usDao.ObtenerUsuario(dni);

// Determinar el nivel
        String nivel = null;
        if (rbtnPrin.isSelected()) {
            nivel = "P";
        }
        if (rbtnInter.isSelected()) {
            nivel = "I";
        }
        if (rbtnAvanza.isSelected()) {
            nivel = "A";
        }

// Determinar la frecuencia
        int frec = 0;
        switch (cbxFrec.getSelectedIndex()) {
            case 0:
                frec= Integer.parseInt(txtFrecuencia.getText());
            case 1:
                frec = 7;
                break;
            case 2:
                frec = 14;
                break;
            case 3:
                frec = 21;
                break;
        }

// Mostrar cuadro de diálogo de confirmación
        int response = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea modificar los datos?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

// Si el usuario confirma, realiza la actualización
        if (response == JOptionPane.YES_OPTION) {
            // Actualizar los campos de texto
            txtNivel.setText(nivel);
            txtFrecuencia.setText(Integer.toString(frec));

            // Establecer los valores en el objeto usuario
            us.setNivel(txtNivel.getText());
            us.setFrecuencia(Integer.parseInt(txtFrecuencia.getText()));

            // Llamar al método para editar los datos del usuario
            usDao.editarDatosUsu2(dni, us);

            // Actualizar la etiqueta con el nombre del usuario
            jLNombre.setText(us.getNombre());

            // Opcional: Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Datos modificados exitosamente.");
        } else {
            // Opcional: Mostrar mensaje de cancelación
            JOptionPane.showMessageDialog(null, "Modificación cancelada.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModPred2ActionPerformed

    private void txtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeActionPerformed

    private void txtMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // Obtener usuario por DNI
        u = usDao.ObtenerUsuario(dni);

// Obtener y convertir datos de los campos de texto
        String genero = gen.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        double peso2 = Double.parseDouble(txtPeso.getText());
        double altura2 = Double.parseDouble(txtAltura.getText()); // Asegúrate de obtener la altura

// Calcular calorías por día y por semana
        double calxdia = u.calculaCaloriasPorDia2(genero, edad, peso2, altura2);
        u.calcularCaloriasPorSemana(calxdia);

// Redondear y actualizar los campos de texto
        double ValorRedMin = Math.round(u.getCalmin() * 100) / 100.0;
        double ValorRedMax = Math.round(u.getCalmax() * 100) / 100.0;
        txtMin.setText(Double.toString(ValorRedMin));
        txtMax.setText(Double.toString(ValorRedMax));

    }//GEN-LAST:event_CalcularActionPerformed

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char c = evt.getKeyChar();
// Permitir solo números y el punto decimal
        if ((c < '0' || c > '9') && c != '.') {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Recalcular;
    private javax.swing.JButton btnActPassword;
    private javax.swing.ButtonGroup btnGroupNivel;
    private javax.swing.JButton btnModPred2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnValidarPassword;
    private javax.swing.JComboBox<String> cbxFrec;
    private javax.swing.JTextField gen;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton rbtnAvanza;
    private javax.swing.JRadioButton rbtnInter;
    private javax.swing.JRadioButton rbtnPrin;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApe;
    private javax.swing.JPasswordField txtContraNue1;
    private javax.swing.JPasswordField txtContraNue2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtpassAct;
    // End of variables declaration//GEN-END:variables
}
