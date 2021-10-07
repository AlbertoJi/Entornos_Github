package variablesDatosOperadores;

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
        System.out.println("Priemra venta");
        double exrtra1 = sc.nextDouble();
        System.out.println("Segunda venta");
        double exrtra2 = sc.nextDouble();
        System.out.println("Tercera venta");
        double exrtra3 = sc.nextInt();
        double r1 = (exrtra1 * 10)/100;
        double r2 = (exrtra2 * 10)/100;
        double r3 = (exrtra3 * 10)/100;
        double sueldof = sueldob + r1 + r2 + r3;
        System.out.println("Este el sueldo final del empleado:" + sueldof +"$");

    }
}
