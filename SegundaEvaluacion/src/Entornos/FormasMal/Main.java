package Entornos.FormasMal;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de la clase (constructor vacio).
        Triángulo triángulo1 = new Triángulo();

        //Accede mediante esta a los atributos y le asignas un valor
        triángulo1.setBase(3);
        triángulo1.setAltura(5);

        //Visualiza su área.(Llama al método toString())
        triángulo1.calcularArea();
        System.out.println(triángulo1.toString());

        /*Crea una instancia de la clase,
        pero accede al constructor, pasándole como parámetros dos valores
         */
        Triángulo triángulo2 = new Triángulo(3, 13);

        // Visualiza su área
        triángulo2.calcularArea();
        System.out.println(triángulo2.toString());

    }
}
