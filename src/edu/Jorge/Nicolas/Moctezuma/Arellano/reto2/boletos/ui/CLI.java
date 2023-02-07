package edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.boletos.ui;
import edu.Jorge.Nicolas.Moctezuma.Arellano.reto2.boletos.process.CalcularPrecio;
import java.util.Scanner;
public class CLI {

    public static void ShowMenu(){
        int numNiños = 0;
        int numAdults = 0;
        int numMayor = 0;
        int total = 0;
        do {
            System.out.println("Qué boleto desea comprar? \n 1) Niño o adulto mayor sin credencial (INAPAM): $70 \n 2) Adulto: $100 \n 3) Adulto mayor con credencial (INAPAM): $50\n 4) Cuenta total\n 5) Cancelar pedido");
            Scanner scanner = new Scanner(System.in);

            int TipoDeBoleto;
            TipoDeBoleto = scanner.nextInt();
            if (TipoDeBoleto == 5){
                System.out.println("Compra cancelada,esperamos vuelva pronto");
                break;
            }


            switch (TipoDeBoleto){
                case 1:
                    numNiños++;
                    break;

                case 2:
                    numAdults++;
                    break;

                case 3:
                    numMayor++;
                    break;

                    case 4:
                    total++;
                    break;

            }

        }while (total == 0);

        System.out.println("El monto total será de: $" + (CalcularPrecio.CalcularPrecio(numMayor, numAdults, numNiños)));
    }

}
