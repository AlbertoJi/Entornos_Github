package EstructuraasDeControl;

public class EC18 {
    public static void main(String[] args) {
                int resultado;
                char letra;
                boolean es_vocal;

                resultado=(int)(Math.random()*26+65);//Sumamos al numero de letras (sin ñ) el valor en ASCII
                letra = (char)resultado;
                es_vocal = ((letra=='A') || (letra=='E') || (letra=='I') || (letra=='O') || (letra=='U'));

                System.out.println("Letra obtenida: " + letra);
                System.out.println("¿Es una vocal?: " + es_vocal );
                System.out.println("¿Es una consonante?: " + !es_vocal);
                System.out.println(Math.random()*26+65);
                System.out.println(Math.random()*26+65);
                System.out.println(Math.random()*26+65);
                System.out.println(Math.random()*26+65);

    }
}
