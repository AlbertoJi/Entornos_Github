package Pooe.Ejercicios.Ejercicio14;

public class Robot {
    /*
    14. Crea una clase Robot con dos atributos de tipo String: nombre y modelo, y un
    atributo int duración.
    Añade tres constructores:
    • Un constructor sin parámetros que cree objetos de nombre “Anónimo” y modelo
        “Desconocido” (no modifica el valor por defecto de duración).
    • Un constructor con (tres) parámetros que, recibe valores e inicializa canda uno de los
        tres atributos de los objetos que se crean.
    • Un constructor con (dos) parámetros que recibe por parámetro nombre y modelo al
        crearse un objeto. En el cuerpo del constructor invocamos al constructor de tres
        parámetros, con el nombre y modelo recibidos y una duración de 20 años.
        Crea en el mismo fichero una clase Main en la cual creamos tres robots, uno con cada
        constructor, y mostramos sus propiedades.
     */
    String nombre;
    String modelo;
    int duración;

    public Robot() {
        this.nombre = "Anonimo";
        this.modelo = "Desconocido";
    }

    public Robot(String nombre, String modelo, int duración) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duración = duración;
    }
    public Robot(String nombre, String modelo){
        this(nombre,modelo,20);
    }
}
