/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.admin;

import java.time.LocalDate;
import modeloDAO.UsurarioDAO;
import modeloDAO.recetaDAO;

/**
 *
 * @author lesly
 */
public class admin_dash extends javax.swing.JPanel {
    recetaDAO rDAO = new recetaDAO();
    UsurarioDAO rUsu = new UsurarioDAO();
    /**
     * Creates new form admin_dash
     */
    public admin_dash() {
        initComponents();
        //Para mostrar la fecha actual
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", " ;septiembre",
             "octubre", "noviembre", "diciembre"};
        lblFecha.setText("Hoy es " + dia + " de " + meses[month - 1]+ " de " + year);
        
//        actualizarRec();
//        actualizarNumUsuReg();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        numUsu = new javax.swing.JLabel();
        numUsuReg = new javax.swing.JLabel();
        UsuariosRegistrados = new javax.swing.JLabel();
        TotalRecetas = new javax.swing.JLabel();
        cantPollo = new javax.swing.JLabel();
        cantCarne = new javax.swing.JLabel();
        cantPescado = new javax.swing.JLabel();
        otros = new javax.swing.JLabel();
        equipodesarrolladores = new javax.swing.JLabel();
        SoporteTecnico = new javax.swing.JLabel();
        yoss = new javax.swing.JLabel();
        les = new javax.swing.JLabel();
        luiami = new javax.swing.JLabel();
        omar = new javax.swing.JLabel();
        OmarT = new javax.swing.JLabel();
        AndreA = new javax.swing.JLabel();
        lessS = new javax.swing.JLabel();
        LuisP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(170, 89, 19));
        lblFecha.setText("Fecha de hoy");
        lblFecha.setBorder(new javax.swing.border.MatteBorder(null));
        add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        numUsu.setFont(new java.awt.Font("Poppins", 1, 64)); // NOI18N
        numUsu.setText("0");
        add(numUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, 110));

        numUsuReg.setFont(new java.awt.Font("Poppins", 1, 64)); // NOI18N
        numUsuReg.setForeground(new java.awt.Color(255, 255, 255));
        numUsuReg.setText("0");
        add(numUsuReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 100, 110));

        UsuariosRegistrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/panUsuReg.png"))); // NOI18N
        add(UsuariosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        TotalRecetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/panTotRec.png"))); // NOI18N
        add(TotalRecetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        cantPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/panDePollo.png"))); // NOI18N
        add(cantPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 280, 190));

        cantCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/panDeCarne.png"))); // NOI18N
        add(cantCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 280, 190));

        cantPescado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/panPescado.png"))); // NOI18N
        add(cantPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 280, 190));

        otros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/panOtroa.png"))); // NOI18N
        add(otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 280, 190));

        equipodesarrolladores.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        equipodesarrolladores.setForeground(new java.awt.Color(232, 162, 24));
        equipodesarrolladores.setText("Equipo de desarrolladores");
        add(equipodesarrolladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        SoporteTecnico.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        SoporteTecnico.setForeground(new java.awt.Color(232, 162, 24));
        SoporteTecnico.setText("Soporte técnico");
        add(SoporteTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        yoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/Yoss.png"))); // NOI18N
        add(yoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        les.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMIN/Leslie.png"))); // NOI18N
        add(les, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));

        luiami.setText("LUISMI");
        add(luiami, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, -1));

        omar.setText("OMAR");
        add(omar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, -1, -1));

        OmarT.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        OmarT.setForeground(new java.awt.Color(67, 77, 86));
        OmarT.setText("Omar Trejo");
        add(OmarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, -1, -1));

        AndreA.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        AndreA.setForeground(new java.awt.Color(67, 77, 86));
        AndreA.setText("Andrea Altamirano");
        add(AndreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        lessS.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lessS.setForeground(new java.awt.Color(67, 77, 86));
        lessS.setText("Leslie Sánchez");
        add(lessS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        LuisP.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        LuisP.setForeground(new java.awt.Color(67, 77, 86));
        LuisP.setText("Luis Paz");
        add(LuisP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel1.setText("Horario de atención:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel2.setText("Lunes a Viernes, 9:00 AM - 6:00 PM (CET)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel3.setText("Teléfono:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel4.setText("Correo electrónico:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel5.setText("support@wikicausa.com");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel6.setText("+34 123 456 789");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


//    private void actualizarRec() {
//        int count = rDAO.contarFilas();
//        // Actualiza el JTextField con el número de filas
//        numUsuReg.setText(String.valueOf(count));
//    }
//    
//    private void actualizarNumUsuReg() {
//        int count = rUsu.contarRecetasPorRolC();
//        // Actualiza el JTextField con el número de filas
//        numUsu.setText(String.valueOf(count));
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AndreA;
    private javax.swing.JLabel LuisP;
    private javax.swing.JLabel OmarT;
    private javax.swing.JLabel SoporteTecnico;
    private javax.swing.JLabel TotalRecetas;
    private javax.swing.JLabel UsuariosRegistrados;
    private javax.swing.JLabel cantCarne;
    private javax.swing.JLabel cantPescado;
    private javax.swing.JLabel cantPollo;
    private javax.swing.JLabel equipodesarrolladores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel les;
    private javax.swing.JLabel lessS;
    private javax.swing.JLabel luiami;
    private javax.swing.JLabel numUsu;
    private javax.swing.JLabel numUsuReg;
    private javax.swing.JLabel omar;
    private javax.swing.JLabel otros;
    private javax.swing.JLabel yoss;
    // End of variables declaration//GEN-END:variables
}
