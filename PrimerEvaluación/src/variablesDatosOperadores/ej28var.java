package variablesDatosOperadores;

import java.util.Scanner;

public class ej28var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        28. Escribe un programa que lea cuatro números por teclado y decremente cada uno de
//        ellos. El programa debe mostrar los resultados en la misma línea, en el mismo orden
//        que entraron, separados por espacios.
        System.out.println("Danos cuatro números");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
         n1 -= 1;
         n2 -= 1;
         n3 -= 1;
         n4 -= 1;
        System.out.println("Ahora decrementos: " +  n1 + " " +  n2 +" " + n3 + " " +  n4);
        int a = 4;
        int b = a-2;
        System.out.println(b);


    }

}
