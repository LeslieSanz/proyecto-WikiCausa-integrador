package vistas.cliente;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;

public class cliente_perfil extends javax.swing.JPanel {

    String dni;
    UsurarioDAO usDao = new UsurarioDAO();

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
        jLabel2 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Perfil de usuario de");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_perfil/perfildefault.png"))); // NOI18N

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
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jButton1.setText("Subir foto");

        jButton3.setText("Eliminar");

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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preferencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText("Nivel culinario");

        btnGroupNivel.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton1.setText("Principiante");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        btnGroupNivel.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton2.setText("Intermedio");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnGroupNivel.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton3.setText("Avanzado");

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText("Frecuencia ");

        jComboBox2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("Recalcular calorías");

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)))
                        .addGap(14, 14, 14))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLNombre.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(170, 89, 19));
        jLNombre.setText("nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(42, 42, 42)
                                .addComponent(jButton3))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLNombre))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActPassword;
    private javax.swing.ButtonGroup btnGroupNivel;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnValidarPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField txtApe;
    private javax.swing.JPasswordField txtContraNue1;
    private javax.swing.JPasswordField txtContraNue2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtpassAct;
    // End of variables declaration//GEN-END:variables
}
