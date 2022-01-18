package String;

import java.util.Scanner;

public class EjerciciosString {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.next();
        //ejercicio5(cadena);
        //ejercicio6(cadena);
        //ejercicio7(cadena);
        //ejercicio9(cadena);
        ejercicio10(cadena);
    }
    public static void ejercicio5(String cadena){
        String primeraLetra = cadena.substring(0,1);
        boolean empiezaPorJ = primeraLetra.equalsIgnoreCase("j");
        System.out.println(empiezaPorJ);
    }
    public static void ejercicio6(String cadena){
        System.out.println("\nEjercicio 6");
        System.out.println("===========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce otra cadena.");
        String cadena2 = sc.next();
        String cadena1SinEspacios = cadena.replace(" ","");
        String cadena2SinEspacios = cadena.replace(" ","");
        System.out.println(cadena1SinEspacios.equals(cadena2SinEspacios));
    }
    public static void ejercicio7(String cadena){
//Extraer una subcadena: escribe un programa que lea una cadena y dos números enteros
//para indicar los límites inferior y superior respectivamente de un rango dentro de las
//posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango: a)
//suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la
//longitud de la cadena; b) Validando que sucede a).
        System.out.println("\nEjercicio 7");
        System.out.println("===========");
        System.out.println("Limite inferior");
        int a = sc.nextInt();
        System.out.println("Limite superior");
        int b = sc.nextInt();
        if (a >= 0 && b >=0){
            System.out.println(cadena.substring(a-1,b));
        }else{
            System.out.println("No funciona");
        }
    }
    public static void ejercicio9(String cadena){
        System.out.println("\nEjercicio 9");
        System.out.println("===========");
        String inversa = "";
        for (int i = cadena.length()-1; i >0 ; i--) {
            inversa = inversa + cadena.charAt(i);
            System.out.println(inversa);
        }
    }
    public static void ejercicio10(String cadena){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEjercicio 10");
        System.out.println("===========");
        System.out.println("Introduce primer caracter");
        char c1 = sc.nextLine().charAt(0);
        System.out.println("Introduce segundo caracter");
        char c2 = sc.nextLine().charAt(0);
        char [] caracteres = new char[cadena.length()];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = cadena.charAt(i);
        }
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == c1){
                caracteres[i] = c2;
                break;
            }
        }
           System.out.println(caracteres);
    }
}
