/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.cliente;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;

public class cliente_configuracion extends javax.swing.JFrame {

    Usuario u;
    UsurarioDAO ud = new UsurarioDAO();
    String dni;

    public cliente_configuracion() {

    }

    public cliente_configuracion(String dniOb) {
        initComponents();
        setLocationRelativeTo(null); // Centrar en la pantalla
        dni = dniOb;
        pnlResultados.setVisible(false);
        txtDni.setText("DNI:" + dni);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbtnAvanza = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxFrec = new javax.swing.JComboBox<>();
        rbtnInter = new javax.swing.JRadioButton();
        rbtnPrin = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        rbtnM = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSilueta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        pnlResultados = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtCalMax = new javax.swing.JTextField();
        txtCalMin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 89, 19));
        jLabel2.setText("¿Cuál es tu nivel ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(170, 89, 19));
        jLabel7.setText("de cocina?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_preferencias/chef.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 60));

        buttonGroup1.add(rbtnAvanza);
        rbtnAvanza.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnAvanza.setText("Avanzado");
        jPanel2.add(rbtnAvanza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_preferencias/calendar.png"))); // NOI18N
        jLabel9.setText(" ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(170, 89, 19));
        jLabel3.setText("¿Con qué frecuencia ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(170, 89, 19));
        jLabel4.setText("repites una comida?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        cbxFrec.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cbxFrec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cada 7 días", "Cada 14 días", "Cada 21 días", " " }));
        jPanel2.add(cbxFrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, -1));

        buttonGroup1.add(rbtnInter);
        rbtnInter.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnInter.setText("Intermedio");
        jPanel2.add(rbtnInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        buttonGroup1.add(rbtnPrin);
        rbtnPrin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnPrin.setText("Principiante");
        jPanel2.add(rbtnPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 290, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 300, 500));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_preferencias/btnConf1.png"))); // NOI18N
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_preferencias/btnConf2.png"))); // NOI18N
        btnConfirmar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_preferencias/btnConf2.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 190, -1));

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel11.setText("!Queremos conocerte!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 570, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("En esta sección, puedes personalizar tu experiencia seleccionando tus preferencias en tres áreas clave. ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("la tasa metabólica basal (TMB) en adultos, teniendo en cuenta:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 11, 370));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_preferencias/dish.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setText("  Peso (kg)");

        txtPeso.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPeso)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 110, 80));

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setText(" Sexo");

        buttonGroup2.add(rbtnM);
        rbtnM.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnM.setText("M");
        rbtnM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbtnMMousePressed(evt);
            }
        });
        rbtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbtnF);
        rbtnF.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnF.setText("F");
        rbtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFActionPerformed(evt);
            }
        });
        rbtnF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtnM)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnF))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel17)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnF)
                    .addComponent(rbtnM))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, 80));

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setText(" Edad");

        txtEdad.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 110, 80));

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setText("Altura (cm)");

        txtAltura.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 110, 80));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Esto nos ayudará a crear un menú semanal adaptado a tus gustos y necesidades.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("La fórmula de Mifflin St-Jeor es una ecuación utilizada para estimar ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        lblSilueta.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblSilueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 60, 200));

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(170, 89, 19));
        jLabel15.setText("¿Cuántas calorías debes consumir?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        btnCalcular.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular resultados");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel20.setText("Calorías por semana:");

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 51, 0));
        jLabel22.setText("Máximo:");

        txtCalMax.setEditable(false);
        txtCalMax.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtCalMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalMaxActionPerformed(evt);
            }
        });

        txtCalMin.setEditable(false);
        txtCalMin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 51, 0));
        jLabel21.setText("Mínimo:");

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadosLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCalMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCalMax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtCalMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(pnlResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 380, 110));

        txtDni.setEditable(false);
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMActionPerformed

        String imagePath = "/img/img_preferencias/hombre.png";
        //System.out.println("Intentando cargar imagen desde: " + imagePath);

        ImageIcon iconoHombre = new ImageIcon(getClass().getResource(imagePath));
        lblSilueta.setIcon(iconoHombre);
    }//GEN-LAST:event_rbtnMActionPerformed

    private void rbtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFActionPerformed
        String imagePath = "/img/img_preferencias/mujer.png";
        //System.out.println("Intentando cargar imagen desde: " + imagePath);

        ImageIcon iconoMujer = new ImageIcon(getClass().getResource(imagePath));
        lblSilueta.setIcon(iconoMujer);
    }//GEN-LAST:event_rbtnFActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        u = ud.ObtenerUsuario(dni);
        String sexo;
        if (rbtnM.isSelected()) {
            sexo = "M";
        } else {
            sexo = "F";
        }

        System.out.println("Sexo seleccionado: " + sexo);

        try {
            u.setEdad(Integer.parseInt(txtEdad.getText()));
            u.setPeso(Double.parseDouble(txtPeso.getText()));
            u.setAltura(Double.parseDouble(txtAltura.getText()));

            System.out.println("Edad: " + u.getEdad());
            System.out.println("Peso: " + u.getPeso());
            System.out.println("Altura: " + u.getAltura());

            double calxdia = u.calculaCaloriasPorDia(sexo);
            System.out.println("Calorías por día calculadas: " + calxdia);

            u.calcularCaloriasPorSemana(calxdia);

            System.out.println("Calorías mínimas por semana: " + u.getCalmin());
            System.out.println("Calorías máximas por semana: " + u.getCalmax());

            DecimalFormat df = new DecimalFormat("#.00");

            txtCalMin.setText(df.format(u.getCalmin()));
            txtCalMax.setText(df.format(u.getCalmax()));
            pnlResultados.setVisible(true);

        } catch (NumberFormatException e) {
            System.err.println("Error en la conversión de los valores: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Por favor, introduce valores numéricos válidos.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtCalMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalMaxActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        String sex = null;
        if (rbtnM.isSelected()) {
            sex = "M";
        }
        if (rbtnF.isSelected()) {
            sex = "F";
        }

        String nivel = null;
        if (rbtnPrin.isSelected()) {
            nivel = "P";
        }
        if (rbtnInter.isSelected()) {
            nivel = "I";
        }
        if (rbtnAvanza.isSelected()) {
            nivel = "A";
        }

        int frec = 0;
        switch (cbxFrec.getSelectedIndex()) {
            case 1:
                frec = 7;
                break;
            case 2:
                frec = 14;
                break;
            case 3:
                frec = 21;
                break;
        }
        
        int edad = Integer.parseInt(txtEdad.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        
        
        u.setSexo(sex);
        u.setFrecuencia(frec);
        u.setNivel(nivel);
        u.setEdad(edad);
        u.setAltura(altura);
        u.setPeso(peso);

        ud.agregarPreferencias(u);

        cliente_sidebar cliSi = new cliente_sidebar(dni);
        cliSi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void rbtnMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMMousePressed

    }//GEN-LAST:event_rbtnMMousePressed

    private void rbtnFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnFKeyPressed
        //lblSilueta.setIcon(iconoMujer);
    }//GEN-LAST:event_rbtnFKeyPressed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }        // TODO add your handling code here:     
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtAltura.getText().length() >= 3) {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaKeyTyped

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtPeso.getText().length() >= 3) {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(cliente_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxFrec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblSilueta;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JRadioButton rbtnAvanza;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnInter;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.JRadioButton rbtnPrin;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCalMax;
    private javax.swing.JTextField txtCalMin;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
