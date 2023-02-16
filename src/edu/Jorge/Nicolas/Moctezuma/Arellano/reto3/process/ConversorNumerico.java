/**
 * Esta clase contiene el metodo para convertir numeros
 *Será enteramente la parte matematica y logica de las converciones
 *
 * Este metodo tiene un string que representa un numero en base decimal
 * y regresa el mismo nimero en su representación de base binario
 *
 * @param numero a convertir en base decimal
 * @return numero en base binaria
 *
 */

package edu.Jorge.Nicolas.Moctezuma.Arellano.reto3.process;

public class ConversorNumerico {


    public static String convertirDecimalaBinario(long num){

        if (num <= 0){
            System.out.print("No se puede dividir el 0");
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (num > 0){
            short residuo = (short) (num % 2);
            num = num / 2;
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }

    public static String convertirDecimalaOctal(long numOc){

        if (numOc <= 0){
            System.out.print("No se puede dividir el 0");
            return "0";
        }
        StringBuilder octal = new StringBuilder();
        while (numOc > 0){
            short residuo = (short) (numOc % 8);
            numOc = numOc / 8;
            octal.insert(0, String.valueOf(residuo));
        }
        return octal.toString();
    }

    public static String convertirDecimalaHexa(long numH){

        if (numH <= 0){
            System.out.print("No se puede dividir el 0");
            return "0";
        }
        StringBuilder hexa = new StringBuilder();
        while (numH > 0){
            short residuo = (short) (numH % 16);
            numH = numH / 16;
            hexa.insert(0, String.valueOf(residuo));
        }
        return hexa.toString();
    }

    public static long convertirBinarioaDecimal(String numB){

        long num2 = 0;
        int posicion = 0;

        for (int i = numB.length() - 1; i >= 0; i--){

            short num = 1;
            if (numB.charAt(i) == '0'){
                num = 0;
            }

            double multiplicador = Math.pow(2, posicion);
            num2 += num * multiplicador;
            posicion++;
        }return num2;
    }

    public static long convertirOctalDecimal(String numOaD){
        long num3 = 0;
        int potencia = 0;

        for (int j = numOaD.length() - 1; j >= 0; j--){
            int valor = Character.getNumericValue((numOaD.charAt(j)));
            long elevado = (long) Math.pow(8, potencia) * valor;
            num3 += elevado;
            potencia++;
        }
        return num3;
    }

    public static long convertirHexaaDecimal(String numHaD){
        switch (numHaD){
            case "A":
                return 10;
            case "B":
                return 11;

            case "C":
                return 12;

            case "D":
                return 13;

            case "E":
                return 14;

            case "F":
                return 15;

        }
        return Integer.parseInt(String.valueOf(numHaD));
    }

}
