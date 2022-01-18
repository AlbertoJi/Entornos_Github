package Pooe.Ejercicios.Ejercicio14;

import Pooe.Ejercicios.Ejercicio13.Libro;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot("Pepa","Mark 5",30);
        Robot robot3 = new Robot("Adrian","perro");
        System.out.println(robot1.nombre +" "+robot1.modelo +" "+robot1.duración);
        System.out.println(robot2.nombre +" "+robot2.modelo +" "+robot2.duración);
        System.out.println(robot3.nombre +" "+robot3.modelo +" "+robot3.duración);

    }
}
