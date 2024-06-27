package vistas.cliente;

import java.awt.Color;

public class cliente_despensa extends javax.swing.JPanel {
    
    public cliente_despensa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        frutasVerduras = new javax.swing.JButton();
        lacteos = new javax.swing.JButton();
        abarrotes = new javax.swing.JButton();
        carnes = new javax.swing.JButton();
        pastas = new javax.swing.JButton();
        congelados = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        QueCocinareHoy = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        unidad = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(1049, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Mi despensa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, -1));

        frutasVerduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/frutasVerduras.png"))); // NOI18N
        jPanel1.add(frutasVerduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lacteos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/lacteos.png"))); // NOI18N
        jPanel1.add(lacteos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        abarrotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/abarrotes.png"))); // NOI18N
        jPanel1.add(abarrotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        carnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/carnes.png"))); // NOI18N
        carnes.setToolTipText("");
        jPanel1.add(carnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        pastas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/pastas.png"))); // NOI18N
        jPanel1.add(pastas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        congelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Despensa/enlatados.png"))); // NOI18N
        jPanel1.add(congelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 150, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(46, 46, 46));
        jLabel10.setText("Unidad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 100, -1));

        QueCocinareHoy.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        QueCocinareHoy.setText("¿Qué tengo para cocinar?");
        jPanel1.add(QueCocinareHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(46, 46, 46));
        jLabel11.setText("¡Selecciona un producto y agrégalo a tu despensa!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(46, 46, 46));
        jLabel12.setText("Alimento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, -1));

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(46, 46, 46));
        jLabel13.setText("Cantidad");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_general/Line 135.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 20, -1));

        jButton4.setBackground(new java.awt.Color(0, 124, 238));
        jButton4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modificar");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, -1, 30));

        jButton5.setBackground(new java.awt.Color(18, 91, 0));
        jButton5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar");
        jButton5.setBorder(null);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 80, 30));

        jButton6.setBackground(new java.awt.Color(210, 76, 0));
        jButton6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Eliminar");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, 30));

        jComboBox1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Alimnento", "Cantidad", "Medida", "Fecha de ingreso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 480, 210));

        jTextField1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 80, 30));

        unidad.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        unidad.setForeground(new java.awt.Color(204, 204, 204));
        unidad.setText("Kilogramo");
        unidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unidadMousePressed(evt);
            }
        });
        jPanel1.add(unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 100, 30));

        txtBuscar.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setText("Buscar");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 315, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
     if (txtBuscar.getText().equals("Buscar")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.black);
        }
     
     
     if (unidad.getText().isEmpty()) {
            unidad.setText("Kilogramo");
            unidad.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txtBuscarMousePressed

    private void unidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unidadMousePressed
      if (unidad.getText().equals("Kilogramo")) {
            unidad.setText("");
            unidad.setForeground(Color.black);
        }
      
      if (txtBuscar.getText().isEmpty()) {
            txtBuscar.setText("Buscar");
            txtBuscar.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_unidadMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QueCocinareHoy;
    private javax.swing.JButton abarrotes;
    private javax.swing.JButton carnes;
    private javax.swing.JButton congelados;
    private javax.swing.JButton frutasVerduras;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lacteos;
    private javax.swing.JButton pastas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField unidad;
    // End of variables declaration//GEN-END:variables
}
