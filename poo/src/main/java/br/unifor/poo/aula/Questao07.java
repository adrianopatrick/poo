package br.unifor.poo.aula;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada
 * tentativa dele, forneça uma dica falando se o número é maior ou menor. Quando
 * ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas
 * ele conseguiu
 */
public class Questao07 {

	public static void main(String[] args) {
		boolean continua = true;
		while (continua) {
			int sorteado = sortearValor();
			int tentativas = 0;
			boolean ganhou = false;
			while (!ganhou) {
				int palpite = receberPalpite();
				continua = checarResultado(continua, sorteado, tentativas, palpite);
				tentativas++;
			}
		}
	}

	private static boolean checarResultado(boolean continua, int sorteado, int tentativas, int palpite) {
		boolean ganhou;
		if (palpite > sorteado) {
			JOptionPane.showMessageDialog(null, "O seu palpite é maior.");
		} else if (palpite < sorteado) {
			JOptionPane.showMessageDialog(null, "O seu palpite é menor.");
		} else {
			JOptionPane.showMessageDialog(null, "Parabéns vc ganhou! \n Tentativas: " + tentativas);
			continua = JOptionPane.showInputDialog(null, "Deseja continuar? (S-Sim, N-Não").equalsIgnoreCase("S");
			ganhou = true;
		}
		return continua;
	}

	private static int receberPalpite() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Dê seu palpite:", "Jogo dos Palpites",
				JOptionPane.QUESTION_MESSAGE));
	}

	private static int sortearValor() {
		Random random = new Random();
		return 1 + random.nextInt(99);
	}
}
