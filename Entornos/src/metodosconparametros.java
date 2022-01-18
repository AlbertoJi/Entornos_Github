import java.util.Scanner;

//calculadora
public class metodosconparametros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números");
        double numero = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("Dime la operación: \n1 Suma\n2 Resta\n3 Muliplicar\n4 Dividir");
        int ope = sc.nextInt();
            switch (ope) {
                case 1:
                    suma(numero,numero2);
                    break;
                case 2:
                    resta(numero,numero2);
                    break;
                case 3:
                    multi(numero,numero2);
                    break;
                case 4:
                    dividir(numero,numero2);
                    break;
                default:
            }

    }
    public static void suma(double numero,double numero2) {
        double suma = numero + numero2;
        System.out.println("suma: "+ suma);
    }
    public static void resta(double numero,double numero2) {
        double resta = numero - numero2;
        System.out.println("resta: "+ resta);
    }
    public static void multi(double numero,double numero2) {
        double multi = numero * numero2;
        System.out.println("multi: "+ multi);
    }
    public static void dividir(double numero,double numero2) {
        double dividir = numero / numero2;
        System.out.println("dividir: "+ dividir);
    }
}
