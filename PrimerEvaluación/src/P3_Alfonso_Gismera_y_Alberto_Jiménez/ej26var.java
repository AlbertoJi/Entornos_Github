package P3_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

//Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
//endedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
//tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
//su sueldo base y comisiones.
public class ej26var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es sueldo base");
        double sueldob = sc.nextDouble();
        System.out.println("Dime cuantas ventas");
        int total = sc.nextInt();
        double num = 0;
        double suma = 0;
        int cont = 0;
        System.out.println("Por cuanto has echo las ventas");
        for (int i = 1 ; i <= total; i++) {
            System.out.println("precio");
            num = sc.nextDouble();
            suma = suma + num;
            cont++;
            System.out.println("Precio de la venta " + cont);
        }
        double vtotal = (suma * 10)/100;
        double sueldof = sueldob + vtotal;
        System.out.println("Este el sueldo final del empleado:" + sueldof +"$");

    }
}
