package br.unifor.poo.aula;

public class Retangulo extends Figura{

	private Integer base;
	private Integer altura;
	
	public Retangulo(Integer base, Integer altura) {
		this.base = base;
		this.altura = altura;
	}

	public Integer calcularArea(){
		return base * altura;
	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		
	}
	
}
