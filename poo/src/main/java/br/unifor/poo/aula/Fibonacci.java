package br.unifor.poo.aula;

public class Fibonacci {

	public Integer fibonacci(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else if (n > 1) {
			int ant = 1;
			int aant = 1;
			int valor = 0;
			for (int i = 0; i < n; i++) {
				valor = ant + aant;
				aant = ant;
				ant = valor;
			}
			return valor;
		} else {
			System.out.println("validor inválido");
			return null;
		}
	}
	
	public int fiboR(int n){
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fiboR(n-1) + fiboR(n - 2);
		}
	}
	

}
