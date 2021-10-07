package variablesDatosOperadores;

import java.util.Scanner;

//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
//desea saber cuanto deberá pagar finalmente por su compra.
public class ej25var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto cuesta el producto");
        double pro = sc.nextDouble();
        System.out.println("¿Cuanto Productos son?");
        double precio = sc.nextDouble();
        double iva = 15;
        double pmedio = (pro * precio * iva) /100;
        double pfinal = (pro * precio - pmedio);
        System.out.println("Usted debe pagar esto:" + pfinal + "$");
    }
}
