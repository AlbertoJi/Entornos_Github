package Entornos.FormasMal;

public class PrincipalCirculo {
    public static void main(String[] args) {
       /* Comprueba el main() para: */

        Punto p1 = new Punto();
        Círculo c1 = new Círculo(2, p1);
        System.out.println(c1.calcularArea());
        System.out.println(p1.getX());
        System.out.println(p1.getY());


//utilizo el tercer constructor

        Punto p2=new Punto(2,1);
        Círculo c2= new Círculo(7,9,5);
        System.out.println(c2.calcularDistanciaDesde(p2));


//utilizo el segundo constructor

        Círculo c3 = new Círculo(1, p2);
        System.out.println(" el radio es : "+c3.getRadio());
        System.out.println(c3.getCentro().getX());
        //con c3 . no puedo acceder a getX()


        //utilizo el primer constructor

        Círculo c4 = new Círculo();
        System.out.println("El radio es el del constructor1: "+c4.getRadio());
        System.out.println(c4.getCentro().getX());
        System.out.println(c4.getCentro().getY());
    }
}



