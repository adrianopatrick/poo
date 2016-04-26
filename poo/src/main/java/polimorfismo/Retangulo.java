package polimorfismo;

public class Retangulo extends Figura {

	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		System.out.println("Area do Retângulo");
		return largura * altura;
	}
	
	public double calcularPerimetro(){
		return largura * 2 + altura * 2;
	}

}
