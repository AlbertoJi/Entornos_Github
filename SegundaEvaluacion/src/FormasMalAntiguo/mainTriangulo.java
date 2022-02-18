package FormasMalAntiguo;

public class mainTriangulo {
    public static void main(String[] args) {
        // Crea una instancia de la clase (constructor vacio).
        triangulo triangulo1 = new triangulo();

        //Accede mediante esta a los atributos y le asignas un valor
        triangulo1.set_base(3);
        triangulo1.set_altura(5);

        //Visualiza su área.(Llama al método toString())
        triangulo1.calcular_area();
        System.out.println(triangulo1);

        /*Crea una instancia de la clase,
        pero accede al constructor, pasándole como parámetros dos valores
         */
        triangulo triangulo2 = new triangulo(3, 13);

        // Visualiza su área
        triangulo2.calcular_area();
        System.out.println(triangulo2);

    }
}
