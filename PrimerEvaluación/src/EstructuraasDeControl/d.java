package EstructuraasDeControl;


/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;


public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el año: ");
        int año = sc.nextInt();
        System.out.print("Dime el mes: ");
        int mes = sc.nextInt();
        System.out.print("Dime el dia: ");
        int dia = sc.nextInt();
        if ((año != 0) && (mes >= 1 && mes <= 12) && (mes == 2) && ((año % 4 == 0)  && ((año % 100 != 0) || (año % 400 == 0 ))) && (dia >=1 && dia <= 29)) {
            System.out.println("Fecha correcta: "+ año + "/" + mes + "/" + dia);
        }else if ((año != 0) && (mes >= 1 && mes <= 12) && (mes % 2 != 0)  || (mes == 8) || (mes == 10) || (mes == 12) && (dia >=1 && dia <=31)) {
            System.out.println("Fecha correcta: "+ año + "/" + mes + "/" + dia);
        }else if ((año != 0) && (mes >= 1 && mes <= 12) && (mes % 2 == 0) && (mes != 2) && (dia >=1 && dia <=30)) {
            System.out.println("Fecha correcta: "+ año + "/" + mes + "/" + dia);
        }else if  ((año != 0) && (mes >= 1 && mes <= 12) && (mes == 2) && (dia >=1 && dia <= 28)){
            System.out.println("Fecha correcta: "+ año + "/" + mes + "/" + dia);
        }else {
            System.out.println("Fecha incorrecta: "+ año + "/" + mes + "/" + dia);
        }
    }
}
