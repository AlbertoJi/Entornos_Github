package Pooe.Ferroviario.Maquinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Trenes {


    static ArrayList<Vagones> tren = new ArrayList<Vagones>(5);

    public static void main(String[] args) {
        añadirvagon();


    }




    public static void añadirvagon() {
        int opción;
        int vagon = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es la carga máxima?");
        int carga = sc.nextInt();
        System.out.println("¿Qué tipo de mercancía lleva?");
        System.out.println("1.Perecedera\n 2.No perecedera\n 3.Frágil\n 4.Peligrosa\n 5.Dimensional");
        opción = sc.nextInt();
        String tipo = null;
        switch (opción) {
            case 1:
                tipo = "Perecedera";
                break;
            case 2:
                tipo = "No perecedera";
                break;
            case 3:
                tipo = "Frágil";
                break;
            case 4:
                tipo = "Peligrosa";
                break;
            case 5:
                tipo = "Dimensional";
                break;
        }
        Vagones vagones = new Vagones(1 + vagon, carga,0, tipo);
        vagon++;
        if (tren.size() >= 1) {
            System.out.println("No se puede añadir mas vagones");
        } else {
            tren.add(vagones);
            System.out.println("bien");
            vagones.Vasignado();
            añadirvagon();
        }
    }
    class leerarray{
        private String nombre;
        void setNombre(String nombre){
            this.nombre = nombre;
        }
        String getNombre(){
            return nombre;
        }
    }

}
