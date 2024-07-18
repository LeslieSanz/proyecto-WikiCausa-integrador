package vistas.cliente;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.DespensaDTO;
import modelo.HistorialDTO;
import modelo.Usuario;
import modeloDAO.DespensaDAO;
import modeloDAO.UsurarioDAO;
import modeloDAO.historialDAO;
import vistas.admin.admin_verUnaReceta;
import static vistas.cliente.cliente_sidebar.content;

public class cliente_inicio extends javax.swing.JPanel {

    String dni;
    UsurarioDAO usDao= new UsurarioDAO();
    DespensaDAO despDao;
    ArrayList<DespensaDTO> listaDetalle = new ArrayList<>();
    int codTipo;
    DefaultTableModel modelo = new DefaultTableModel();
    
    HistorialDTO h;
    historialDAO hd = new historialDAO();
    
    String codReceta;
    
    public cliente_inicio() {
        
    }
    
    public cliente_inicio(String dniob){
        initComponents();
        dni=dniob;
        prueba();
        btnDetalles.setVisible(false);
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
        
        //Para que se muestre el plato de día
         h = hd.listarPlatoDelDia(dni);
         
        if(h==null || h.getReceta()==null){
            System.out.println("Redigiendo a cliente_inicio");
        } else {
         btnDetalles.setVisible(true);
         txtCodReceta.setText(h.getReceta().getId());
         System.out.println(h.getReceta().getId());
        lblNombreReceta.setText(h.getReceta().getNombre());
        lblTiempo.setText(h.getReceta().getTiempo()+ " minutos ");
        lblPorcion.setText(h.getReceta().getPorcion()+ " personas ");
        lblCalorias.setText(h.getReceta().getCalorias()+ " kcal/porción");
       
        
         try {
        String nomImagen = h.getReceta().getImagen();
        String imagePath = "recetas/" + nomImagen;
        System.out.println("Intentando cargar imagen desde: " + imagePath);

        ImageIcon imagenRecetaOriginal = new ImageIcon(imagePath);

        // Obtener la imagen original
        Image imagenOriginal = imagenRecetaOriginal.getImage();

        // Redimensionar la imagen 
        int width = 180;
        int height = 140;
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        
        ImageIcon imagenRecetaRedimensionada = new ImageIcon(imagenRedimensionada);

        // Establecer el nuevo ImageIcon en el JLabel
        lblImagenReceta.setIcon(imagenRecetaRedimensionada);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }}
        
    }

    public void prueba(){
        System.out.println(dni);
        Usuario us= usDao.ObtenerUsuario(dni);
        System.out.println(us.getNombre()+" Cli_inicio");
        jLNombre.setText(us.getNombre());
        jlApellido.setText(us.getApellidos());
        
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
     admin_verUnaReceta v1r;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
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
        lblImagenReceta = new javax.swing.JLabel();
        lblNombreReceta = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPorcion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCalorias = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtCodReceta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1049, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_inicio/iconoperfil.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 2, 18)); // NOI18N
        jLabel5.setText("¡Tu menú semanal está listo! ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 280, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 2, 18)); // NOI18N
        jLabel2.setText("Planea hoy, disfruta mañana. ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 280, -1));

        jlApellido.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jlApellido.setText("Apellido");
        jPanel1.add(jlApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 130, -1));

        jLNombre.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLNombre.setText("Nombre ");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 120, -1));

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

        lblImagenReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Comidas/estofadoDePollo.png"))); // NOI18N
        estofado.add(lblImagenReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 140));

        jPanel1.add(estofado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 160));

        lblNombreReceta.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblNombreReceta.setText("Sin definir, genera tu menú semanal");
        jPanel1.add(lblNombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 340, -1));

        btnDetalles.setBackground(new java.awt.Color(241, 208, 75));
        btnDetalles.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalles.setText("Más detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/relojcito.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblTiempo.setText("----");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/people.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        lblPorcion.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblPorcion.setText("----");
        jPanel1.add(lblPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/info.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        lblCalorias.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblCalorias.setText("----");
        jPanel1.add(lblCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        lbl2.setBackground(new java.awt.Color(170, 89, 19));
        lbl2.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(170, 89, 19));
        lbl2.setText("Dificultad");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, 20));

        lbl3.setBackground(new java.awt.Color(170, 89, 19));
        lbl3.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(170, 89, 19));
        lbl3.setText("Tiempo de preparación");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 20));

        lbl4.setBackground(new java.awt.Color(170, 89, 19));
        lbl4.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl4.setForeground(new java.awt.Color(170, 89, 19));
        lbl4.setText("Porción");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 20));

        lbl5.setBackground(new java.awt.Color(170, 89, 19));
        lbl5.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl5.setForeground(new java.awt.Color(170, 89, 19));
        lbl5.setText("Calorías");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, 20));

        txtCodReceta.setEditable(false);
        txtCodReceta.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtCodReceta.setText("----");
        txtCodReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodRecetaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 2, 18)); // NOI18N
        jLabel4.setText("Planea hoy, disfruta mañana. ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 280, -1));

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

    private void txtCodRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodRecetaActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        codReceta = txtCodReceta.getText();
            // Abrir sección
            v1r = new admin_verUnaReceta(codReceta);
            mostrarPanel(v1r);
    }//GEN-LAST:event_btnDetallesActionPerformed
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
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnPescados;
    private javax.swing.JButton btnPollo;
    private javax.swing.JPanel estofado;
    private javax.swing.JLabel fraseMotivadora;
    private javax.swing.JLabel imagenAmigos;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblCalorias;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblImagenReceta;
    private javax.swing.JLabel lblNombreReceta;
    private javax.swing.JLabel lblPorcion;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel panelAmarillo;
    private javax.swing.JTable tblDespensa;
    private javax.swing.JTextField txtCodReceta;
    // End of variables declaration//GEN-END:variables
}
