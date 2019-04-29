/**
 * Ordenamiento2.java.
 * Licencia GNU.
 */
package ordenamiento2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Programa para ordenar una lista empleando la función sort.
 * @author Ingeniero Ricardo Presilla ricardopresilla@gmail.com.
 * @version 1.0.
 */
public class Ordenamiento2 {
    private static final String palos[] =
    { "Corazones", "Diamantes", "Bastos", "Espadas" };
    // imprime los elementos del objeto List
    public void imprimirElementos()
    {
        List< String > lista = Arrays.asList( palos ); // crea objeto List
        // imprime los elementos del objeto List
        System.out.printf( "Elementos del arreglo desordenados:\n%s\n", lista );
        // ordena en forma descendente, utilizando un comparador
        Collections.sort( lista, Collections.reverseOrder() );
        // imprime los elementos del objeto List
        System.out.printf( "Elementos de lista ordenados:\n%s\n", lista );
    } // fin del método imprimirElementos
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenamiento2 orden1 = new Ordenamiento2();
        orden1.imprimirElementos();
    }
    
}
