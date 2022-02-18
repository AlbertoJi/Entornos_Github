package FORMAS_MAL;

/* 2	Crea una clase denominada Circulo que*/
public class Círculo {
    /* Tenga dos atributos private,
    uno de tipo double denominado radio,
    y otro de tipo formas.Punto denominado centro */
    private double radio;
    private Punto centro;

    /* Define un constructor con dos parámetros de tipo formas.Punto
    y double que inicialice los dos atributos. */
    public Círculo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    /*	Define un constructor por defecto sin parámetros,
    que inicialice el atributo radio=3.1,
    y centro como una referencia de formas.Punto(). */
    public Círculo() {
        this.radio = 3.1;
        this.centro = new Punto();
    }

    /* Define un constructor con tres parámetros de tipo double,
    los dos primeros crean una referencia a centro que apunta al constructor formas.Punto,
    al que le paso los dos parámetros.
    El parámetro tercero inicializa el radio.*/
    public Círculo(double x, double y, double radio) {
        this.centro = new Punto(x, y);
        this.radio = radio;
    }

    //	•	Define getters y setters para cada uno de los atributos.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    /*	Crea un método calculaArea,
        que no recibe ningún parámetro,
        y devuelve un double (PI * radio*radio). */
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    /* •	Crea un método calculaLongitud,
    que no recibe ningún parámetro, y devuelve un double (2*Pi*radio). */
    public double calcularLongitud() {
        return 2 * Math.PI * this.radio;
    }

    /* Crea un método calcularDistanciaDesde
    que recibe un parámetro de tipo formas.Punto
    y que devuelve un double.
    (la distancia desde el centro del círculo hasta el punto que se le pasa) */
    public double calcularDistanciaDesde(Punto punto) {
        return this.centro.calcularDistanciaDesde(punto);
    }


}
