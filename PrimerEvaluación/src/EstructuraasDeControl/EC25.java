package EstructuraasDeControl;

import java.util.Scanner;

public class EC25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el número a");
        int a = sc.nextInt();
        System.out.println("Dame el número b");
        int b = sc.nextInt();
        int suma = 0;
        if (a <= b) {
            for (int i = a; i <= b ; i++) {
                suma = suma + i;
            }
        } else {
            for (int i = b; i<= a ; i++){
                suma = suma + i;
            }
        }
           System.out.println("Resultado:" + suma);
//        Segunda forma
//        int mayor;
//        int menor;
//        if (a > b) {
//            mayor = a;
//            menor = b;
//        } else {
//            mayor = b;
//            menor = a;
//        }
//        for ( int i = menor; i <= mayor ;  i++) {
//            suma = suma + i;
//        }
//        System.out.println("Resultado:" + suma);
    }
}
