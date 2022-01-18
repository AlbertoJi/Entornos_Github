package Pooe.Ejercicios.Ejercicio13;

import java.util.Arrays;

public class Libro {
    /*
    Escribe una clase llamada Libro. Debe contener tres atributos: título, de tipo String,
añoDePublicación, de tipo int y autores, de tipo array de String, y un constructor para
inicializar los atributos. El orden de los parámetros en el constructor debe ser el
mismo que el indicado en este enunciado.
     */
    //atributos privados

    //crear dos libros:clase main
    private  String titulo;
    private int año_de_publicación;
    private String[] autores;

    public Libro(String titulo, int año_de_publicación, String[] autores) {
        this.titulo = titulo;
        this.año_de_publicación = año_de_publicación;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño_de_publicación() {
        return año_de_publicación;
    }

    public String[] getAutores() {
        return autores;
    }
}
