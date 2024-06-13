package vistas.cliente;

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1049, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Mi despensa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

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
        jLabel10.setText("Cantidad");
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
        jButton4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modificar");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, 40));

        jButton5.setBackground(new java.awt.Color(18, 91, 0));
        jButton5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 473, -1, 40));

        jButton6.setBackground(new java.awt.Color(210, 76, 0));
        jButton6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Eliminar");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QueCocinareHoy;
    private javax.swing.JButton abarrotes;
    private javax.swing.JButton carnes;
    private javax.swing.JButton congelados;
    private javax.swing.JButton frutasVerduras;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lacteos;
    private javax.swing.JButton pastas;
    // End of variables declaration//GEN-END:variables
}
