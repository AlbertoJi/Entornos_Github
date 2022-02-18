package Entornos.FormasMal;

public class Triángulo {
    private double base;
    private double altura;
    private double área;

    public Triángulo() {

    }

    public Triángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // getters y setters
    public double getBase() {
        return this.base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // calcular área
    public double calcularArea() {
        this.área = this.base * this.altura / 2;
        return this.área;
    }

    @Override
    public String toString() {
        return "El área del triángulo es " + this.área;
    }
}
