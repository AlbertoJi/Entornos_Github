package terceraEvaluacion.Ejer1.Extras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crear una lista de números enteros positivos introducidos por consola hasta
//que se introduzca uno negativo. A continuación, recorrer la lista y mostrar por
//pantalla los índices de los elementos de valor par, que será multiplicado por 100.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int num;
        do {
            System.out.print("Número: "); // pedimos número
            num = sc.nextInt(); // metemos número
            // Los números se irán insertando en una colección, pudiéndose repetir.
            // vemos si es par y si lo es lo *100
            if (num % 2 == 0) {
                num *= 100;
                lista.add(num);

            } else if(num >= 0)  { //Al principio lo hice con un else pero nos añadia  el -1
                lista.add(num);

            }

            // si es negativo no lo guardamos pero seguimos
        } while (num > 0); // salimos cuando el num = -1

        // Al terminar, se mostrará la colección por pantalla.
        System.out.println("Mostramos la lista");
        System.out.println(lista);


    }
}
