/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.general;

/**
 *
 * @author lesly
 */
public class iniciar_sesion extends javax.swing.JFrame {

    public iniciar_sesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        logowiki = new javax.swing.JLabel();
        frmLogin = new javax.swing.JLabel();
        elipse1 = new javax.swing.JLabel();
        elipse2 = new javax.swing.JLabel();
        personas = new javax.swing.JLabel();
        elipse_izquierda = new javax.swing.JLabel();
        elipse3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(245, 245, 245));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(170, 89, 19));
        titulo.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(170, 89, 19));
        titulo.setText("!Bienvenido de vuelta!");
        background.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Ingrese su contraseña");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingrese su correo");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/regresar.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        background.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 140, -1, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/btnIngresar1.png"))); // NOI18N
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/btnIngresar2.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/btnIngresar2.png"))); // NOI18N
        background.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, 60));
        background.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 310, 30));

        contrasena.setText("jPasswordField1");
        background.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 310, 30));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 410, 20));

        logowiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/wikilogo2.png"))); // NOI18N
        background.add(logowiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, -1, -1));

        frmLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/form_login.png"))); // NOI18N
        background.add(frmLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        elipse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipse_peque2.png"))); // NOI18N
        background.add(elipse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        elipse2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipse_peque3.png"))); // NOI18N
        background.add(elipse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        personas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/parejita.png"))); // NOI18N
        background.add(personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        elipse_izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipse_grande_izq.png"))); // NOI18N
        background.add(elipse_izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        elipse3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/elipsepeque4.png"))); // NOI18N
        background.add(elipse3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        bienvenida b = new bienvenida();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciar_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel elipse1;
    private javax.swing.JLabel elipse2;
    private javax.swing.JLabel elipse3;
    private javax.swing.JLabel elipse_izquierda;
    private javax.swing.JLabel frmLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logowiki;
    private javax.swing.JLabel personas;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
