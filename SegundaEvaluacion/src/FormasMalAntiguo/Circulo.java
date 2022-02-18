package FormasMalAntiguo;

public class Circulo {
    private double radio;
    private punto centro;

    public Circulo(double radio, punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo() {
        this.radio = 3.1;
        this.centro = new punto();
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new punto(x, y);
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setCentro(punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public punto getCentro() {
        return centro;
    }

    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    public double calcularLongitud() {
        return 2 * Math.PI * this.radio;
    }

    public double calcularDistanciaDesde(punto punto) {
        return this.centro.calcularDistanciaDesde(punto);
    }

}
