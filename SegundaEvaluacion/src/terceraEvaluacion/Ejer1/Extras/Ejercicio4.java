package terceraEvaluacion.Ejer1.Extras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    //Implementa una aplicación donde se piden por consola números reales hasta
//que se introduce un 0. A medida que se leen del teclado, los valores positivos se
//insertan en una colección y los negativos en otra. Al final, se muestran ambas
//colecciones y las sumas de los elementos de cada una de ellas. Por último, se
//eliminan de ambas todos los valores que sean mayores que 10 o menores de -
//10 y se vuelven a mostrar.
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaN = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Número: "); // pedimos número
            num = sc.nextInt(); // metemos número
            // Los números se irán insertando en una colección, pudiéndose repetir.
            if (num >= 0) { // si no es negativo, lo guardamos
                lista.add(num);
            } else {
                listaN.add(num);
            }

        } while (num != 0); // salimos cuando el num = 0

        // Al terminar, se mostrará la colección por pantalla.
        System.out.println("Mostramos la lista");
        System.out.println(lista);
        System.out.println(listaN);
        System.out.println("Lista positiva");
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            Integer elemento = it.next();
            if (elemento > 10){
                it.remove();
            }
        }
        System.out.println(lista);
        System.out.println("Lista Negativa");
        Iterator<Integer> iN = listaN.iterator();
        while (iN.hasNext()){

            Integer elemento = iN.next();
            if (elemento < -10){
                iN.remove();
            }
        }
        System.out.println(listaN);
//         Esto seria otra forma de hacerlo
//        System.out.println("Lista positiva");
//        lista.removeIf(elemento -> elemento >= 10);
//        System.out.println(lista);
//        System.out.println("Lista Negativa");
//        listaN.removeIf(elemento -> elemento <= -10);
//        System.out.println(listaN);
    }
}
