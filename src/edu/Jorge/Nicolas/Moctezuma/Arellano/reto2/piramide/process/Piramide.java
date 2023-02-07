/**
 * aquí otro uso de pisos :)
 * aquí se imprimen los "*" y " "
 *
 */
package edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.piramide.process;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.piramide.ui.CLI;
public class Piramide {

    public static void hacepiramide(int pisos){

        for (int i = 0; i < pisos; i++) {

            for (int j = 0; j < pisos - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++ ){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
