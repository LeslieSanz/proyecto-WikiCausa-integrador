package vistas.cliente;

import java.awt.BorderLayout;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.DespensaDTO;
import modelo.Usuario;
import modeloDAO.DespensaDAO;
import modeloDAO.UsurarioDAO;
import static vistas.cliente.cliente_sidebar.content;

public class cliente_inicio extends javax.swing.JPanel {

    String dni;
    UsurarioDAO usDao= new UsurarioDAO();
    DespensaDAO despDao;
    ArrayList<DespensaDTO> listaDetalle = new ArrayList<>();
    int codTipo;
    DefaultTableModel modelo = new DefaultTableModel();
    
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
        
        establecerColumnas();
        mostrarTabla();
        
        // Cambiar la fuente del encabezado de la tabla
        JTableHeader header = tblDespensa.getTableHeader();
        header.setFont(new Font("Poppins", Font.ROMAN_BASELINE, 14));
    }

    public void prueba(){
        System.out.println(dni);
        Usuario us= usDao.ObtenerUsuario(dni);
        System.out.println(us.getNombre()+" Cli_inicio");
        jLNombre.setText(us.getNombre() +" " + us.getApellidos());
        
    }
    
    private void establecerColumnas() {
        modelo.addColumn("Mi despensa");
        tblDespensa.setModel(modelo);
    }

    private void mostrarTabla() {
        modelo.setRowCount(0);
        despDao = new DespensaDAO();
        ArrayList<DespensaDTO> lista = new ArrayList<>();
        lista = despDao.listarTodos(dni);
        for (int i = 0; i < lista.size(); i++) {
            Object[] data = {
                lista.get(i).getNombre(),};
            modelo.addRow(data);
        }

    }
    
    cliente_verRecetas cvr;
    
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
        btnPescados = new javax.swing.JButton();
        btnCarnes = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        btnPollo = new javax.swing.JButton();
        Categorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDespensa = new javax.swing.JTable();
        bannerBlancoDerecha = new javax.swing.JLabel();
        estofado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnVerTodas1 = new javax.swing.JToggleButton();
        btnVerTodas2 = new javax.swing.JToggleButton();
        lblNombre = new javax.swing.JLabel();

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

        btnPescados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/pescades.png"))); // NOI18N
        btnPescados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPescadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPescados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        btnCarnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/carnes.png"))); // NOI18N
        btnCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        btnOtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/otros.png"))); // NOI18N
        btnOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        btnPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias/pollo.png"))); // NOI18N
        btnPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolloActionPerformed(evt);
            }
        });
        jPanel1.add(btnPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        Categorias.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Categorias.setText("Categorías");
        jPanel1.add(Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        tblDespensa.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tblDespensa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDespensa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 180, 350));

        bannerBlancoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_inicio/background_lateral.png"))); // NOI18N
        jPanel1.add(bannerBlancoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        estofado.setBackground(new java.awt.Color(245, 245, 245));
        estofado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Comidas/estofadoDePollo.png"))); // NOI18N
        estofado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        jPanel1.add(estofado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 160));

        btnVerTodas1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnVerTodas1.setForeground(new java.awt.Color(248, 182, 2));
        btnVerTodas1.setText("Ver Todas    >");
        btnVerTodas1.setBorder(null);
        btnVerTodas1.setContentAreaFilled(false);
        jPanel1.add(btnVerTodas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

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
        jPanel1.add(btnVerTodas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));

        lblNombre.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblNombre.setText("Estofado de pollo");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 170, -1));

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

    private void btnPescadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPescadosActionPerformed
        // Abrir sección
        cvr = new cliente_verRecetas(3);
        mostrarPanel(cvr);
    }//GEN-LAST:event_btnPescadosActionPerformed

    private void btnVerTodas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerTodas2ActionPerformed

    private void btnPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolloActionPerformed
        // Abrir sección
        cvr = new cliente_verRecetas(1);
        mostrarPanel(cvr);
    }//GEN-LAST:event_btnPolloActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
        // Abrir sección
        cvr = new cliente_verRecetas(2);
        mostrarPanel(cvr);
    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtrosActionPerformed
        // Abrir sección
        cvr = new cliente_verRecetas(4);
        mostrarPanel(cvr);
    }//GEN-LAST:event_btnOtrosActionPerformed
   private void mostrarPanel(JPanel p) {
        p.setSize(1050, 720);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categorias;
    private javax.swing.JLabel QueCocinareHoy;
    private javax.swing.JLabel bannerBlancoDerecha;
    private javax.swing.JLabel bannerPequeñoAmarillo;
    private javax.swing.JButton btnCarnes;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnPescados;
    private javax.swing.JButton btnPollo;
    private javax.swing.JToggleButton btnVerTodas1;
    private javax.swing.JToggleButton btnVerTodas2;
    private javax.swing.JPanel estofado;
    private javax.swing.JLabel fraseMotivadora;
    private javax.swing.JLabel imagenAmigos;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel panelAmarillo;
    private javax.swing.JTable tblDespensa;
    // End of variables declaration//GEN-END:variables
}
