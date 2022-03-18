package EstructuraasDeControl;

public class EjBuclesForAnidado {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) { //bucle externo 0,1 etc a 4(5 interaciones)
            System.out.println("Iteración del bucle externo i=" + i);
            for (int j = 1; j < 10; j++) { //bucle interno 0,1,2,3 etc 9(10 iteraciones)
                System.out.print(i+"x"+j+"="+ i * j+", ");// esto suele ser una linea
            } //cada que hace una vuelta el bucle interno quiero que salte de linea
            System.out.println();
        }
    }
}
