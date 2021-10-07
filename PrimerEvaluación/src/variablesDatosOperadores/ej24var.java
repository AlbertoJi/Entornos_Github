package variablesDatosOperadores;
//Realiza un programa que pida el precio de venta de un producto, la cantidad de
//productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
//importe a abonar.
import java.util.Scanner;

public class ej24var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto cuesta el producto");
        double pro = sc.nextDouble();
        System.out.println("¿Cuanto Productos son?");
        double precio = sc.nextDouble();
        System.out.println("¿Cuanto IVA tiene?");
        double iva = sc.nextDouble();
        double pmedio = (pro * precio * iva) /100;
        double pfinal = (pro * precio + pmedio);
        System.out.println("Usted debe pagar esto:" + pfinal + "$");
    }
}
