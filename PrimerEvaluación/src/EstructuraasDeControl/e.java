package EstructuraasDeControl;

public class e {
    public static void main(String[] args) {
        int n = 4321;
        int s;
        int u = 0;
        for (s = 0; n > 0; ) {
            u = n % 10;
            s = s + u;
            n = n / 10;
        }
        System.out.println(s);
        System.out.println(n);
    }
}
