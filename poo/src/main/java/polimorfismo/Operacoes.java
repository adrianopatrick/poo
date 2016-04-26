package polimorfismo;

public class Operacoes {

	private Figura fig;
	
	public Operacoes(String escolha) {
		switch (escolha) {
		case "1":
			fig = new Retangulo(5.2, 3.2);
			break;
		case "2":
			fig = new Circulo(5.2);
			break;
		case "3":
			fig = new Quadrado(10.1);
		}
	}
	
	public void imprimeArea(){
		System.out.println(fig.calcularArea());
	}
}
