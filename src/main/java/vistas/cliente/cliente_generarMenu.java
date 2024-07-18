package vistas.cliente;

import config.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.DespensaDTO;
import modelo.HistorialDTO;
import modelo.IngredienteDTO;
import modelo.MenuDetalleDTO;
import static modelo.MenuRecomendador.crearMenu;
import modelo.RecetaDTO;
import modelo.Usuario;
import modeloDAO.DespensaDAO;
import modeloDAO.MenuService;
import modeloDAO.UsurarioDAO;
import modeloDAO.historialDAO;
import modeloDAO.menuDetalleDAO;
import modeloDAO.recetaDAO;


public class cliente_generarMenu extends javax.swing.JPanel {
    
    MenuDetalleDTO mdt;
    menuDetalleDAO mdtdao;
    //String codMenu;
    String dni;
    UsurarioDAO usDao= new UsurarioDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    
    DespensaDAO despensaDAO;
     List<DespensaDTO> despensa;
     recetaDAO recetaDAO;
     List<RecetaDTO> recetas;

     Usuario us;
     int tipo;
     
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
        btnReRoll.setVisible(false);
        
    }
    
        
   
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetasImagenes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecetasNombres = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnGenerarmenu = new javax.swing.JButton();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        rbtnOptimi = new javax.swing.JRadioButton();
        rbtnPrefe = new javax.swing.JRadioButton();
        btnReRoll = new javax.swing.JButton();
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

        btnGenerarmenu.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnGenerarmenu.setText("Generar menú");
        btnGenerarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarmenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        fechaInicio.setForeground(new java.awt.Color(153, 153, 153));
        fechaInicio.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        jPanel2.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Hasta");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 50, -1));

        fechaFin.setForeground(new java.awt.Color(153, 153, 153));
        fechaFin.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        jPanel2.add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 140, 30));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Según");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 50, -1));

        buttonGroup1.add(rbtnOptimi);
        rbtnOptimi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnOptimi.setText("Optimización de despensa");
        jPanel2.add(rbtnOptimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        buttonGroup1.add(rbtnPrefe);
        rbtnPrefe.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbtnPrefe.setText("Preferencias");
        jPanel2.add(rbtnPrefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 910, 100));

        btnReRoll.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnReRoll.setText("Re-roll :p");
        jPanel1.add(btnReRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 150, -1));

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

    private void btnGenerarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarmenuActionPerformed
     if(rbtnOptimi.isSelected()){
         generarMenuPorOptimizacion();
         tipo = 1;
     }else{
         generarMenuPorPreferencias();
         tipo = 2;
     }
    }//GEN-LAST:event_btnGenerarmenuActionPerformed

    public void prueba(){
        System.out.println(dni);
        us= usDao.obtenerUsuarioPorDNI(dni);
        System.out.println(us.getNombre()+" cli_menu");  
    }
    
    public void generarMenuPorOptimizacion(){
        recetaDAO = new recetaDAO();
        recetas = recetaDAO.obtenerRecetasConIngredientes();

        despensaDAO = new DespensaDAO();
        despensa = despensaDAO.obtenerIngredientesPorUsuario(dni);

        // Encontrar las coincidencias entre los ingredientes de la despensa y las recetas
        MenuService menuService = new MenuService();
        Map<String, Integer> coincidenciasPorReceta = menuService.encontrarCoincidencias(recetas, despensa);

        // Ordenar las recetas según la cantidad de coincidencias
        List<RecetaDTO> recetasOrdenadas = menuService.ordenarRecetasPorCoincidencias(recetas, coincidenciasPorReceta); 

        // Ahora creamos el menú con las recetas ordenadas
        String fechaInicio = obtenerFechaInicio(); // Fecha de inicio del menú
        String fechaFin =  obtenerFechaFin();    // Fecha de fin del menú

        menuService.crearMenu(recetasOrdenadas, fechaInicio, fechaFin, dni);

        mostrarMenuSemanal();
        mostrarNombresRecetas();
    }
    
     public void generarMenuPorPreferencias(){
        // Paso 1: Obtener las recetas ordenadas por calorías descendentes
        List<RecetaDTO> recetas = obtenerRecetasOrdenadasPorCalorias();
        
        // Paso 2: Ordenar las recetas en grupos de 7 dentro del rango de calorías
        ordenarRecetasPorRangoCalorias(recetas);

        // Paso 3: Imprimir el resultado por consola sin modificar las calorías originales
        for (RecetaDTO receta : recetas) {
            System.out.println("Nombre: " + receta.getNombre() + ", Calorías: " + receta.getCalorias());
        }
        
        String fechaInicio = obtenerFechaInicio(); // Fecha de inicio del menú
        String fechaFin =  obtenerFechaFin();    // Fecha de fin del menú
        crearMenu(recetas, fechaInicio, fechaFin , dni);
     }
     
     // Método para obtener las recetas ordenadas por calorías descendentes
        private static List<RecetaDTO> obtenerRecetasOrdenadasPorCalorias() {
            recetaDAO dao = new recetaDAO();
            return dao.listarPorCaloriasDesc();
        }
        
        // Método para ordenar las recetas en grupos de 7 dentro del rango de calorías
    public void ordenarRecetasPorRangoCalorias(List<RecetaDTO> recetas) {
        // Definir el rango de calorías
        
        double rangoMinimo = us.getCalmin(); // Ejemplo de rango mínimo
        double rangoMaximo = us.getCalmax(); // Ejemplo de rango máximo
        
        System.out.println(rangoMaximo);
        System.out.println(rangoMinimo);

        // Ordenar todas las recetas por calorías descendentes (ya deberían estar ordenadas)
        Collections.sort(recetas, Comparator.comparingDouble(RecetaDTO::getCalorias).reversed());

        // Iterar y agrupar las recetas en grupos de 7 dentro del rango de calorías
        for (int i = 0; i < recetas.size(); i += 7) {
            // Obtener el subconjunto de recetas para este grupo de 7
            List<RecetaDTO> grupo = recetas.subList(i, Math.min(i + 7, recetas.size()));

            // Calcular la suma total de calorías del grupo
            double sumaCalorias = grupo.stream().mapToDouble(RecetaDTO::getCalorias).sum();

            // Verificar y ajustar las recetas dentro del rango de calorías
            if (sumaCalorias < rangoMinimo || sumaCalorias > rangoMaximo) {
                // Calcular el factor de ajuste proporcional
                double factorAjuste = 1.0;
                if (sumaCalorias < rangoMinimo) {
                    factorAjuste = rangoMinimo / sumaCalorias;
                } else if (sumaCalorias > rangoMaximo) {
                    factorAjuste = rangoMaximo / sumaCalorias;
                }

                // Aplicar el ajuste proporcional a las calorías temporales del grupo y redondear
                for (RecetaDTO receta : grupo) {
                    double nuevasCalorias = receta.getCalorias() * factorAjuste;
                    receta.setCalorias(Math.round(nuevasCalorias)); // Redondear las calorías ajustadas
                }
            }
        }
    }

    public void crearMenu(List<RecetaDTO> recetasOrdenadas, String fechaInicio, String fechaFin, String dniUsuario) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = Conexion.getConexion();
            //Generar nuevo ID de menu
            String generarIdMenuQuery = "SELECT COALESCE(MAX(idMenu), 0) + 1 AS newId FROM menu";
            ps = conn.prepareStatement(generarIdMenuQuery);
            rs = ps.executeQuery();
            int idMenu = 1; // Inicialización por defecto
            if (rs.next()) {
                idMenu = rs.getInt("newId");
            }

            //insertar en la tabla menu
            String insertarMenuQuery = "INSERT INTO menu (idMenu, FechaInicio, FechaFin, Usuario_DNI) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(insertarMenuQuery);
            ps.setInt(1, idMenu);
            ps.setString(2, fechaInicio);
            ps.setString(3, fechaFin);
            ps.setString(4, dniUsuario);
            ps.executeUpdate();

            // Insertar en la tabla Menu_Detalle
            String insertarMenuDetalleQuery = "INSERT INTO menu_detalle2 (Menu_idMenu, Receta_idReceta, orden) VALUES (?, ?, ?)";

            ps = conn.prepareStatement(insertarMenuDetalleQuery);
            int orden = 1;
            for (RecetaDTO receta : recetasOrdenadas) {
                ps.setInt(1, idMenu);
                ps.setString(2, receta.getId());
                ps.setInt(3, orden);
                ps.executeUpdate();
                orden++;
            }
            System.out.println("Menú creado exitosamente.");
        } catch (SQLException ex) {
            System.err.println("Error al crear el menú: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

    
    public String obtenerFechaInicio() {
        Date date = fechaInicio.getDate();
        if (date == null) {
            return null; // o puedes retornar una cadena vacía o un mensaje de error
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
    public String obtenerFechaFin() {
        Date date = fechaFin.getDate();
        if (date == null) {
            return null; // o puedes retornar una cadena vacía o un mensaje de error
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
    
    public void mostrarNombresRecetas() {
        modelo2.setRowCount(0); 

        mdtdao = new menuDetalleDAO();
        
        ArrayList<MenuDetalleDTO> lista;
        if(tipo == 1){
             lista = mdtdao.listarRecetasPorOptimizacion();
        }else {
            lista = mdtdao.listarRecetasPorPreferencias();
        }
       

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
        
        for (MenuDetalleDTO dt : lista) {
            // Obtener la fecha para este historial
            String fecha = dt.getReceta().getNombre(); 
            String id = dt.getReceta().getId();
            int orden = dt.getOrden();
            
            // Agregar la fecha a la fila correspondiente al día de la semana actual
            rowData1[indexDia] = fecha;
            rowData2[indexDia] = id;
            rowData3[indexDia] = orden;

            // Pasar al siguiente día de la semana (circular)
            indexDia = (indexDia + 1) % 7; // Esto hace que indexDia vuelva a 0 después de Domingo
        }

        // Agregar la fila completa de nombre de las recetas la tabla
        modelo2.addRow(rowData1);
        modelo2.addRow(rowData2);
        modelo2.addRow(rowData3);
    }

public void mostrarMenuSemanal() {
    modelo.setRowCount(0); 


    mdtdao = new menuDetalleDAO();
    
    ArrayList<MenuDetalleDTO> lista;
        if(tipo == 1){
             lista = mdtdao.listarRecetasPorOptimizacion();
        }else {
            lista = mdtdao.listarRecetasPorPreferencias();
        }
    
    

    // Crear arreglos para almacenar nombres de recetas e imágenes por día de la semana
    Object[] rowDataImagenes = new Object[7]; // Imágenes de recetas

    // Inicializar filas con valores vacíos
    for (int i = 0; i < 7; i++) {
        rowDataImagenes[i] = null; // Inicializar imágenes como null inicialmente
    }

    // Recorrer el historial y llenar las filas con los nombres de recetas e imágenes
    int indexDia = 0;
    for (MenuDetalleDTO dt : lista) {
        // Obtener el nombre de la receta y el nombre del archivo de imagen para este historial
        String nombreArchivoImagen = dt.getReceta().getImagen(); // Ajusta según tu estructura de datos

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
    private javax.swing.JButton btnGenerarmenu;
    private javax.swing.JButton btnReRoll;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnOptimi;
    private javax.swing.JRadioButton rbtnPrefe;
    private javax.swing.JTable tblRecetasImagenes;
    private javax.swing.JTable tblRecetasNombres;
    // End of variables declaration//GEN-END:variables
}
