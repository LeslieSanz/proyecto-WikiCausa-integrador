/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.admin;


import com.formdev.flatlaf.FlatLightLaf;
import vistas.cliente.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import vistas.general.bienvenida;

public class admin_sidebar extends javax.swing.JFrame {

    public admin_sidebar() {
        initComponents();
    }



    admin_recetas r;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        casita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRecetas = new javax.swing.JPanel();
        casita2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIngredientes = new javax.swing.JPanel();
        casita1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        logowiki = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        btnRecetas.setBackground(new java.awt.Color(241, 208, 75));
        btnRecetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRecetasMousePressed(evt);
            }
        });
        btnRecetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/mimenu_logo.png"))); // NOI18N
        btnRecetas.add(casita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 29, 7));
        jLabel3.setText("Añadir Recetas");
        btnRecetas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        sidebar.add(btnRecetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 60));

        btnIngredientes.setBackground(new java.awt.Color(241, 208, 75));
        btnIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngredientesMousePressed(evt);
            }
        });
        btnIngredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/midespensa_logo.png"))); // NOI18N
        btnIngredientes.add(casita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 29, 7));
        jLabel2.setText("Ver recetas");
        btnIngredientes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        sidebar.add(btnIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 230, 60));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText(":P");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("SIDEBAR_ADMIN");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel5))
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1050, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        setColor(btnInicio);
        resetColor(btnIngredientes);
        resetColor(btnRecetas);
        
        
        
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnIngredientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngredientesMousePressed
        setColor(btnIngredientes);
        resetColor(btnInicio);
        resetColor(btnRecetas);
        
        
        
    }//GEN-LAST:event_btnIngredientesMousePressed

    private void btnRecetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecetasMousePressed
        setColor(btnRecetas);
        resetColor(btnInicio);
        resetColor(btnIngredientes);
        
        
        // Abrir sección
        r = new admin_recetas();
        mostrarPanel(r);
    }//GEN-LAST:event_btnRecetasMousePressed

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
            java.util.logging.Logger.getLogger(admin_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_sidebar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
                new admin_sidebar().setVisible(true);
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
    private javax.swing.JPanel btnIngredientes;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnRecetas;
    private javax.swing.JLabel casita;
    private javax.swing.JLabel casita1;
    private javax.swing.JLabel casita2;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logowiki;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
