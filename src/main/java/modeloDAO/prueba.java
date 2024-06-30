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
         MedidaDAO medidaDAO = new MedidaDAO(); // Crear una instancia de MedidaDAO

    // Llamar al método listarMedidaxIngred y obtener la lista de medidas para un ingrediente
    String nombreIngrediente = "Frutas y Verduras"; 
    ArrayList<MedidaDTO> medidas = medidaDAO.listarMedidaxTipo(nombreIngrediente);

    // Imprimir las medidas obtenidas
    for (MedidaDTO medida : medidas) {
        System.out.println("Nombre de la medida: " + medida.getNombre());
    }
    }
    
}
