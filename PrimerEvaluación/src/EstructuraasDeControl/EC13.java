package EstructuraasDeControl;

import java.util.Scanner;

//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
//la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
//venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto
//recibirá un productor por la uva que entrega en un embarque, considerando lo
//siguiente:
//a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
//1; y 30 céntimos si es de tamaño 2.
//b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
//cuando es de tamaño 2.
public class EC13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el precio");
        double pini = sc.nextDouble();
        System.out.println("¿ QUe tipo de uva A o B?");
        String tipoUva = sc.next();
        System.out.println("¿ Tamaño de uva 1 o 2?");
        String tamañoUva = sc.next();
        double precioF;
        if (tipoUva.equals("A")) {
            if (tamañoUva.equals("1")) {
                precioF = pini + 20;
            } else {
                precioF = pini + 30;
            }
        } else {
            if (tamañoUva.equals("1")) {
                precioF = pini - 30;
            } else {
                precioF = pini - 50;
            }
        }
        System.out.println("Precio final:" + precioF);
    }
}
