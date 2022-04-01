package terceraEvaluacion.EntregasTuberíasMarioWorld.Ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
//A partir de una lista de 100 enteros aleatorios entre 0 y 1000, determina cuál es
//el mayor, cuál es el menor, la suma de todos ellos y el valor promedio.
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(); // creamos la lista
        // la rellenamos con 100 elementos random entre 0 y 1000
        int num;
        for (int i = 0; i < 100; i++) {
             num = (int) (Math.random() * 1001);
            lista.add(num);
        }
        lista.stream()
                .forEach(n -> System.out.print(n +" "));
        System.out.println();
        System.out.println("Máximo");
//        Máximo de los elementos de la lista.
        long maximo = lista.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println(maximo);
//        Mínimo de los elementos de la lista.
        System.out.println("Mínimo");
        long minimo = lista.stream()
                .min(Comparator.naturalOrder()).get();
        System.out.println(minimo);
//        Suma todos los elementos de la lista.
        int suma = lista.stream()
                .reduce(0, (comparador, elemento) -> comparador + elemento);
//                .reduce(0, Integer::sum); Alternativa
        System.out.println("Suma = " + suma);
//        Calcula el promedio de todos los elementos de la lista.
        double numerador = lista.stream().reduce(0, (a, b) -> a + b);
//        double numerador = lista.stream().reduce(0, Integer::sum);Alternativa
        double denominador = lista.stream().count();
//        double denominador = (long) lista.size();Alternativa
        System.out.println("Promedio: " + (numerador/denominador));
    }
}
