package br.unifor.poo.aula;

public class Fatorial {

	public int calcula(int n) {
		int resultado = 1;
		
		if(n > 1){
			for (int i = 1; i <= n; i++) {
				resultado *= i;
			}
		}
		
		return resultado;
	}
	
	public int calculaRecursivo(int n){
//		if(n == 0 || n == 1){
//			return 1;
//		} else {
//			return n * calculaRecursivo(n - 1);
//		}
		
		return (n == 0 || n == 1) ? 1 : n * calculaRecursivo(n - 1);
	}

}
