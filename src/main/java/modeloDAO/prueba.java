/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloDAO;

import java.util.ArrayList;
import modelo.IngredienteDTO;
import modelo.MedidaDTO;

/**
 *
 * @author yosse
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         ingredienteDAO dao = new ingredienteDAO();

    // Llamar al método para obtener el ID del ingrediente
    String nombreIngrediente = "Papa"; // Nombre del ingrediente que quieres buscar
    IngredienteDTO ingredienteDTO = dao.obtenerIdIngrediente(nombreIngrediente);

    // Imprimir el resultado (solo como ejemplo, puedes hacer lo que necesites con el DTO)
    System.out.println("ID del ingrediente " + nombreIngrediente + ": " + ingredienteDTO.getId());
          // Ejemplos de uso del método obtenerMedidaDesdeCadena
//        String medida1 = medidaDAO.obtenerMedidaDesdeCadena("Papa-Unidad");
//        String medida2 = medidaDAO.obtenerMedidaDesdeCadena("Papa-Kilo");
//
//        System.out.println("Medida obtenida 1: " + medida1); // Debería imprimir "Unidad"
//        System.out.println("Medida obtenida 2: " + medida2);
    }
    
}
