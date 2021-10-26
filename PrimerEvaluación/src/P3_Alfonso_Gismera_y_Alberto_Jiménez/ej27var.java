package P3_Alfonso_Gismera_y_Alberto_Jiménez;

import java.util.Scanner;

/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
public class ej27var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos examenes has tenido");
                int total = sc.nextInt();
                double num = 0;
                double suma = 0;
                int cont = 0;
                System.out.println("Dime las notas");
                for (int i = 1 ; i <= total; i++) {
                num = sc.nextDouble();
                suma = suma + num;
                cont++;
                System.out.println("Nota del parcial " + cont);
                }
                double media = suma/ cont;
                System.out.println("Media " + Math.round(media));
                double r1 = (media * 55)/100;
        System.out.println("Dime la nota del examen final");
                double nf = sc.nextDouble();
                double r2 = (nf * 30)/100;
        System.out.println("Dime la nota del trabajo final");
                double tf = sc.nextDouble();
                double r3 = (tf * 15)/100;
                double cf =(r1 + r2 + r3);
        System.out.println("Mi nota del examen final " + nf);
        System.out.println("Mi nota del trabajo final " + tf);
        System.out.printf("Mi calificación final: %.1f ",+ cf);
                if ((cf >= 5) && (cf <=10)){
                System.out.println("Aprovado");
                }else{
                System.out.println("Suspendido");
        }
    }
}
