package Arrays;
//Realizar un programa que inicialice un array con 10 valores aleatorios (del 1 al 100) y
//posteriormente muestre en pantalla cada elemento del array junto con su cuadrado y su
//cubo.
public class ar4 {
    public static void main(String[] args) {

     int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * 10 + 1);
        System.out.println("============");
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[1] + "          ");
        }
    }
    }
}
