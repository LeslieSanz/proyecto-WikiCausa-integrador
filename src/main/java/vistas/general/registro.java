package vistas.general;

public class registro extends javax.swing.JFrame {

    public registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logowiki = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtApePa = new javax.swing.JTextField();
        txtApeMa = new javax.swing.JTextField();
        txtRepPssw = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        txtPssw1 = new javax.swing.JTextField();
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaWiki.png"))); // NOI18N
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipsepeque4.png"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipse_peque3.png"))); // NOI18N
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaHor.png"))); // NOI18N
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 10, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, 20));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 118, 118));
        jLabel6.setText("Ingrese su nombre");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, 30));

        logowiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/wikilogo2.png"))); // NOI18N
        background.add(logowiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(118, 118, 118));
        jLabel9.setText("Ingrese apellido paterno");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, 30));

        jLabel10.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(118, 118, 118));
        jLabel10.setText("Email");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 20));

        jLabel13.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(118, 118, 118));
        jLabel13.setText("Contraseña");
        background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, 20));

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(232, 162, 24));
        jLabel15.setText("*Su contraseña debe contener al menos 8 caracteres");
        background.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, 30));

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(118, 118, 118));
        jLabel16.setText("Repetir Contraseña");
        background.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, 30));

        jLabel17.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(118, 118, 118));
        jLabel17.setText("Ingrese apellido materno");
        background.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/lineaIzq.png"))); // NOI18N
        background.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, 20));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/Registrar.png"))); // NOI18N
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/RegistrarBlanco.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/RegistrarBlanco.png"))); // NOI18N
        background.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, 110));

        txtNom.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtNom.setForeground(new java.awt.Color(147, 147, 147));
        txtNom.setToolTipText("");
        txtNom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNom.setName(""); // NOI18N
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        background.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 280, -1));

        txtApePa.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtApePa.setForeground(new java.awt.Color(147, 147, 147));
        txtApePa.setToolTipText("");
        txtApePa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtApePa.setName(""); // NOI18N
        txtApePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePaActionPerformed(evt);
            }
        });
        background.add(txtApePa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 280, -1));

        txtApeMa.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtApeMa.setForeground(new java.awt.Color(147, 147, 147));
        txtApeMa.setToolTipText("");
        txtApeMa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtApeMa.setName(""); // NOI18N
        txtApeMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeMaActionPerformed(evt);
            }
        });
        background.add(txtApeMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 280, -1));

        txtRepPssw.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtRepPssw.setForeground(new java.awt.Color(147, 147, 147));
        txtRepPssw.setToolTipText("");
        txtRepPssw.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtRepPssw.setName(""); // NOI18N
        txtRepPssw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepPsswActionPerformed(evt);
            }
        });
        background.add(txtRepPssw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 280, -1));
        txtRepPssw.getAccessibleContext().setAccessibleDescription("");

        txtEmail1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(147, 147, 147));
        txtEmail1.setToolTipText("");
        txtEmail1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail1.setName(""); // NOI18N
        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });
        background.add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 323, 280, -1));

        txtPssw1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtPssw1.setForeground(new java.awt.Color(147, 147, 147));
        txtPssw1.setToolTipText("");
        txtPssw1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPssw1.setName(""); // NOI18N
        txtPssw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPssw1ActionPerformed(evt);
            }
        });
        background.add(txtPssw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 280, -1));

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

    private void txtRepPsswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepPsswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepPsswActionPerformed

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void txtPssw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPssw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPssw1ActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtApePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePaActionPerformed

    private void txtApeMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeMaActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel contenedor;
    private javax.swing.JLabel esfera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logowiki;
    private javax.swing.JTextField txtApeMa;
    private javax.swing.JTextField txtApePa;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPssw1;
    private javax.swing.JTextField txtRepPssw;
    // End of variables declaration//GEN-END:variables
}
