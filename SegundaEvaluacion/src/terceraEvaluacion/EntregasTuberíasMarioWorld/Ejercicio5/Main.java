package terceraEvaluacion.EntregasTuberíasMarioWorld.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> números = new ArrayList<>();
        int num=0;
        for (int i = 0; i <= 40; i++) {
             num = new Random().nextInt(31 + 10) -20;
            números.add(num);

        }
        System.out.println(números);
        System.out.println("Números positivos");
        números.stream()
                .distinct()
                .sorted()
                .filter(n -> n > 0)
                .forEach(n -> System.out.print(n +" "));
        System.out.println();
        System.out.println("Números negativos");
        números.stream()
                .distinct()
                .sorted()
                .filter(n -> n < 0)
                .forEach(n -> System.out.print(n +" "));
        System.out.println();
        System.out.println("Elementos de los números positivos");
        long numeroElemntos = números.stream()
                .distinct()
                .filter(n -> n > 0)
                .count();
        System.out.println(numeroElemntos);
        System.out.println("Elementos de los números negativos");
        long numeroElemntosNegativos = números.stream()
                .distinct()
                .filter(n -> n < 0 )
                .count();
        System.out.println(numeroElemntosNegativos);
        System.out.println("Números de -10 a 10");
        números.stream()
                .distinct()
                .sorted()
                .filter(n -> n != 0 && n < 11 && n > -11)
                .forEach(n -> System.out.print(n +" "));
        System.out.println();
        System.out.println("Elementos de los números de -10 a 10");
        long contador = números.stream()
                .distinct()
                .filter(n -> n != 0 && n < 11 && n > -11)
                .count();
        System.out.println(contador);

    }
}
