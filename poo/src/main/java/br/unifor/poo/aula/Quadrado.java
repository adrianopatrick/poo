package br.unifor.poo.aula;

public class Quadrado extends Retangulo {
	
	private Integer lado;

	public Quadrado(Integer lado) {
		super(lado, lado);
		this.lado = lado;
	}
	
	@Override
	public Integer calcularArea() {
		return (int) Math.pow(lado, 2);
	}
	
	public Retangulo getInstance() {
		return new Quadrado(lado);
	}	
	
	
	
}
