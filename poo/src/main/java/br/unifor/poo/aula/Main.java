package br.unifor.poo.aula;

import br.unifor.poo.aula.banco.Banco;

public class Main {
	public static void main(String[] args) {
		Banco b = new Banco();
		b.setNome("Caixa Econômica");
		
		Banco a = b;
		a.setNome("Banco do Brasil");
		
		System.out.println("Este banco é: "+ b.getNome());
		System.out.println("Este banco é: "+ a.getNome());
	}

}
