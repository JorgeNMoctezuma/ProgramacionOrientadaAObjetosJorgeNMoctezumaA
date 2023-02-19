/**
 * Aquí daremos creación a los Strings de sabor y trimeste para luego imprimirlos
 * será tambien aquí donde tengamos nuestra tabla con los valores de ganancia anuales
 *
 */

package edu.Jorge.Nicolas.Moctezuma.Arellano.reto4.ui;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto4.process.ReportedeGanancias;

import java.util.ArrayList;

public class CLI {

    static String [] sabor = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
    static String [] trimestre = {"Enero-Marzo", "Abril-Junio", "Julio-Septiembre", "Octubre-Diciembre"};

    static int [][] tabla = {
        {111, 483, 471, 427},
        {192, 500, 355, 158},
        {289, 470, 474, 160},
        {415, 114, 161, 308}
    };

    public static void resultados(){

        System.out.println("Bienvenido al resumen de ventas \n");

        for (int i = 0; i <sabor.length; i++) {

            ArrayList<Integer> max = ReportedeGanancias.calcularTrimestreSabor(tabla);
            System.out.println("El mejor trimestre para " + sabor[i] + " fue: " + trimestre[max.get(i)]);

        }

        System.out.println("\nEl trimeste con mejores ventas fue: " + trimestre[ReportedeGanancias.calcularTrimesteVentas(tabla)]);
    }

}
