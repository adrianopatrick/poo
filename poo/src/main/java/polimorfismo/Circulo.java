package polimorfismo;

public class Circulo extends Figura{

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		System.out.println("Area do circulo.");
		return  2 * Math.PI * raio;
	}

}
