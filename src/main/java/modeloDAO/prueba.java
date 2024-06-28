/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloDAO;

import java.util.ArrayList;
import modelo.IngredienteDTO;

/**
 *
 * @author yosse
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear una instancia de tu clase DAO
        ingredienteDAO ingredienteDAO = new ingredienteDAO();
        
        // Llamar al método con un ID de tipo de ingrediente, por ejemplo, 1 para 'Frutas y Verduras'
        ArrayList<IngredienteDTO> ingredientes = ingredienteDAO.listaIngrexTipo(2);

        // Iterar sobre la lista de ingredientes y mostrar los nombres
        for (IngredienteDTO ingrediente : ingredientes) {
            System.out.println(ingrediente.getNombre());
        }
    }
    
}
