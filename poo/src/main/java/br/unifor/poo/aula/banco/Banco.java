package br.unifor.poo.aula.banco;

public class Banco {
	
	private String nome;
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	//métodos acessores
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
