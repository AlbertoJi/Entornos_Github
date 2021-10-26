package EstructuraasDeControl;

public class EC29 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.print("Tabla de multiplicar" + i);
            for (int j = 0; j <= 10; j++) {
                System.out.print( (i * j) + "\t");

            }
            System.out.println();
        }
    }
}
