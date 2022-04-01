package terceraEvaluacion.Programacion.EjerciciosStream;

import java.util.ArrayList;
import java.util.List;

//1. Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15. Utilizando
//        streams, haz lo siguiente:
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 15 +1));
        }
//        a. Imprime todos los elementos de la lista, sin ordenar.
            lista.stream()
                    .forEach(n-> System.out.print(n + " "));
        System.out.println();
//        b. Imprime todos los elementos de la lista, ordenados.
        lista.stream()
                .sorted()
                .forEach(n-> System.out.print(n + " "));
        System.out.println();
//        c. Imprime todos los elementos de la lista, sin repetir, ordenados.
        lista.stream()
                .distinct()
                .forEach(n-> System.out.print(n + " "));
        System.out.println();
//        d. Imprime sólo los mayores o iguales a 5.
        lista.stream()
                .filter(n-> n >= 5)
                .forEach(n-> System.out.print(n + " "));
        System.out.println();
//        e. Imprime sólo los mayores o iguales a 5, ordenados.
        lista.stream()
                .filter(n-> n >= 5)
                .sorted()
                .forEach(n-> System.out.print(n + " "));
        System.out.println();
//        f. Imprime sólo los mayuores o iguales a 5, ordenados inversamente.
        lista.stream()
                .filter(n-> n >= 5)
                .sorted((n1, n2) -> n2 -n1)
                .forEach(n-> System.out.print(n + " "));
        System.out.println();
//        g. Suma todos los elementos de la lista.
        int suma = lista.stream()
                .reduce(0, (comparador, elemento) -> comparador + elemento);
        System.out.println("Suma = " + suma);
//        h. Suma todos los elementos mayores o iguales a 5.
        suma = lista.stream()
                .filter(n -> n >= 5)
                .reduce(0, (acumulador, elemento) -> acumulador + elemento);
        System.out.println("Suma de los >=5 = " + suma);
//        i. Calcula el promedio de todos los elementos de la lista.
       double numerador = lista.stream().reduce(0, (a, b) -> a + b);
       double denominador = lista.stream().count();
        System.out.println("Premedio: " + (numerador/denominador));


    }
}
