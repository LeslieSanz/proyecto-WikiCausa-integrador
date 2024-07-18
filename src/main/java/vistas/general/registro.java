package vistas.general;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;

public class registro extends javax.swing.JFrame {

    UsurarioDAO usDao = new UsurarioDAO();

    public registro() {
        initComponents();
        ConNoCoindice.setVisible(false);
        hidePsww.setVisible(false);
        RephidePssw.setVisible(false);
        CorrNoValido.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        lineaWiki = new javax.swing.JLabel();
        lineader1 = new javax.swing.JLabel();
        circuloizq = new javax.swing.JLabel();
        circuloder = new javax.swing.JLabel();
        lineaVert = new javax.swing.JLabel();
        lineader2 = new javax.swing.JLabel();
        IngreseSuNombre = new javax.swing.JLabel();
        logowiki = new javax.swing.JLabel();
        ingreseapellidoapw = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        lineaizq1 = new javax.swing.JLabel();
        lineaizq2 = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        lineaizq3 = new javax.swing.JLabel();
        repetircontrasela = new javax.swing.JLabel();
        ingreseapellido = new javax.swing.JLabel();
        lineader3 = new javax.swing.JLabel();
        RephidePssw = new javax.swing.JLabel();
        repmostrarPssw = new javax.swing.JLabel();
        hidePsww = new javax.swing.JLabel();
        mostrarPsww = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtApeP = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        txtPssw1 = new javax.swing.JPasswordField();
        txtRepPssw = new javax.swing.JPasswordField();
        CorrNoValido = new javax.swing.JLabel();
        ConNoCoindice = new javax.swing.JLabel();
        contenedor = new javax.swing.JLabel();
        esfera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(245, 245, 245));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/regresar.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        background.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, -1, -1));

        lineaWiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaWiki.png"))); // NOI18N
        background.add(lineaWiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 10));

        lineader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(lineader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, 20));

        circuloizq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipsepeque4.png"))); // NOI18N
        background.add(circuloizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, -1, -1));

        circuloder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipse_peque3.png"))); // NOI18N
        background.add(circuloder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lineaVert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaHor.png"))); // NOI18N
        background.add(lineaVert, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 10, -1));

        lineader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(lineader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, 20));

        IngreseSuNombre.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        IngreseSuNombre.setForeground(new java.awt.Color(118, 118, 118));
        IngreseSuNombre.setText("Ingrese su nombre");
        background.add(IngreseSuNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, 30));

        logowiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/wikilogo2.png"))); // NOI18N
        background.add(logowiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        ingreseapellidoapw.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        ingreseapellidoapw.setForeground(new java.awt.Color(118, 118, 118));
        ingreseapellidoapw.setText("Ingrese apellidos");
        background.add(ingreseapellidoapw, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, 30));

        email.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        email.setForeground(new java.awt.Color(118, 118, 118));
        email.setText("Correo");
        background.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, 30));

        lineaizq1.setBackground(new java.awt.Color(255, 255, 255));
        lineaizq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(lineaizq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, 20));

        lineaizq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(lineaizq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 20));

        contrasena.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        contrasena.setForeground(new java.awt.Color(118, 118, 118));
        contrasena.setText("Contraseña");
        background.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, 30));

        lineaizq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(lineaizq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, 20));

        repetircontrasela.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        repetircontrasela.setForeground(new java.awt.Color(118, 118, 118));
        repetircontrasela.setText("Repetir Contraseña");
        background.add(repetircontrasela, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, 30));

        ingreseapellido.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        ingreseapellido.setForeground(new java.awt.Color(118, 118, 118));
        ingreseapellido.setText("Ingrese DNI");
        background.add(ingreseapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, 30));

        lineader3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(lineader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, 20));

        RephidePssw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/showPssw.png"))); // NOI18N
        RephidePssw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RephidePsswMouseClicked(evt);
            }
        });
        background.add(RephidePssw, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 466, -1, 20));

        repmostrarPssw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/hidePssw.png"))); // NOI18N
        repmostrarPssw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repmostrarPsswMouseClicked(evt);
            }
        });
        background.add(repmostrarPssw, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 464, -1, 20));

        hidePsww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/showPssw.png"))); // NOI18N
        hidePsww.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePswwMouseClicked(evt);
            }
        });
        background.add(hidePsww, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 399, -1, -1));

        mostrarPsww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/hidePssw.png"))); // NOI18N
        mostrarPsww.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarPswwMouseClicked(evt);
            }
        });
        background.add(mostrarPsww, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 395, -1, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/Registrar.png"))); // NOI18N
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/RegistrarBlanco.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/RegistrarBlanco.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        background.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, 110));

        txtNom.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtNom.setForeground(new java.awt.Color(147, 147, 147));
        txtNom.setText("Nombre");
        txtNom.setToolTipText("");
        txtNom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNom.setName(""); // NOI18N
        txtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomMousePressed(evt);
            }
        });
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        background.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 280, -1));

        txtApeP.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtApeP.setForeground(new java.awt.Color(147, 147, 147));
        txtApeP.setText("Apellidos");
        txtApeP.setToolTipText("");
        txtApeP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtApeP.setName(""); // NOI18N
        txtApeP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApePMousePressed(evt);
            }
        });
        txtApeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePActionPerformed(evt);
            }
        });
        txtApeP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApePKeyTyped(evt);
            }
        });
        background.add(txtApeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 280, -1));

        txtDNI.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(147, 147, 147));
        txtDNI.setText("DNI");
        txtDNI.setToolTipText("");
        txtDNI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDNI.setName(""); // NOI18N
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        background.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 280, -1));

        txtEmail1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(147, 147, 147));
        txtEmail1.setText("wiki@email.com");
        txtEmail1.setToolTipText("");
        txtEmail1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail1.setName(""); // NOI18N
        txtEmail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmail1MousePressed(evt);
            }
        });
        txtEmail1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmail1KeyTyped(evt);
            }
        });
        background.add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 323, 280, -1));

        txtPssw1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtPssw1.setForeground(new java.awt.Color(147, 147, 147));
        txtPssw1.setText("**********");
        txtPssw1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPssw1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPssw1MousePressed(evt);
            }
        });
        txtPssw1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPssw1KeyTyped(evt);
            }
        });
        background.add(txtPssw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 395, 280, -1));

        txtRepPssw.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtRepPssw.setForeground(new java.awt.Color(147, 147, 147));
        txtRepPssw.setText("**********");
        txtRepPssw.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtRepPssw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRepPsswMousePressed(evt);
            }
        });
        txtRepPssw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepPsswActionPerformed(evt);
            }
        });
        txtRepPssw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepPsswKeyTyped(evt);
            }
        });
        background.add(txtRepPssw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 465, 280, -1));

        CorrNoValido.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        CorrNoValido.setForeground(new java.awt.Color(232, 162, 24));
        CorrNoValido.setText("*Correo no valido");
        background.add(CorrNoValido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 345, -1, 30));

        ConNoCoindice.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        ConNoCoindice.setForeground(new java.awt.Color(232, 162, 24));
        ConNoCoindice.setText("*Su contraseña no coincide");
        background.add(ConNoCoindice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 485, -1, 30));

        contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/form_registro.png"))); // NOI18N
        background.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 730, -1));

        esfera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/RegistroEsf.png"))); // NOI18N
        background.add(esfera, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        bienvenida b = new bienvenida();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        validarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtEmail1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmail1MousePressed
        if (txtEmail1.getText().equals("wiki@email.com")) {
            txtEmail1.setText("");
            txtEmail1.setForeground(Color.black);
        }

        if (txtNom.getText().isEmpty()) {
            txtNom.setText("Nombre");
            txtNom.setForeground(new Color(204, 204, 204));
        }

        if (txtApeP.getText().isEmpty()) {
            txtApeP.setText("Apellidos");
            txtApeP.setForeground(new Color(204, 204, 204));
        }
        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }

        if (txtPssw1.getText().isEmpty()) {
            txtPssw1.setText("**********");
            txtPssw1.setForeground(new Color(204, 204, 204));
        }

        if (txtRepPssw.getText().isEmpty()) {
            txtRepPssw.setText("**********");
            txtRepPssw.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txtEmail1MousePressed

    private void txtApePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePActionPerformed
        if (txtApeP.getText().equals("Apellidos")) {
            txtApeP.setText("");
            txtApeP.setForeground(Color.black);
        }
        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("wiki@email.com");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }

        if (txtPssw1.getText().isEmpty()) {
            txtPssw1.setText("**********");
            txtPssw1.setForeground(new Color(204, 204, 204));
        }

        if (txtRepPssw.getText().isEmpty()) {
            txtRepPssw.setText("**********");
            txtRepPssw.setForeground(new Color(204, 204, 204));
        }

        if (txtNom.getText().isEmpty()) {
            txtNom.setText("Nombre");
            txtNom.setForeground(new Color(204, 204, 204));
        }

        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("Ingrese Ingrese email");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }
        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtApePActionPerformed

    private void txtNomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMousePressed
        if (txtNom.getText().equals("Nombre")) {
            txtNom.setText("");
            txtNom.setForeground(Color.black);
        }
        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("wiki@email.com");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }
        if (txtPssw1.getText().isEmpty()) {
            txtPssw1.setText("**********");
            txtPssw1.setForeground(new Color(204, 204, 204));
        }

        if (txtRepPssw.getText().isEmpty()) {
            txtRepPssw.setText("**********");
            txtRepPssw.setForeground(new Color(204, 204, 204));
        }

        if (txtApeP.getText().isEmpty()) {
            txtApeP.setText("Apellidos");
            txtApeP.setForeground(new Color(204, 204, 204));
        }
        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtNomMousePressed

    private void txtApePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApePMousePressed
        if (txtApeP.getText().equals("Apellidos")) {
            txtApeP.setText("");
            txtApeP.setForeground(Color.black);
        }
        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("wiki@email.com");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }
        if (txtPssw1.getText().isEmpty()) {
            txtPssw1.setText("**********");
            txtPssw1.setForeground(new Color(204, 204, 204));
        }

        if (txtRepPssw.getText().isEmpty()) {
            txtRepPssw.setText("**********");
            txtRepPssw.setForeground(new Color(204, 204, 204));
        }
        if (txtNom.getText().isEmpty()) {
            txtNom.setText("Nombre");
            txtNom.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtApePMousePressed

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed
        if (txtDNI.getText().equals("DNI")) {
            txtDNI.setText("");
            txtDNI.setForeground(Color.black);
        }

        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("wiki@email.com");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }

        if (txtNom.getText().isEmpty()) {
            txtNom.setText("Nombre");
            txtNom.setForeground(new Color(204, 204, 204));
        }

        if (txtApeP.getText().isEmpty()) {
            txtApeP.setText("Apellidos");
            txtApeP.setForeground(new Color(204, 204, 204));
        }

        if (txtPssw1.getText().isEmpty()) {
            txtPssw1.setText("**********");
            txtPssw1.setForeground(new Color(204, 204, 204));
        }

        if (txtRepPssw.getText().isEmpty()) {
            txtRepPssw.setText("**********");
            txtRepPssw.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtDNIMousePressed

    private void txtPssw1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPssw1MousePressed
        if (txtPssw1.getText().equals("**********")) {
            txtPssw1.setText("");
            txtPssw1.setForeground(Color.black);
        }

        if (txtRepPssw.getText().isEmpty()) {
            txtRepPssw.setText("**********");
            txtRepPssw.setForeground(new Color(204, 204, 204));
        }

        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("wiki@email.com");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }

        if (txtNom.getText().isEmpty()) {
            txtNom.setText("Nombre");
            txtNom.setForeground(new Color(204, 204, 204));
        }

        if (txtApeP.getText().isEmpty()) {
            txtApeP.setText("Apellidos");
            txtApeP.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtPssw1MousePressed

    public void validarCampos() {
        boolean emailValido = verificacionEmail();
        boolean contrasenaValida = ConfirmarContra();
        boolean camposLlenos = CamposVacios(); // Asumiendo que CamposVacios() es otro método que verifica que todos los campos estén llenos.

        if (!emailValido) {
            CorrNoValido.setText("*Correo no valido");
        }
        if (!contrasenaValida) {
            ConNoCoindice.setText("*Su contraseña no coincide");
        }
        if (!camposLlenos) {
            JOptionPane.showMessageDialog(rootPane, "Complete los campos");
        }

        // Solo intentar registrar el usuario si todas las validaciones son exitosas
        if (emailValido && contrasenaValida && camposLlenos) {
            if (RegistrarUsu()) {
                JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no agregado");
            }
        }

    }

    public boolean CamposVacios() {
        // Obtener texto actual de cada campo
        String email = txtEmail1.getText();
        String nombre = txtNom.getText();
        String apellidoPaterno = txtApeP.getText();
        String apellidoMaterno = txtDNI.getText();
        String contrasena = txtPssw1.getText();
        String repetirContrasena = txtRepPssw.getText();

        // Verificar si algún campo está vacío o igual al texto de sugerencia
        if (email.isEmpty() || email.equals("wiki@email.com")
                || nombre.isEmpty() || nombre.equals("Nombre")
                || apellidoPaterno.isEmpty() || apellidoPaterno.equals("Apellidos")
                || apellidoMaterno.isEmpty() || apellidoMaterno.equals("DNI")
                || contrasena.isEmpty() || contrasena.equals("**********")
                || repetirContrasena.isEmpty() || repetirContrasena.equals("**********")) {
            return false; // Al menos un campo no está completo
        } else {
            return true; // Todos los campos están completos
        }
    }

    public boolean RegistrarUsu() {
        try {
            Usuario usu = new Usuario();
            usu.setCorreo(txtEmail1.getText());
            usu.setPassword(txtPssw1.getText());
            usu.setNombre(txtNom.getText());
            usu.setApellidos(txtApeP.getText());
            usu.setDni(txtDNI.getText());
            usDao.AgregarUsu(usu);
            iniciar_sesion ini = new iniciar_sesion();
            ini.setVisible(true);
            this.setVisible(false);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean ConfirmarContra() {

        String contra1 = String.valueOf(txtPssw1.getPassword());
        String contra2 = String.valueOf(txtRepPssw.getPassword());

        if (contra1.equals(contra2)) {
            return true;
        } else {
            ConNoCoindice.setVisible(true);
            return false;
        }

    }

    public boolean verificacionEmail() {

        String email = txtEmail1.getText();
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        // Verificar si el correo electrónico contiene exactamente un '@' y termina con '.com'
        if (atIndex > 0 && dotIndex > atIndex && email.substring(dotIndex).equals(".com")) {
            return true;
        } else {
            CorrNoValido.setVisible(true);
            return false;
        }
    }

    private void txtRepPsswMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepPsswMousePressed

        if (txtRepPssw.getText().equals("**********")) {
            txtRepPssw.setText("");
            txtRepPssw.setForeground(Color.black);
        }

        if (txtPssw1.getText().isEmpty()) {
            txtPssw1.setText("**********");
            txtPssw1.setForeground(new Color(204, 204, 204));
        }
        if (txtEmail1.getText().isEmpty()) {
            txtEmail1.setText("wiki@email.com");
            txtEmail1.setForeground(new Color(204, 204, 204));
        }

        if (txtNom.getText().isEmpty()) {
            txtNom.setText("Nombre");
            txtNom.setForeground(new Color(204, 204, 204));
        }

        if (txtApeP.getText().isEmpty()) {
            txtApeP.setText("Apellidos");
            txtApeP.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtRepPsswMousePressed

    private void txtRepPsswKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepPsswKeyTyped
        ConNoCoindice.setVisible(false);
    }//GEN-LAST:event_txtRepPsswKeyTyped

    private void txtPssw1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPssw1KeyTyped
        ConNoCoindice.setVisible(false);
    }//GEN-LAST:event_txtPssw1KeyTyped

    private void hidePswwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePswwMouseClicked
        txtPssw1.setEchoChar('*');
        hidePsww.setVisible(false); // Cambiar visibilidad después de hacer clic
        mostrarPsww.setVisible(true);
    }//GEN-LAST:event_hidePswwMouseClicked

    private void mostrarPswwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarPswwMouseClicked

        txtPssw1.setEchoChar((char) 0);
        mostrarPsww.setVisible(false); // Cambiar visibilidad después de hacer clic
        hidePsww.setVisible(true);

    }//GEN-LAST:event_mostrarPswwMouseClicked

    private void RephidePsswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RephidePsswMouseClicked
        txtRepPssw.setEchoChar('*');
        repmostrarPssw.setVisible(true);
        RephidePssw.setVisible(false);
    }//GEN-LAST:event_RephidePsswMouseClicked

    private void repmostrarPsswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repmostrarPsswMouseClicked
        txtRepPssw.setEchoChar((char) 0);
        RephidePssw.setVisible(true);
        repmostrarPssw.setVisible(false);
    }//GEN-LAST:event_repmostrarPsswMouseClicked

    private void txtEmail1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmail1KeyTyped
        CorrNoValido.setVisible(false);
    }//GEN-LAST:event_txtEmail1KeyTyped

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtApePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApePKeyTyped

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtRepPsswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepPsswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepPsswActionPerformed

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            FlatArcOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConNoCoindice;
    private javax.swing.JLabel CorrNoValido;
    private javax.swing.JLabel IngreseSuNombre;
    private javax.swing.JLabel RephidePssw;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel circuloder;
    private javax.swing.JLabel circuloizq;
    private javax.swing.JLabel contenedor;
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel email;
    private javax.swing.JLabel esfera;
    private javax.swing.JLabel hidePsww;
    private javax.swing.JLabel ingreseapellido;
    private javax.swing.JLabel ingreseapellidoapw;
    private javax.swing.JLabel lineaVert;
    private javax.swing.JLabel lineaWiki;
    private javax.swing.JLabel lineader1;
    private javax.swing.JLabel lineader2;
    private javax.swing.JLabel lineader3;
    private javax.swing.JLabel lineaizq1;
    private javax.swing.JLabel lineaizq2;
    private javax.swing.JLabel lineaizq3;
    private javax.swing.JLabel logowiki;
    private javax.swing.JLabel mostrarPsww;
    private javax.swing.JLabel repetircontrasela;
    private javax.swing.JLabel repmostrarPssw;
    private javax.swing.JTextField txtApeP;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtNom;
    private javax.swing.JPasswordField txtPssw1;
    private javax.swing.JPasswordField txtRepPssw;
    // End of variables declaration//GEN-END:variables
}
