package vistas.cliente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.HistorialDTO;
import modelo.Usuario;
import modeloDAO.UsurarioDAO;
import modeloDAO.historialDAO;


public class cliente_generarMenu extends javax.swing.JPanel {
    
    HistorialDTO h;
    historialDAO hd;
    String codMenu;
    String dni;
    UsurarioDAO usDao= new UsurarioDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
   
    
    private void establecerColumnas() {
        modelo.addColumn("Lunes");
        modelo.addColumn("Martes");
        modelo.addColumn("Miércoles");
        modelo.addColumn("Jueves");
        modelo.addColumn("Viernes");
        modelo.addColumn("Sábado");
        modelo.addColumn("Domingo");
        tblRecetasImagenes.setModel(modelo);
    }
    
    private void establecerColumnas2() {
        modelo2.addColumn("Lunes");
        modelo2.addColumn("Martes");
        modelo2.addColumn("Miércoles");
        modelo2.addColumn("Jueves");
        modelo2.addColumn("Viernes");
        modelo2.addColumn("Sábado");
        modelo2.addColumn("Domingo");
        tblRecetasNombres.setModel(modelo2);
    }
    
    public cliente_generarMenu(String dniob){
        initComponents();
        establecerColumnas();
        establecerColumnas2();
        dni=dniob;
        prueba();
        
        // Cambiar la fuente del encabezado de la tabla
        JTableHeader header = tblRecetasImagenes.getTableHeader();
        header.setFont(new Font("Poppins", Font.BOLD, 14));
        
         // Ocultar los encabezados de la tabla
        tblRecetasNombres.getTableHeader().setVisible(false);
        
    }
    


    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetasImagenes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecetasNombres = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jdateInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jdateInicio1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 89, 19));
        jLabel1.setText("Genera tu menú semanal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        tblRecetasImagenes.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tblRecetasImagenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRecetasImagenes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 920, 125));

        tblRecetasNombres.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tblRecetasNombres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblRecetasNombres);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 920, 90));

        jPanel2.setBackground(new java.awt.Color(251, 243, 202));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("Desde");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, -1));

        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setText("Generar menú");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jdateInicio.setForeground(new java.awt.Color(153, 153, 153));
        jdateInicio.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        jPanel2.add(jdateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 112, 30));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Hasta");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 50, -1));

        jdateInicio1.setForeground(new java.awt.Color(153, 153, 153));
        jdateInicio1.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        jPanel2.add(jdateInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 112, 30));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Según");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 50, -1));

        jRadioButton1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton1.setText("Optimización de despensa");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton2.setText("Preferencias");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 910, 100));

        jButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton3.setText("Re-roll :p");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 150, -1));

        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setText("Confirmar");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, 150, -1));

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

    public void prueba(){
        System.out.println(dni);
        Usuario us= usDao.ObtenerUsuario(dni);
        System.out.println(us.getNombre()+" cli_menu");
        
        
    }

    
    public void mostrarNombresRecetas(String codMenu) {
        modelo2.setRowCount(0); 

        hd = new historialDAO();
        ArrayList<HistorialDTO> lista = hd.listarPlatosDeUnMenu(codMenu);

        // Crear una fila para los nombres de la receta
        Object[] rowData1 = new Object[7]; 
        // Crear una fila para los tiempo de la receta
        Object[] rowData2 = new Object[7]; 
        Object[] rowData3 = new Object[7]; 
        
        // Inicializar la fila con valores vacíos
        for (int i = 0; i < 7; i++) {
            rowData1[i] = ""; 
            rowData2[i] = "";
            rowData3[i] = "";
        }

        // Recorrer el historial y llenar las filas
        int indexDia = 0; 
        
        for (HistorialDTO historial : lista) {
            // Obtener la fecha para este historial
            String fecha = historial.getReceta().getNombre(); 
            int tiempo = historial.getReceta().getTiempo();
            double cal = historial.getReceta().getCalorias();
            
            // Agregar la fecha a la fila correspondiente al día de la semana actual
            rowData1[indexDia] = fecha;
            rowData2[indexDia] = tiempo + " min ";
            rowData3[indexDia] = cal + " kcal ";

            // Pasar al siguiente día de la semana (circular)
            indexDia = (indexDia + 1) % 7; // Esto hace que indexDia vuelva a 0 después de Domingo
        }

        // Agregar la fila completa de nombre de las recetas la tabla
        modelo2.addRow(rowData1);
        modelo2.addRow(rowData2);
        modelo2.addRow(rowData3);
    }

