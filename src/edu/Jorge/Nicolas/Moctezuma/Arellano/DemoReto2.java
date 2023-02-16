package edu.Jorge.Nicolas.Moctezuma.Arellano;

public class DemoReto2 {

    public static void main(String[] args){
 demoFor();
 demoForArreglos();
    }
    //paquetes solo inician con minusculas
    //clases
    public static  void demoFor(){
        for (int i=0; i<10;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (i>5 && i<7){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void demoForArreglos(){
        String [] arreglo = {"pato", "palabra", "acido", "Chapala"};

        for (String palabra: arreglo){
            System.out.println((palabra));
        }
    }

}
