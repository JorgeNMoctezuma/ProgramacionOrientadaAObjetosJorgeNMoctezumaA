package edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.boletos.process;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.boletos.ui.CLI;
public class CalcularPrecio {

    public  static double PRECIO_NIÑO = 70;
    public  static double PRECIO_ADULTO = 100;
    public  static double PRECIO_MAYOR = 50;
    //sin credencial 70
    public static double CalcularPrecio(int numNiños, int numAdults, int numMayor){return (numAdults * PRECIO_ADULTO) + (numMayor * PRECIO_MAYOR) + (numNiños * PRECIO_NIÑO);}



}