public void mostrarMenuSemanal(String codMenu) {
    modelo.setRowCount(0); 


    hd = new historialDAO();
    ArrayList<HistorialDTO> lista = hd.listarPlatosDeUnMenu(codMenu);

    // Crear arreglos para almacenar nombres de recetas e imágenes por día de la semana
    Object[] rowDataImagenes = new Object[7]; // Imágenes de recetas

    // Inicializar filas con valores vacíos
    for (int i = 0; i < 7; i++) {
        rowDataImagenes[i] = null; // Inicializar imágenes como null inicialmente
    }

    // Recorrer el historial y llenar las filas con los nombres de recetas e imágenes
    int indexDia = 0;
    for (HistorialDTO historial : lista) {
        // Obtener el nombre de la receta y el nombre del archivo de imagen para este historial
        String nombreArchivoImagen = historial.getReceta().getImagen(); // Ajusta según tu estructura de datos

        // Cargar la imagen desde la carpeta de recursos del proyecto
        String imagePath = "recetas/" + nombreArchivoImagen;
        ImageIcon icon = new ImageIcon(imagePath);

        // Almacenar la imagen en el rowDataImagenes según el día de la semana
        rowDataImagenes[indexDia] = icon;

        // Pasar al siguiente día de la semana (circular)
        indexDia = (indexDia + 1) % 7; // Esto hace que indexDia vuelva a 0 después de Domingo
    }

    // Agregar las filas al modelo de la tabla
    
    modelo.addRow(rowDataImagenes); // Fila con imágenes de recetas
    

    // Modificar la altura de todas las filas de la tabla 
    int rowHeight = 100; 
    tblRecetasImagenes.setRowHeight(rowHeight);

    // Mostrar las imágenes en la tabla usando un renderizador personalizado para todas las columnas
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
        JLabel label = new JLabel();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                ImageIcon icon = (ImageIcon) value;
                // Obtener el tamaño de la celda
                int width = table.getColumnModel().getColumn(column).getWidth();
                int height = table.getRowHeight(row);

                // Redimensionar la imagen al tamaño de la celda manteniendo la proporción
                Image scaledImage = icon.getImage().getScaledInstance(width - 10, height - 10, Image.SCALE_SMOOTH); // Restar 10 píxeles para márgenes
                ImageIcon scaledIcon = new ImageIcon(scaledImage);

                label.setIcon(scaledIcon);
            } else {
                label.setIcon(null);
            }
            
            // Aplicar sombreado solo a la celda seleccionada
                if (isSelected) {
                    label.setBackground(table.getSelectionBackground());
                    label.setOpaque(true);
                } else {
                    label.setBackground(table.getBackground());
                    label.setOpaque(false);
                }
            
            
            return label;
        }
    };

    // Aplicar el renderizador personalizado a todas las columnas de la tabla
    for (int i = 0; i < tblRecetasImagenes.getColumnCount(); i++) {
        tblRecetasImagenes.getColumnModel().getColumn(i).setCellRenderer(renderer);
         
    // Configurar selección de celda única
    tblRecetasNombres.setCellSelectionEnabled(true);
    tblRecetasNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}








    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdateInicio;
    private com.toedter.calendar.JDateChooser jdateInicio1;
    private javax.swing.JTable tblRecetasImagenes;
    private javax.swing.JTable tblRecetasNombres;
    // End of variables declaration//GEN-END:variables
}
