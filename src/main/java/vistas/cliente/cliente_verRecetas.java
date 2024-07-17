package vistas.cliente;

import vistas.admin.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modelo.TipoComida;
import modeloDAO.recetaDAO;
import modeloDAO.recetaIngredientesDAO;
import modeloDAO.tipoComidaDAO;
import static vistas.cliente.cliente_sidebar.content;




public class cliente_verRecetas extends javax.swing.JPanel {

    TipoComida tp;
    tipoComidaDAO tpd;
    
    RecetaDTO r;
    recetaDAO rd;
    DefaultTableModel modelo = new DefaultTableModel();
    
    int codTipoComida;
    String codigoR;
    
    
    public cliente_verRecetas(int cod) {
        initComponents();
        establecerColumnas();
        jPanel2.setVisible(false);
        
        codTipoComida = cod;
        
        tpd = new tipoComidaDAO();
        tp = tpd.listarUno(codTipoComida+"");
        lblNombreTipo.setText("Recetas de " + tp.getNombre());
        
        FiltrarRecetas(codTipoComida);

        // Cambiar la fuente del encabezado de la tabla
        JTableHeader header = tblRecetas.getTableHeader();
        header.setFont(new Font("Poppins", Font.BOLD, 14)); // Cambia a la fuente deseada
        
    }
    
    private void establecerColumnas() {
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        tblRecetas.setModel(modelo);
    }
         
    public void FiltrarRecetas(int codTipoComida){
    modelo.setRowCount(0);
    rd =new recetaDAO();
    ArrayList<RecetaDTO> lista = new ArrayList<>();
    lista = rd.listarRecetasPorCat(codTipoComida);
    for(int i=0; i<lista.size(); i++){
        Object[] data = {
            lista.get(i).getId(),
            lista.get(i).getNombre(), 
            
            };
        modelo.addRow(data);
        }
    }
    
     admin_verUnaReceta v1r;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreTipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        cuadrito = new javax.swing.JLabel();
        lblImagenReceta = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTiempo1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPorcion1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCalorías = new javax.swing.JLabel();
        btnDetalleReceta = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreTipo.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        lblNombreTipo.setForeground(new java.awt.Color(170, 89, 19));
        lblNombreTipo.setText("Recetas de tipo");
        jPanel1.add(lblNombreTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        tblRecetas.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblRecetas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRecetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRecetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 370, 370));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        lblNombre.setText("Estofado de pollo");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, -1));

        cuadrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/Rectangle 5.png"))); // NOI18N
        jPanel2.add(cuadrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 460));

        lblImagenReceta.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(lblImagenReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 250, 130));

        lbl2.setBackground(new java.awt.Color(170, 89, 19));
        lbl2.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(170, 89, 19));
        lbl2.setText("Tiempo de preparación");
        jPanel2.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/relojcito.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lblTiempo1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblTiempo1.setText("50 minutos");
        jPanel2.add(lblTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        lbl3.setBackground(new java.awt.Color(170, 89, 19));
        lbl3.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(170, 89, 19));
        lbl3.setText("Porciones");
        jPanel2.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/people.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        lblPorcion1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblPorcion1.setText("4 personas");
        jPanel2.add(lblPorcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        lbl1.setBackground(new java.awt.Color(170, 89, 19));
        lbl1.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(170, 89, 19));
        lbl1.setText("Calorías");
        jPanel2.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/info.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        lblCalorías.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblCalorías.setText("500 kcal/por porción");
        jPanel2.add(lblCalorías, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        btnDetalleReceta.setBackground(new java.awt.Color(241, 208, 75));
        btnDetalleReceta.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnDetalleReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalleReceta.setText("Ver más");
        btnDetalleReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleRecetaActionPerformed(evt);
            }
        });
        jPanel2.add(btnDetalleReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 350, 500));

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

    private void btnDetalleRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleRecetaActionPerformed
        int fila = tblRecetas.getSelectedRow();
          
       if (fila==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una receta de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
             codigoR = tblRecetas.getValueAt(fila, 0).toString();
            // Abrir sección
            v1r = new admin_verUnaReceta( codigoR);
            mostrarPanel(v1r);

       }
    }//GEN-LAST:event_btnDetalleRecetaActionPerformed

    private void tblRecetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecetasMouseClicked
        int fila = tblRecetas.getSelectedRow();
        codigoR = tblRecetas.getValueAt(fila, 0).toString();
        r = rd.listarUno(codigoR);
        
        lblNombre.setText(r.getNombre());
        lblTiempo1.setText(r.getTiempo() + " minutos ");
        lblPorcion1.setText(r.getPorcion() + " personas ");
        lblCalorías.setText(r.getCalorias() + " cal/porción");
        
        try {
        String nomImagen = r.getImagen();
        String imagePath = "recetas/" + nomImagen;
        System.out.println("Intentando cargar imagen desde: " + imagePath);

        ImageIcon imagenRecetaOriginal = new ImageIcon(imagePath);

        // Obtener la imagen original
        Image imagenOriginal = imagenRecetaOriginal.getImage();

        // Redimensionar la imagen 
        int width = 250;
        int height = 130;
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        
        ImageIcon imagenRecetaRedimensionada = new ImageIcon(imagenRedimensionada);

        // Establecer el nuevo ImageIcon en el JLabel
        lblImagenReceta.setIcon(imagenRecetaRedimensionada);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
        
        jPanel2.setVisible(true);
        
    }//GEN-LAST:event_tblRecetasMouseClicked
    
    private void mostrarPanel(JPanel p) {
        p.setSize(1050, 720);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalleReceta;
    private javax.swing.JLabel cuadrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblCalorías;
    private javax.swing.JLabel lblImagenReceta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreTipo;
    private javax.swing.JLabel lblPorcion1;
    private javax.swing.JLabel lblTiempo1;
    private javax.swing.JTable tblRecetas;
    // End of variables declaration//GEN-END:variables
}
