package vistas.general;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;
import vistas.admin.admin_sidebar;
import vistas.cliente.cliente_sidebar;

/**
 *
 * @author lesly
 */
public class iniciar_sesion extends javax.swing.JFrame {

    UsurarioDAO usDao = new UsurarioDAO();
    
    public iniciar_sesion() {
        initComponents();
        hidePsww.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        ingreseContrasena = new javax.swing.JLabel();
        ingreseCorreo = new javax.swing.JLabel();
        hidePsww = new javax.swing.JLabel();
        mostrarPsww = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JPasswordField();
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

        ingreseContrasena.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ingreseContrasena.setForeground(new java.awt.Color(102, 102, 102));
        ingreseContrasena.setText("Ingrese su contraseña");
        background.add(ingreseContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        ingreseCorreo.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ingreseCorreo.setForeground(new java.awt.Color(102, 102, 102));
        ingreseCorreo.setText("Ingrese su correo");
        background.add(ingreseCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        hidePsww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/hidePssw.png"))); // NOI18N
        hidePsww.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePswwMouseClicked(evt);
            }
        });
        background.add(hidePsww, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 455, -1, -1));

        mostrarPsww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/showPssw.png"))); // NOI18N
        mostrarPsww.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarPswwMouseClicked(evt);
            }
        });
        background.add(mostrarPsww, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 458, -1, -1));

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
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        background.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, 60));

        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setToolTipText(" ");
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        background.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 310, 30));

        txtcontrasena.setForeground(new java.awt.Color(204, 204, 204));
        txtcontrasena.setText("**********");
        txtcontrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontrasenaMousePressed(evt);
            }
        });
        background.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 310, 30));
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

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        String correo=txtCorreo.getText();
        String password=txtcontrasena.getText();
        Usuario usu=usDao.validarUsu(correo, password);
        String rol=usu.getRol();
        
        if (usu!=null) {
            if (rol.equalsIgnoreCase("C")) {
                cliente_sidebar cliSi= new cliente_sidebar();
                cliSi.setVisible(true);
                this.dispose();
            }
            if (rol.equalsIgnoreCase("A")) {
                admin_sidebar adSi= new admin_sidebar();
                adSi.setVisible(true);
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Piña Usuario y/o contraseña no encontrado");
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void mostrarPswwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarPswwMouseClicked
        txtcontrasena.setEchoChar((char)0);
        hidePsww.setVisible(true);
        mostrarPsww.setVisible(false);
    }//GEN-LAST:event_mostrarPswwMouseClicked

    private void hidePswwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePswwMouseClicked
        txtcontrasena.setEchoChar('*');
        mostrarPsww.setVisible(true);
        hidePsww.setVisible(false);
    }//GEN-LAST:event_hidePswwMouseClicked

    private void txtcontrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontrasenaMousePressed
        if (String.valueOf(txtcontrasena.getPassword()).equals("**********")) {
            txtcontrasena.setText(null);
            txtcontrasena.setForeground(Color.black);
        }
        
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_txtcontrasenaMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Ingrese su correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        
        if (String.valueOf(txtcontrasena.getPassword()).isEmpty()) {
            txtcontrasena.setText("**********");
            txtcontrasena.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    
    
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
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
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
    private javax.swing.JLabel elipse1;
    private javax.swing.JLabel elipse2;
    private javax.swing.JLabel elipse3;
    private javax.swing.JLabel elipse_izquierda;
    private javax.swing.JLabel frmLogin;
    private javax.swing.JLabel hidePsww;
    private javax.swing.JLabel ingreseContrasena;
    private javax.swing.JLabel ingreseCorreo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logowiki;
    private javax.swing.JLabel mostrarPsww;
    private javax.swing.JLabel personas;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtcontrasena;
    // End of variables declaration//GEN-END:variables
}
