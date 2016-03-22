package br.unifor.poo.construtores;

public class A {

	public A() {
		System.out.println("Estou em A, construtor padrao");
	}

	public A(Integer x) {
		this(x, null);
		System.out.println("Estou em A, construtor com int");
	}

	public A(Integer y, String z) {
		System.out.println("Estou em A, construtor com int, string");
	}
	
	public A(String z, Integer y){
		System.out.println("Estou em A, construtor com string, int");
	}
}
