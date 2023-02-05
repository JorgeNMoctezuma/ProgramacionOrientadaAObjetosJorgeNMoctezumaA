/**
 * @param piso almacena el valor de los niveles de la piramide
 *             Cli pregunta los pisos de la poramide y evita que tenga menos de 3 pisos
 */
package edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.piramide.ui;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.piramide.process.Piramide;

import java.util.Scanner;

public class CLI {

    public static void imprimirPiramide(){
        Scanner scanner = new Scanner(System.in);


        int pisos = 0 ;

        System.out.println("Cuántos pisos tendrá la piramide? ");
        pisos = scanner.nextInt();

        while (pisos < 3) {

            System.out.printf("El valor minimo es 3, por favor, ingrese otro numero\n");
            System.out.println("Cuántos pisos tendrá la piramide? ");
            pisos = scanner.nextInt();
        }

        Piramide.hacepiramide(pisos);

    }

}
