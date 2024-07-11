package vistas.admin;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modeloDAO.recetaDAO;
import modeloDAO.recetaIngredientesDAO;



public class admin_verUnaReceta extends javax.swing.JPanel {

    RecetaDTO r;
    recetaDAO rd;
    DefaultTableModel modelo = new DefaultTableModel();
    String cod;
    
    recetaIngredientesDAO id;
    
    public admin_verUnaReceta(String codReceta) {
        initComponents();
        cod = codReceta;
        txtIdReceta.setText(cod);
        establecerColumnas();
        mostrarDatosReceta();
        mostrarIngredientes(codReceta);
    }
    
    private void establecerColumnas() {
        modelo.addColumn("Ingrediente");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Medida");
        tblIngredientes.setModel(modelo);
    }


    public void mostrarDatosReceta(){
        
        rd = new recetaDAO();
        r = rd.listarUno(cod);
        
        
        lblNombreReceta.setText(r.getNombre());
        lblMin.setText(r.getTiempo()+" minutos ");
        lblPorcion.setText(r.getPorcion()+" personas ");
        lblCalorias.setText(r.getCalorias()+" kcal/porción ");
        
        String Prep = r.getPreparacion();
        //System.out.println(Prep);
        txtAreaPrep.setText(Prep);

        try {
        String nomImagen = r.getImagen();
        String imagePath = "recetas/" + nomImagen;
        System.out.println("Intentando cargar imagen desde: " + imagePath);

        ImageIcon imagenRecetaOriginal = new ImageIcon(imagePath);

        // Obtener la imagen original
        Image imagenOriginal = imagenRecetaOriginal.getImage();

        // Redimensionar la imagen 
        int width = 312;
        int height = 235;
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        
        ImageIcon imagenRecetaRedimensionada = new ImageIcon(imagenRedimensionada);

        // Establecer el nuevo ImageIcon en el JLabel
        lblFotoReceta.setIcon(imagenRecetaRedimensionada);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }

    }
    
    public void mostrarIngredientes(String codReceta){
        modelo.setRowCount(0);
        id =new recetaIngredientesDAO();
        ArrayList<RecetaIngredientesDTO> lista = new ArrayList<>();
        lista = id.listarIngredientesPorReceta(codReceta);
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getIngrediente().getNombre(),
                lista.get(i).getCantidad(), 
                lista.get(i).getMedida(),
                };
            modelo.addRow(data);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreReceta = new javax.swing.JLabel();
        txtIdReceta = new javax.swing.JTextField();
        lblFotoReceta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPrep = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPorcion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCalorias = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreReceta.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        lblNombreReceta.setForeground(new java.awt.Color(170, 89, 19));
        lblNombreReceta.setText("Nombre de la receta");
        jPanel1.add(lblNombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtIdReceta.setEditable(false);
        txtIdReceta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(txtIdReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 120, -1));

        lblFotoReceta.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblFotoReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 320, 240));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 20, 270));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 1, 20)); // NOI18N
        jLabel2.setText("Preparación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 20)); // NOI18N
        jLabel3.setText("Información");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 1, 20)); // NOI18N
        jLabel4.setText("Ingredientes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        tblIngredientes.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblIngredientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 320, 230));

        txtAreaPrep.setEditable(false);
        txtAreaPrep.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaPrep.setColumns(20);
        txtAreaPrep.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAreaPrep.setRows(5);
        txtAreaPrep.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(txtAreaPrep);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 830, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/prepa.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/relojcito.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        lblMin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblMin.setText("60 minutos");
        jPanel1.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/ingre.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/preparacion.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/people.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        lblPorcion.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblPorcion.setText("4 personas");
        jPanel1.add(lblPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/relojcito.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        lblCalorias.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblCalorias.setText("500 kcal/porción");
        jPanel1.add(lblCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_iconos_recetas/pin-angle.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

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
    
 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCalorias;
    private javax.swing.JLabel lblFotoReceta;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNombreReceta;
    private javax.swing.JLabel lblPorcion;
    private javax.swing.JTable tblIngredientes;
    private javax.swing.JTextArea txtAreaPrep;
    private javax.swing.JTextField txtIdReceta;
    // End of variables declaration//GEN-END:variables
}
