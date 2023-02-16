/**
 * Esta será la parte va a traer a llamar todas las operaciones en la parte de ConversorNumerico
 * Imprimirá el menu
 * Se declaran todos los valores de numeros diferentes para las combinaciones en las operaciones
 * 6 cases para los diferentes eventos posibles
 */
package edu.Jorge.Nicolas.Moctezuma.Arellano.reto3.ui;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto3.Main;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto3.process.ConversorNumerico;

import java.util.Scanner;
public class CLI {

    public static String num;
    public static int numOc;
    public static int numH;
    public static String numB;
    public static String numOaD;
    public static String numHaD;


    public static void menuNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bienvenido al convertor numerico \n ¿Qué conversión desea hacer? \n 1) Convertir de decimal a binario \n 2) Convertir de decimal a octal \n 3) Convertir de decimal a hexadecimal \n 4) Convertir de binario a decimal \n 5) Convertir de octal a decimal \n 6) Convertir de hexadecimal a decimal \n");
        int opcion = 0;
        opcion = scanner.nextInt();

        while (opcion < 1 || opcion > 6) {
            System.out.print("Por favor introduzca una opción valida");
            System.out.print("Bienvenido al convertor numerico \n ¿Qué conversión desea hacer? \n 1) Convertir de decimal a binario \n 2) Convertir de decimal a octal \n 3) Convertir de decimal a hexadecimal \n 4) Convertir de binario a decimal \n 5) Convertir de octal a decimal \n 6) Convertir de hexadecimal a decimal \n");
            opcion = scanner.nextInt();
        }



        switch (opcion) {
            case 1:
                System.out.println("Ingrese el digito(s)");
                num = scanner.next();

                System.out.println("La conversión es " + ConversorNumerico.convertirDecimalaBinario(Long.parseLong(num)));
                break;

            case 2:
                System.out.println("Ingrese el digito(s)");
                numOc = scanner.nextInt();

                System.out.println("La conversión es " + ConversorNumerico.convertirDecimalaOctal(numOc));
                break;

            case 3:
                System.out.println("Ingrese el digito(s)");
                numH = scanner.nextInt();

                System.out.println("La conversión es " + ConversorNumerico.convertirDecimalaHexa(numH));
                break;

            case 4:
                System.out.println("Ingrese el digito(s)");
                numB = scanner.next();

                System.out.println("La conversión es " + ConversorNumerico.convertirBinarioaDecimal(numB));
                break;

            case 5:
                System.out.println("Ingrese el digito(s)");
                numOaD = scanner.next();

                System.out.println("La conversión es " + ConversorNumerico.convertirOctalDecimal(numOaD));
                break;

            case 6:
                System.out.println("Ingrese el digito(s)");
                numHaD = scanner.next();

                System.out.println("La conversión es " + ConversorNumerico.convertirHexaaDecimal(numHaD));
                break;
        }


    }
}
