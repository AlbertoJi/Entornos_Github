package EstructuraasDeControl;

import java.util.Scanner;

//Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
//ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
//a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
//bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
//b. false, en caso contrario.
public class EC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad:");
        int x = sc.nextInt();
        System.out.println("Nivel de estudios:");
        int y = sc.nextInt();
        System.out.println("Ingresos:");
        int z = sc.nextInt();
        boolean jast1 =((x <= 28) && (y > 3)) || ((x < 30) && (z > 28000));
        if (jast1) {
            System.out.println("Ten han dado la beca.");
        } else {
            System.out.println("No te han dado la beca.");
        }
    }
}
