package vistas.cliente;

import config.Conexion;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.DespensaDTO;
import modelo.MenuDetalleDTO;
import static modelo.MenuRecomendador.crearMenu;
import modelo.RecetaDTO;
import modelo.Usuario;
import modeloDAO.DespensaDAO;
import modeloDAO.MenuService;
import modeloDAO.UsurarioDAO;
import modeloDAO.menuDAO;
import modeloDAO.menuDetalleDAO;
import modeloDAO.recetaDAO;



public class cliente_generarMenu extends javax.swing.JPanel {
    
    MenuDetalleDTO mdt;
    menuDetalleDAO mdtdao;
    menuDAO meDAO = new menuDAO();
    //String codMenu;
    String dni;
    UsurarioDAO usDao= new UsurarioDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    Usuario us;
    Connection conn;
    Conexion con = new Conexion();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    DespensaDAO despensaDAO;
     List<DespensaDTO> despensa;
     recetaDAO recetaDAO;
     List<RecetaDTO> recetas;
     int tipo;
     Usuario usu;

     
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
        BtnYa.setVisible(false);
        BtnNo.setVisible(false);
        
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
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        rbtnOptimi = new javax.swing.JRadioButton();
        rbtnPrefe = new javax.swing.JRadioButton();
        btnMostrar = new javax.swing.JButton();
        btnGenerarmenu = new javax.swing.JButton();
        btnReRoll = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        BtnNo = new javax.swing.JButton();
        BtnYa = new javax.swing.JButton();

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

        btnMostrar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar menu");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 170, -1));

