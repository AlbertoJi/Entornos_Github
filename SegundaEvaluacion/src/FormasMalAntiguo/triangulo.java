package FormasMalAntiguo;

/**
 *
 */
public class triangulo {
    private double base;
    private double altura;
    private double area;

    /**
     * @param base
     * @param altura
     */
    public triangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     */
    public triangulo() {

    }

    /**
     * @param base
     */
    public void set_base(double base) {
        this.base = base;
    }

    /**
     * @param altura
     */
    public void set_altura(double altura) {
        this.altura = altura;
    }

    // calcular área
    public void calcular_area() {
        this.area = this.base * this.altura / 2;
    }

    @Override
    public String toString() {
        return "El área del triángulo es " + this.area;
    }
}
