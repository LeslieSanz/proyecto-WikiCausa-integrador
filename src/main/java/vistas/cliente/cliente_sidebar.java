/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.cliente;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import vistas.general.bienvenida;

/**
 *
 * @author lesly
 */
public class cliente_sidebar extends javax.swing.JFrame {

    public cliente_sidebar() {
        initComponents();
//        Para mostrar por defecto el panel del dashboard
        i = new cliente_inicio();
        i.setSize(1040, 620);
        i.setLocation(0, 0);

        content.removeAll();
        content.add(i, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    cliente_inicio i;
    cliente_despensa d;
    cliente_menu m;
    cliente_perfil p;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        casita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMiMenu = new javax.swing.JPanel();
        casita2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMiDespensa = new javax.swing.JPanel();
        casita1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMiPerfil = new javax.swing.JPanel();
        casita3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        logowiki = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setPreferredSize(new java.awt.Dimension(230, 720));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(251, 243, 202));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });
        btnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/inicio_logo.png"))); // NOI18N
        btnInicio.add(casita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 29, 7));
        jLabel1.setText("Inicio");
        btnInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        sidebar.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 60));

        btnMiMenu.setBackground(new java.awt.Color(241, 208, 75));
        btnMiMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMiMenuMousePressed(evt);
            }
        });
        btnMiMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/mimenu_logo.png"))); // NOI18N
        btnMiMenu.add(casita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 29, 7));
        jLabel3.setText("Mi menú");
        btnMiMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        sidebar.add(btnMiMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 230, 60));

        btnMiDespensa.setBackground(new java.awt.Color(241, 208, 75));
        btnMiDespensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMiDespensaMousePressed(evt);
            }
        });
        btnMiDespensa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/midespensa_logo.png"))); // NOI18N
        btnMiDespensa.add(casita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 29, 7));
        jLabel2.setText("Mi despensa");
        btnMiDespensa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        sidebar.add(btnMiDespensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 60));

        btnMiPerfil.setBackground(new java.awt.Color(241, 208, 75));
        btnMiPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMiPerfilMousePressed(evt);
            }
        });
        btnMiPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casita3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/miperfil_logo.png"))); // NOI18N
        btnMiPerfil.add(casita3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 29, 7));
        jLabel4.setText("Mi perfil");
        btnMiPerfil.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        sidebar.add(btnMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 230, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/salir1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/salir2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/salir2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sidebar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        logowiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/wikilogo_sidebar.png"))); // NOI18N
        sidebar.add(logowiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/sidebar.png"))); // NOI18N
        sidebar.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 720));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1050, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        setColor(btnInicio);
        resetColor(btnMiDespensa);
        resetColor(btnMiMenu);
        resetColor(btnMiPerfil);

        // Abrir sección
        i = new cliente_inicio();
        mostrarPanel(i);
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnMiDespensaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiDespensaMousePressed
        setColor(btnMiDespensa);
        resetColor(btnInicio);
        resetColor(btnMiMenu);
        resetColor(btnMiPerfil);

        // Abrir sección
        d = new cliente_despensa();
        mostrarPanel(d);
    }//GEN-LAST:event_btnMiDespensaMousePressed

    private void btnMiMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiMenuMousePressed
        setColor(btnMiMenu);
        resetColor(btnInicio);
        resetColor(btnMiDespensa);
        resetColor(btnMiPerfil);

        // Abrir sección
        m = new cliente_menu();
        mostrarPanel(m);
    }//GEN-LAST:event_btnMiMenuMousePressed

    private void btnMiPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiPerfilMousePressed
        setColor(btnMiPerfil);
        resetColor(btnInicio);
        resetColor(btnMiDespensa);
        resetColor(btnMiMenu);

        // Abrir sección
        p = new cliente_perfil();
        mostrarPanel(p);
    }//GEN-LAST:event_btnMiPerfilMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bienvenida bi = new bienvenida();
        bi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cliente_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new cliente_sidebar().setVisible(true);
            }
        });
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(251, 235, 202));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(241, 208, 75));
    }

    private void mostrarPanel(JPanel p) {
        p.setSize(1050, 720);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnMiDespensa;
    private javax.swing.JPanel btnMiMenu;
    private javax.swing.JPanel btnMiPerfil;
    private javax.swing.JLabel casita;
    private javax.swing.JLabel casita1;
    private javax.swing.JLabel casita2;
    private javax.swing.JLabel casita3;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logowiki;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
