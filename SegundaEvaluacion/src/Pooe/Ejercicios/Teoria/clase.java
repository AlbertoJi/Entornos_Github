package Pooe.Ejercicios.Teoria;

import java.util.Date;

public class clase {
    public static Date ultimaCreada;
    public static int cont;
    public  clase(){
    ultimaCreada = new Date();
    cont++;
    }

}
class Main {
    public static void main(String[] args) {
        System.out.println(clase.cont);

        clase c1 = new clase();
        System.out.println(clase.cont);

        clase c2 = new clase();
        System.out.println(clase.cont);
    }
}