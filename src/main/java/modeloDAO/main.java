/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import modelo.DespensaDTO;
import modelo.IngredienteDTO;
import modelo.MenuDetalleDTO;
import modelo.RecetaDTO;
import modelo.RecetaIngredientesDTO;
import modelo.Usuario;

/**
 *
 * @author luism
 */
public class main {

    public static void main(String[] args) {
    recetaDAO recetaDAO = new recetaDAO();
    List<RecetaDTO> recetas = recetaDAO.obtenerRecetasConIngredientes();

     //Obtener la despensa del usuario (simulado para este ejemplo)
    DespensaDAO despensaDAO = new DespensaDAO();
    String dniUsuario = "99999999";  // DNI del usuario
    List<DespensaDTO> despensa = despensaDAO.obtenerIngredientesPorUsuario(dniUsuario);

     //Encontrar las coincidencias entre los ingredientes de la despensa y las recetas
    MenuService menuService = new MenuService();
    Map<String, Integer> coincidenciasPorReceta = menuService.encontrarCoincidencias(recetas, despensa);

     //Ordenar las recetas según la cantidad de coincidencias
    List<RecetaDTO> recetasOrdenadas = menuService.ordenarRecetasPorCoincidencias(recetas, coincidenciasPorReceta);

     //Crear el menú
    String fechaInicio = "2024-07-20"; // Fecha de inicio del menú
    String fechaFin = "2024-07-25";    // Fecha de fin del menú
    menuService.crearMenu(recetasOrdenadas, fechaInicio, fechaFin, dniUsuario);

     //Probar cambiar receta con frecuencia
    int idMenu = 1;  // Supongamos que el ID del menú creado es 1
    int ordenActual = 1;  // Orden actual de la receta que queremos cambiar
    UsurarioDAO usuarioDAO = new UsurarioDAO();
    Usuario usuario = usuarioDAO.obtenerUsuarioPorDNI(dniUsuario);
    int frecuencia = usuario.getFrecuencia();  // Obtener la frecuencia del usuario

     //Cambiar la receta según la frecuencia o sin frecuencia
    boolean aplicarFrecuencia = true;  // Cambiar a 'false' si no se quiere aplicar la frecuencia

     //Cambiar la receta
    menuService.cambiarRecetaConFrecuencia(idMenu, ordenActual, frecuencia, aplicarFrecuencia);

    System.out.println("Receta cambiada según la opción seleccionada.");
}

//    
//         
//    recetaDAO recetaDAO = new recetaDAO();
//    List<RecetaDTO> recetas = recetaDAO.obtenerRecetasConIngredientes();
//
//     //Obtener la despensa del usuario (simulado para este ejemplo)
//    DespensaDAO despensaDAO = new DespensaDAO();
//    String dniUsuario = "8888888";  // DNI del usuario
//    List<DespensaDTO> despensa = despensaDAO.obtenerIngredientesPorUsuario(dniUsuario);
//
//     //Encontrar las coincidencias entre los ingredientes de la despensa y las recetas
//    MenuService menuService = new MenuService();
//    Map<String, Integer> coincidenciasPorReceta = menuService.encontrarCoincidencias(recetas, despensa);
//
//     //Ordenar las recetas según la cantidad de coincidencias
//    List<RecetaDTO> recetasOrdenadas = menuService.ordenarRecetasPorCoincidencias(recetas, coincidenciasPorReceta);
//
//     mprimir las recetas ordenadas y los ingredientes coincidentes y faltantes (como en tu ejemplo)
//    System.out.println("Recetas ordenadas por coincidencias:");
//    for (RecetaDTO receta : recetasOrdenadas) {
//        System.out.println("Receta: " + receta.getNombre() + " - Coincidencias: " + coincidenciasPorReceta.getOrDefault(receta.getId(), 0));
//
//         //Obtener todos los ingredientes de la receta
//        List<IngredienteDTO> ingredientesReceta = receta.getIngredientes();
//
//         //Obtener los ingredientes coincidentes y faltantes (como en tu ejemplo)
//        List<IngredienteDTO> ingredientesCoincidentes = new ArrayList<>();
//        List<IngredienteDTO> ingredientesFaltantes = new ArrayList<>();
//
//        boolean encontrado;
//        for (IngredienteDTO ingredienteReceta : ingredientesReceta) {
//            encontrado = false;
//            for (DespensaDTO despensaDTO : despensa) {
//                for (IngredienteDTO ingredienteDespensa : despensaDTO.getIngredientes()) {
//                    if (ingredienteReceta.getId() == ingredienteDespensa.getId()) {
//                        ingredientesCoincidentes.add(ingredienteReceta);
//                        encontrado = true;
//                        break;
//                    }
//                }
//                if (encontrado) break;
//            }
//            if (!encontrado) {
//                ingredientesFaltantes.add(ingredienteReceta);
//            }
//        }
//
//        System.out.println("Ingredientes coincidentes:");
//        for (IngredienteDTO ingrediente : ingredientesCoincidentes) {
//            System.out.println("- " + ingrediente.getNombre());
//        }
//
//        System.out.println("Ingredientes faltantes:");
//        for (IngredienteDTO ingrediente : ingredientesFaltantes) {
//            System.out.println("- " + ingrediente.getNombre());
//        }
//
//        System.out.println();
//    }
//
//     //Ahora creamos el menú con las recetas ordenadas
//    String fechaInicio = "2024-07-20"; // Fecha de inicio del menú
//    String fechaFin = "2024-07-25";    // Fecha de fin del menú
//
//    menuService.crearMenu(recetasOrdenadas, fechaInicio, fechaFin, dniUsuario);
//
//     //ID del menú que vamos a modificar
//    int idMenu = 1;  // Cambia esto según el menú que quieras modificar
//
//     //Inicializamos el servicio de menú
//    MenuService menuService = new MenuService();
//
//     //Traer todos los registros de la tabla menu_detalle
//    List<MenuDetalleDTO> detallesMenu = menuService.obtenerDetallesMenu(idMenu);
//    System.out.println("Detalles del menú antes del cambio:");
//    for (MenuDetalleDTO detalle : detallesMenu) {
//        System.out.println("Receta ID: " + detalle.getRecetaIdReceta() + " - Orden: " + detalle.getOrden());
//    }
//
//     //Cambiar la receta en la tercera posición
//    int ordenActual = 3;
//    System.out.println("\nCambiando receta en la posición 3...");
//    menuService.cambiarReceta(idMenu, ordenActual);
//
//    // Traer los registros actualizados de la tabla menu_detalle
//    detallesMenu = menuService.obtenerDetallesMenu(idMenu);
//    System.out.println("\nDetalles del menú después del cambio:");
//    for (MenuDetalleDTO detalle : detallesMenu) {
//        System.out.println("Receta ID: " + detalle.getRecetaIdReceta() + " - Orden: " + detalle.getOrden());
//    }
//}

}
