/**
 * Aquí arrancamos con los calculos necesarios para que el programa pueda leer la tabla y
 *      acomodar/leer sus valores en filas y columnas para poder imprimir correctamente lo solicitado
 * Separaremos los objetivos principales en calcular el sabor (por filas) y las ventas (por columnas)
 *      utilizando lo que vimos en clase con [i][j]
 */
package edu.Jorge.Nicolas.Moctezuma.Arellano.reto4.process;

import java.util.ArrayList;

public class ReportedeGanancias {

    public static ArrayList<Integer> calcularTrimestreSabor(int [][] tabla){

        ArrayList<Integer> max = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < tabla.length; i++){

            int maximo = 0;

            for (int j = 0; j < tabla.length; j++){

                if (tabla[i][j] > maximo) {
                    index = j;
                    maximo = tabla[i][j];
                }
            }
            max.add(index);
        }
        return max;
    }

    public static int calcularTrimesteVentas(int[][] tabla){

        int index = 0;
        int maximo = 0;

        for (int i = 0; i < tabla.length; i++){
            int suma = 0;

            for (int j = 0; j < tabla.length; j++){
                suma += tabla[j][i];
            }

            if (suma > maximo){
                maximo = suma;
                index = 1;
            }
        }
        return index;
    }
}
