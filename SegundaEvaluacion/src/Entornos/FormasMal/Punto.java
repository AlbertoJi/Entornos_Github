package Entornos.FormasMal;

public class Punto {

	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	Punto(double x, double y) {
		
		this.x = x;
		this.y = x;
	}
	
	Punto() {
		this.x = 12;
		this.y = 3;
	}
	
	public double calcularDistanciaDesde (Punto prem) {
		
		double cateto1 = getX();
		double cateto2 = getY();
		
		return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	
	public static void main(String[] args) {
		Punto p1 = new Punto();
		System.out.println("Valor de p1.X es " + p1.getX() + " \nValor de p1.Y es " + p1.getY());
		
		Punto p2 = new Punto(2, 1);
		System.out.println(p1.calcularDistanciaDesde(p2));
	}
}