package EstructuraasDeControl;

public class EC26Math {
    public static void main(String[] args) {
        for (int i = 0 ; i < 100; i++) {
            System.out.printf("%.2f ", Math.random());
        }
        int num;
        System.out.println("\n\nNúmeros de 0 a 9");
        for ( int i = 0 ; i <100; i++) {
           num = (int) (Math.random()  * 10);
            System.out.print(num + " ");
        }
        System.out.println("\n\nNúmeros de 1 a 10");
        for ( int i = 0 ; i <100; i++) {
            num = (int)(Math.random() * 10 + 1);
            System.out.print(num + " ");
        }
        System.out.println("\n\nNúmeros de 1 a 10");
        for ( int i = 0 ; i < 100; i++) {
            num = (int)(Math.random() * 49 - 10);
            System.out.print(num + " ");
        }
    }
}
