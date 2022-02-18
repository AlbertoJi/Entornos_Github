package FormasMalAntiguo;


public class punto {

    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    punto(double x, double y) {

        this.x = x;
        this.y = x;
    }

    punto() {

        this.x = 12;
        this.y = 3;
    }

    public double calcularDistanciaDesde(punto prem) {

        double cateto1 = getX();
        double cateto2 = getY();

        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static void main(String[] args) {
        punto p1 = new punto();
        System.out.println("Valor de p1.X es " + p1.getX() + " \nValor de p1.Y es " + p1.getY());

        punto p2 = new punto(2, 1);
        System.out.println(p1.calcularDistanciaDesde(p2));
    }
}