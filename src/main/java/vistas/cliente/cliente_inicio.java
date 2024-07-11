package vistas.cliente;

import java.time.LocalDate;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;

public class cliente_inicio extends javax.swing.JPanel {

    String dni;
    UsurarioDAO usDao= new UsurarioDAO();
    
    public cliente_inicio() {
        
    }
    
    public cliente_inicio(String dniob){
        initComponents();
        dni=dniob;
        prueba();
        
        //Para mostrar la fecha actual
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", " ;septiembre",
             "octubre", "noviembre", "diciembre"};
        lblFecha.setText("Hoy es " + dia + " de " + meses[month - 1]);
    }

    public void prueba(){
        System.out.println(dni);
        Usuario us= usDao.ObtenerUsuario(dni);
        System.out.println(us.getNombre()+" Cli_inicio");
        jLNombre.setText(us.getNombre() +" " + us.getApellidos());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        fraseMotivadora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        bannerPequeñoAmarillo = new javax.swing.JLabel();
        QueCocinareHoy = new javax.swing.JLabel();
        imagenAmigos = new javax.swing.JLabel();
        panelAmarillo = new javax.swing.JLabel();
        btnBebidas = new javax.swing.JButton();
        btnHamburguesas = new javax.swing.JButton();
        btnPollito = new javax.swing.JButton();
        btnPostrecitos = new javax.swing.JButton();
        panelDerechoTuDespensa = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Categorias = new javax.swing.JLabel();
        bannerBlancoDerecha = new javax.swing.JLabel();
        estofado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnVerTodas2 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        sopa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVerTodas = new javax.swing.JToggleButton();
        btnVerTodas1 = new javax.swing.JToggleButton();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1049, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLNombre.setText("Nombre de usuario");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 180, -1));

        fraseMotivadora.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        fraseMotivadora.setForeground(new java.awt.Color(46, 46, 46));
        jPanel1.add(fraseMotivadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lblFecha.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(170, 89, 19));
        lblFecha.setText("Fecha de hoy");
        lblFecha.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 400, -1));

        bannerPequeñoAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_inicio/bannerDerechaAmarillo.png"))); // NOI18N
        jPanel1.add(bannerPequeñoAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        QueCocinareHoy.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        QueCocinareHoy.setText("¿Qué cocinaré hoy?");
        jPanel1.add(QueCocinareHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        imagenAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_inicio/grupo-amigos-preparando-comida-cocina 1.png"))); // NOI18N
        jPanel1.add(imagenAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 310, -1));

        panelAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_inicio/panelAmarillo.png"))); // NOI18N
        jPanel1.add(panelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/Bebidas.png"))); // NOI18N
        btnBebidas.setContentAreaFilled(false);
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(btnBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        btnHamburguesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/Hamburguesas.png"))); // NOI18N
        btnHamburguesas.setContentAreaFilled(false);
        jPanel1.add(btnHamburguesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        btnPollito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/Pollito.png"))); // NOI18N
        btnPollito.setContentAreaFilled(false);
        jPanel1.add(btnPollito, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        btnPostrecitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/Postrecitos.png"))); // NOI18N
        btnPostrecitos.setContentAreaFilled(false);
        jPanel1.add(btnPostrecitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        panelDerechoTuDespensa.setBackground(new java.awt.Color(255, 255, 255));
        panelDerechoTuDespensa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel8.setText("¡TU DESPENSA");
        panelDerechoTuDespensa.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel9.setText("ESTÁ VACÍA!");
        panelDerechoTuDespensa.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, -1));

        jPanel1.add(panelDerechoTuDespensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 180, 140));

        Categorias.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Categorias.setText("Categorías");
        jPanel1.add(Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        bannerBlancoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_inicio/background_lateral.png"))); // NOI18N
        jPanel1.add(bannerBlancoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        estofado.setBackground(new java.awt.Color(245, 245, 245));
        estofado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Comidas/estofadoDePollo.png"))); // NOI18N
        estofado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        btnVerTodas2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnVerTodas2.setForeground(new java.awt.Color(248, 182, 2));
        btnVerTodas2.setText("Más detalles");
        btnVerTodas2.setBorder(null);
        btnVerTodas2.setContentAreaFilled(false);
        btnVerTodas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodas2ActionPerformed(evt);
            }
        });
        estofado.add(btnVerTodas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(46, 46, 46));
        jLabel10.setText("Estofado de pollo");
        estofado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel1.add(estofado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, 160));

        sopa.setBackground(new java.awt.Color(245, 245, 245));
        sopa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Comidas/sopaDeFideos.png"))); // NOI18N
        sopa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(46, 46, 46));
        jLabel6.setText("Sopa de fideos");
        sopa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        btnVerTodas.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnVerTodas.setForeground(new java.awt.Color(248, 182, 2));
        btnVerTodas.setText("Más detalles");
        btnVerTodas.setBorder(null);
        btnVerTodas.setContentAreaFilled(false);
        btnVerTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodasActionPerformed(evt);
            }
        });
        sopa.add(btnVerTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jPanel1.add(sopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 330, 160));

        btnVerTodas1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnVerTodas1.setForeground(new java.awt.Color(248, 182, 2));
        btnVerTodas1.setText("Ver Todas    >");
        btnVerTodas1.setBorder(null);
        btnVerTodas1.setContentAreaFilled(false);
        jPanel1.add(btnVerTodas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

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

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnVerTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerTodasActionPerformed

    private void btnVerTodas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerTodas2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categorias;
    private javax.swing.JLabel QueCocinareHoy;
    private javax.swing.JLabel bannerBlancoDerecha;
    private javax.swing.JLabel bannerPequeñoAmarillo;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnHamburguesas;
    private javax.swing.JButton btnPollito;
    private javax.swing.JButton btnPostrecitos;
    private javax.swing.JToggleButton btnVerTodas;
    private javax.swing.JToggleButton btnVerTodas1;
    private javax.swing.JToggleButton btnVerTodas2;
    private javax.swing.JPanel estofado;
    private javax.swing.JLabel fraseMotivadora;
    private javax.swing.JLabel imagenAmigos;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel panelAmarillo;
    private javax.swing.JPanel panelDerechoTuDespensa;
    private javax.swing.JPanel sopa;
    // End of variables declaration//GEN-END:variables
}
