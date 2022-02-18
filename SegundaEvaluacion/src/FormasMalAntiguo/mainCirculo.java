package FormasMalAntiguo;

public class mainCirculo {
    public static void main(String[] args) {
        /* Comprueba el main() para: */

        punto p1 = new punto();
        Circulo c1 = new Circulo(2, p1);
        System.out.println(c1.calcularArea());
        System.out.println(p1.getX());
        System.out.println(p1.getY());


//utilizo el tercer constructor

        punto p2 = new punto(2, 1);
        Circulo c2 = new Circulo(7, 9, 5);
        System.out.println(c2.calcularDistanciaDesde(p2));


//utilizo el segundo constructor

        Circulo c3 = new Circulo(1, p2);
        System.out.println(" el radio es : " + c3.getRadio());
        System.out.println(c3.getCentro().getX());
        //con c3 . no puedo acceder a getX()


        //utilizo el primer constructor

        Circulo c4 = new Circulo();
        System.out.println("El radio es el del constructor1: " + c4.getRadio());
        System.out.println(c4.getCentro().getX());
        System.out.println(c4.getCentro().getY());
    }
}



