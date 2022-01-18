import java.util.Scanner;

public class metodos {
    public static void main(String[] args) {
        menu();
    }
    public static void ejercicio10() {
        System.out.println("***** Ejercicio 10 *****");
        int num = 95;
        int decenas = num / 10;
        System.out.println("decenas: " + decenas);
    }
    public static void ejercicio11() {
        System.out.println("***** Ejercicio 11 *****");
        int num = 95;
        int decenas = num / 10;
        int resD = num % 10;

        System.out.println("Numero invertido: " + resD + decenas);
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el ejercicio");
        int ej = sc.nextInt();
        switch (ej) {
            case 10:
                ejercicio10();
                break;
            case 11:
                ejercicio11();
                break;
            default:
                break;
        }
    }
}
