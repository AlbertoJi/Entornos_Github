package EstructuraasDeControl;

import java.util.Scanner;

public class EC31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero:");
        int n = sc.nextInt();
        int producto = 1;
        for (int i = 1; i <= n; i++){
         producto = producto * 1;
        }
        System.out.println(producto);
        System.out.println(n +" ! = " + producto);
    }
}
