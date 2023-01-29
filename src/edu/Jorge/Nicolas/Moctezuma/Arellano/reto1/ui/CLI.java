package edu.Jorge.Nicolas.Moctezuma.Arellano.reto1.ui;

import edu.Jorge.Nicolas.Moctezuma.Arellano.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {

    public static  void mostrarMenu(){
        System.out.println("Elige una opción: \n1.- Sumar \n2.- Restar \n3.- Multiplicar \n4.- Dividir");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();scanner.nextLine();

        while (option> 4 || option < 1) {
            System.out.println("Por favor ingresa una opción válida");
            System.out.println("\n1.- Sumar \n2.- Restar \n3.- Multiplicar \n4.- Dividir");
            option = scanner.nextInt();
        }

        int resultado = -1;
        String operacion ="";

        System.out.println("Inroduce el primer valor");
        int num1 = scanner.nextInt();scanner.nextLine();
        System.out.println("Inroduce el segundo valor");
        int num2 = scanner.nextInt();




        switch (option) {
            case 1:
                resultado = Calculadora.sumarNum(num1, num2);
                operacion = "+";
                break;

            case 2:
                resultado = Calculadora.restarNum(num1, num2);
                operacion = "-";
                break;

            case 3:
                resultado = Calculadora.multNum(num1, num2);
                operacion = "*";
                break;

            case 4:
                resultado = Calculadora.diviciónNum(num1, num2);
                operacion = "/";
                break;



        }

        System.out.printf("El resultado de la opereación es %d %s %d = %d", num1, operacion, num2, resultado);

    }


}