        btnGenerarmenu.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnGenerarmenu.setText("Generar menú");
        btnGenerarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarmenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 170, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 910, 100));

        btnReRoll.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnReRoll.setText("Cambiar receta");
        btnReRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReRollActionPerformed(evt);
            }
        });
        jPanel1.add(btnReRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 150, -1));

        btnConfirmar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, 150, -1));

        BtnNo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        BtnNo.setText("No lo haré");
        BtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 150, -1));

        BtnYa.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        BtnYa.setText("Ya lo hice");
        BtnYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnYaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnYa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 150, -1));

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
                                             
        Date fechaIni = fechaInicio.getDate();
        Date fechaFi = fechaFin.getDate();
        
        
        if (fechas()) {
            
            if (!meDAO.FechasExistentes(fechaIni, fechaFi,dni)) {
                if (rbtnOptimi.isSelected()) {
                generarMenuPorOptimizacion();
                btnReRoll.setVisible(true);
                tipo = 1;
            } else if (rbtnPrefe.isSelected()) {
                generarMenuPorPreferencias(); // Llamar al método para generar menú por preferencias
                btnReRoll.setVisible(false);
                tipo = 2;
            } else {
                System.out.println("Selecciona una opción para generar el menú.");

        }
            }else{
                JOptionPane.showMessageDialog(null, "Fecha YA existente");
            }
            
        }else{
            
        }
        
        

    }//GEN-LAST:event_btnGenerarmenuActionPerformed
        
    private void btnReRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReRollActionPerformed
        // Asegúrate de que hay una celda seleccionada
        int selectedRow = tblRecetasNombres.getSelectedRow();
        int selectedColumn = tblRecetasNombres.getSelectedColumn();

        if (selectedRow != -1 && selectedColumn != -1) {
            // Obtener el valor de la celda seleccionada
            Object ordenObj = tblRecetasNombres.getValueAt(selectedRow, selectedColumn);

            if (ordenObj != null) {
                try {
                    int ordenActual = Integer.parseInt(ordenObj.toString());

                    // ID del menú que quieres modificar (cámbialo según sea necesario)
                    int idMenu = 1;

                    // Inicializar el servicio de menú
                    MenuService menuService = new MenuService();

                    // Cambiar la receta en la posición seleccionada
                    menuService.cambiarReceta(idMenu, ordenActual);

                    // Actualizar la tabla
                    mostrarNombresRecetas();
                    mostrarMenuSemanal();
                } catch (NumberFormatException e) {
                    // Manejo de error si el valor no es un número
                    JOptionPane.showMessageDialog(this, "La celda seleccionada no contiene un número de orden válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Manejo de error si la celda está vacía
                JOptionPane.showMessageDialog(this, "La celda seleccionada está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Manejo de error si no hay una celda seleccionada
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una celda con un número de orden apropiado.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnReRollActionPerformed

    private void BtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNoActionPerformed

    int selectedRow = tblRecetasNombres.getSelectedRow();
    int selectedColumn = tblRecetasNombres.getSelectedColumn();

    if (selectedRow != -1 && selectedColumn != -1) {
        // Obtener el valor del ID de Receta de la celda seleccionada
        Object idRecetaObj = tblRecetasNombres.getValueAt(selectedRow, selectedColumn);

        if (idRecetaObj != null) {
            String idReceta = idRecetaObj.toString(); // Convertir a String si es necesario

            // Actualizar la confirmación de la receta en el historial
            String updateQuery = "UPDATE historial SET Confirmacion = 'N' WHERE Receta_idReceta = ?";
            
            try (Connection conn = con.getConexion(); // Tu método para obtener la conexión
                 PreparedStatement stmt = conn.prepareStatement(updateQuery)) {

                stmt.setString(1, idReceta);
                int rowsUpdated = stmt.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Confirmación de receta actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ninguna receta con el ID especificado.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al actualizar la confirmación de la receta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "La celda seleccionada no contiene un ID de receta válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una celda con el ID de receta a confirmar.", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BtnNoActionPerformed

    private void BtnYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnYaActionPerformed

    int selectedRow = tblRecetasNombres.getSelectedRow();
    int selectedColumn = tblRecetasNombres.getSelectedColumn();

    if (selectedRow != -1 && selectedColumn != -1) {
        // Obtener el valor del ID de Receta de la celda seleccionada
        Object idRecetaObj = tblRecetasNombres.getValueAt(selectedRow, selectedColumn);

        if (idRecetaObj != null) {
            String idReceta = idRecetaObj.toString(); // Convertir a String si es necesario

            // Actualizar la confirmación de la receta en el historial
            String updateQuery = "UPDATE historial SET Confirmacion = 'S' WHERE Receta_idReceta = ?";
            
            try (Connection conn = con.getConexion(); // Tu método para obtener la conexión
                 PreparedStatement stmt = conn.prepareStatement(updateQuery)) {

                stmt.setString(1, idReceta);
                int rowsUpdated = stmt.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Confirmación de receta actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ninguna receta con el ID especificado.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al actualizar la confirmación de la receta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "La celda seleccionada no contiene un ID de receta válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una celda con el ID de receta a confirmar.", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BtnYaActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarMenuSemanal();
        mostrarNombresRecetas();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    
    int menuId = 1; // ID del menú que estás utilizando
        java.sql.Date startDate = java.sql.Date.valueOf(obtenerFechaInicio());
        java.sql.Date endDate = java.sql.Date.valueOf(obtenerFechaFin());

    String procedureCall = "{CALL InsertarHistorialCompleto(?, ?, ?, ?)}";

    try (Connection conn = con.getConexion(); // Tu método para obtener la conexión
         CallableStatement stmt = conn.prepareCall(procedureCall)) {

        stmt.setInt(1, menuId);
        stmt.setDate(2, startDate);
        stmt.setDate(3, endDate);
        stmt.setInt(4, tipo);

        stmt.execute();
        JOptionPane.showMessageDialog(this, "Historial insertado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al insertar el historial: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    btnReRoll.setVisible(false);
                BtnYa.setVisible(true);
                BtnNo.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public void prueba(){
        System.out.println(dni);
        us = usDao.obtenerUsuarioPorDNI(dni);
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
    
    public void generarMenuPorPreferencias() {
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
        mostrarMenuSemanal();
        mostrarNombresRecetas();

     }

     // Método para obtener las recetas ordenadas por calorías descendentes
        private static List<RecetaDTO> obtenerRecetasOrdenadasPorCalorias() {
            recetaDAO dao = new recetaDAO();
            return dao.listarPorCaloriasDesc();
        }

        // Método para ordenar las recetas en grupos de 7 dentro del rango de calorías
    public void ordenarRecetasPorRangoCalorias(List<RecetaDTO> recetas) {
        
        double rangoMinimo = us.getCalmin(); 
        double rangoMaximo = us.getCalmax();

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
              System.out.println("Entrando a menú por optimización");
        }else {
            lista = mdtdao.listarRecetasPorPreferencias();
            System.out.println("Entrando a menú por preferencias");
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
             System.out.println("Entrando a menú por optimización");
        }else  {
            lista = mdtdao.listarRecetasPorPreferencias();
            System.out.println("Entrando a menú por preferencias");
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
    
    public boolean fechas(){
        Date fechaIni = fechaInicio.getDate();
        Date fechaFi = fechaFin.getDate();
        
        if (fechaInicio == null || fechaFin == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione las fechas de inicio y fin.");
            return false;
        }
        
        Calendar calInicio = Calendar.getInstance();
        calInicio.setTime(fechaIni);
        Calendar calFin = Calendar.getInstance();
        calFin.setTime(fechaFi);
        
        if (calInicio.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY || calFin.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un Lunes como fecha de inicio y un Domingo como fecha de fin para generar horarios.");
            return false;
        }
        
        // Verificar si hay exactamente 7 días de diferencia
        long diff = calFin.getTimeInMillis() - calInicio.getTimeInMillis();
        long daysDiff = diff / (24 * 60 * 60 * 1000);
        if (daysDiff != 6) { // Deben ser exactamente 7 días de diferencia entre lunes y domingo (6 días en total)
            JOptionPane.showMessageDialog(null, "El rango de fechas debe cubrir exactamente 7 días (de lunes a domingo de la misma semana).");
            return false;
        }
        
        SimpleDateFormat formatoFec = new SimpleDateFormat("yyyy-MM-dd");
        String fechaini = formatoFec.format(fechaIni);
        System.out.println(fechaini);
        String fechafin = formatoFec.format(fechaFi);
        System.out.println(fechafin);
        return true;
        
    }
    
    
    public boolean checkFechas(String dateStr1, String dateStr2, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        try {
            LocalDate date1 = LocalDate.parse(dateStr1, formatter);
            LocalDate date2 = LocalDate.parse(dateStr2, formatter);
            return !date1.equals(date2);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing dates: " + e.getMessage());
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNo;
    private javax.swing.JButton BtnYa;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGenerarmenu;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReRoll;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
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
