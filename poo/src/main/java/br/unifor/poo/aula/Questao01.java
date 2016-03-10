package br.unifor.poo.aula;

import java.util.Scanner;

public class Questao01 {

	double x1, x2, x3, y1, y2, y3;
	double lado1, lado2, lado3;

	public Double calculaPerimetro(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		calculaDistancias();

		if (ehTriangulo()) {
			return lado1 + lado2 + lado3;
		} else {
			return null;
		}
	}

	private boolean ehTriangulo() {
		return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
	}

	private void calculaDistancias() {
		// 2 - calcular distancias
		lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		lado3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
	}

	public static void main(String[] args) {
		Questao01 q1 = new Questao01();
		// 1 - Receber entrada do usuario
		Scanner scan = new Scanner(System.in);
		System.out.print("Informa a coordenada x1: ");
		double x1 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa a coordenada y1: ");
		double y1 = scan.nextDouble();
		System.out.println();

		System.out.print("Informa a coordenada x2: ");
		double x2 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa a coordenada y2: ");
		double y2 = scan.nextDouble();
		System.out.println();

		System.out.print("Informa a coordenada x3: ");
		double x3 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa a coordenada y3: ");
		double y3 = scan.nextDouble();
		System.out.println();
		Double resultado = q1.calculaPerimetro(x1, y1, x2, y2, x3, y3);
		if (resultado != null) {
			System.out.println("Perimetro é: " + resultado);
		} else {
			System.out.println("As coordenadas informadas não formam um triângulo.");
		}
	}
}
