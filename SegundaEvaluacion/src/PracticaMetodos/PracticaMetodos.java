package PracticaMetodos;

import java.util.Scanner;

/**
 * Esta clase es la resolucion de la practica metodos
 * @author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */

public class PracticaMetodos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();



    }
    private static void menu() {
        int opción;

        do {
            System.out.println("¿Que ejercicio quieres resolver? (1-6) y 7 para salir" );
            opción = sc.nextInt();
            switch (opción) {
                case 1:
                    System.out.println("1");
                    Ejercicio1();
                    System.out.println("Quieres resolver otro (s/n)");
                    String seguir = sc.nextLine();
                    if (seguir.equals("s") || seguir.equals("S")){
                        menu();
                    } else {
                        opción = 7;

                    }
                    break;
                case 2:
                    Ejercicio2();
                    System.out.println("Quieres resolver otro (s/n)");
                    seguir = sc.nextLine();
                    if (seguir.equals("s") || seguir.equals("S")){
                        menu();
                    } else {
                        opción = 7;
                    }
                    break;
                case 3:
                    Ejercicio3();
                    System.out.println("Quieres resolver otro (s/n)");
                    seguir = sc.nextLine();
                    seguir = sc.nextLine();
                    System.out.println("peep");
                    if (seguir.equals("s") || seguir.equals("S")){
                        menu();
                    } else {
                        opción = 7;
                    }
                    break;
                case 4:

                    //Ejercicio4();
                    System.out.println("Quieres resolver otro (s/n)");
                    seguir = sc.nextLine();
                    if (seguir.equals("s") || seguir.equals("S")){
                        menu();
                    } else {
                        opción = 7;
                    }
                    break;
                case 5:

                    //Ejercicio5();
                    System.out.println("Quieres resolver otro (s/n)");
                    seguir = sc.nextLine();
                    if (seguir.equals("s") || seguir.equals("S")){
                        menu();
                    } else {
                        opción = 7;
                    }
                    break;
                case 6:

                    //Ejercicio6();
                    System.out.println("Quieres resolver otro (s/n)");
                    seguir = sc.nextLine();
                    if (seguir.equals("s") || seguir.equals("S")){
                        menu();
                    } else {
                        opción = 7;
                    }
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción incorrecta.");

            }
        } while (opción != 7);
    }

    private static void Ejercicio1() {
        String enunciado = "Escribe un método de nombre determinarSigno que reciba un número entero y\n" +
                "compruebe si el número es negativo, positivo o cero. El método debe devolver -1, 1 o\n" +
                "0, respectivamente.";
        System.out.println(enunciado);
        System.out.println("introducir numero");
        int n = sc.nextInt();
        sc.nextLine(); //limpiamos el sc luego para poder el meter string necesario

        System.out.println(determinarSigno(n));
    }

    private static  int determinarSigno(int numero) {
        if (numero > 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    private static void Ejercicio2() {
        String enunciado = "Implementa el método sumaEnRango para calcular la suma de números enteros en el\n" +
                "rango que va desde un número (inclusive) a otro (no inclusive) pasados como\n" +
                "parámetro.";
        System.out.println(enunciado);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.nextLine();
        System.out.println(sumaEnRango(num1,num2));


    }

    public static int sumaEnRango(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            num1 = num1 + i;
        }
        return num1;
    }
    private static void Ejercicio3() {
        String enunciado = "Dado un método que recibe un valor long y devuelve el valor máximo del tipo long\n" +
                "menos el número dado:\n" +
                "public static long getMaxMenosValor(long val) {\n" +
                "return Long.MAX_VALUE - val;\n" +
                "}";
        System.out.println(enunciado);
        System.out.println("Llamada del primer metodo");
        System.out.println("=========================");
        long val = sc.nextLong();
        System.out.println("Resultado:" + getMaxMenosValor(val));
        System.out.println("Llamada del segundo metodo");
        int valo = sc.nextInt();
        System.out.println("=========================");
        System.out.println("Resultado:" + getMaxMenosValor(valo));


    }
    public static long getMaxMenosValor(long val) {

        return Long.MAX_VALUE - val;
    }
    public static long getMaxMenosValor(int val) {

        return Integer.MAX_VALUE - val;
    }

    private static void Ejercicio4() {
        String enunciado = "hoola";
    }
    private static void ejercicio5() {
        String enunciado = "hoola";
    }
    private static void ejercicio6() {
        String enunciado = "hoola";
    }
    private static void ejercicio7() {
        String enunciado = "hoola";
    }



}


