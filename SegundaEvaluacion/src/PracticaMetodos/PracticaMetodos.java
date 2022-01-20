package PracticaMetodos;

import java.util.Arrays;
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
        boolean salir = false;
        do {
            System.out.println("¿Que ejercicio quieres resolver? (1-6)");
            opción = sc.nextInt();
            ResolverEjercicio(opción);
            System.out.println("Quieres resolver otro (s/n)");
            char respuesta = sc.next().charAt(0);
            salir = respuesta != 's' && respuesta != 'S';
            
        } while (!salir);
    }
    private static void ResolverEjercicio (int opción){
        switch (opción) {
            case 1:
                System.out.println("1");
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5:
                Ejercicio5();
                break;
            case 6:
                Ejercicio6();
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
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
        int suma = 0;
        for (int i = num1; i < num2; i++) {
            suma =  suma + i;
            System.out.println(suma);
        }
        return suma;
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
        sc.nextLine();
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
        String enunciado = "Tenemos un método print(String arg). El método devuelve el nombre y su\n" +
                "argumento (entre comillas, porque es un String). Por ejemplo, pasando el argumento\n" +
                "“test”\n" +
                "print(\"test\")\n" +
                "Sobrecarga este método escribiendo un nuevo método con el mismo nombre y dos\n" +
                "argumentos: un String y un entero. El nuevo método debe imprimir el nombre y los dos\n" +
                "parámetros. Por ejemplo:\n" +
                "print(\"test\", 4)";

        System.out.println(enunciado);
        System.out.println("Llamada del primer metodo");
        System.out.println("=========================");
        System.out.println("Cadena a pasar como argumento:");
        String arg = sc.next();
        sc.nextLine();
        print(arg);
        System.out.println("Llamada del segundo metodo");
        System.out.println("=========================");
        System.out.println("Cadena a pasar como argumento:");
        arg = sc.next();
        sc.nextLine();
        System.out.println("Número a pasar como argumento:");
        int entero = sc.nextInt();
        print(arg,entero);

    }


    public static void print(String arg){
        System.out.println("\""+ arg +"\"");
         //hicimos esto porque sino no ponia dos veces arg
    }
    public static void print(String arg, int entero){
        System.out.println("print"+"(" +"\""+ arg +"\""+", "+ entero +")");
    }
    private static void Ejercicio5() {
        String enunciado = "Escribe un método llamado sumarValorPorÍndice. El método debe recibir un array de\n" +
                "longs y sumar al elemento especificado por el índice el valor pasado. Parámetros que\n" +
                "recibe: un array de longs, el índice de un elemento (int) y el valor a sumar (long). El\n" +
                "método no devuelve ningún valor. La siguiente invocación debería funcionar\n" +
                "correctamente:\n" +
                "sumarValorPorÍndice(array, índice, valor);";
        System.out.println(enunciado);
        long[] array = new long[20];
        System.out.println();

        }

    public static void sumarValorPorÍndice(long[] a,int ind,int val){


    }
    private static void Ejercicio6() {
        String enunciado = "Escribe un método llamado getPrimeroYÚltimo. El método recibe un array de enteros\n" +
                "y devolver otro array de enteros. El array retornado debe contener dos elementos: el\n" +
                "primero y el último de los elementos del array de entrada.";
        System.out.println(enunciado);
        int[] entero = new int[20];
        getPrimeroYÚltimo(entero);

    }
    public static void getPrimeroYÚltimo(int[] entero) {
        for (int i = 0; i < entero.length; i++) {
            entero[i] = (int) (Math.random() * 100 + 1);
        }
        int[] entero2 = {entero[0],entero[19]};
        System.out.println(Arrays.toString(entero));
        System.out.println(Arrays.toString(entero2));
    }

}


