package polimorfismo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String escolha = JOptionPane
				.showInputDialog("Escolha uma das opções\n" + "1 - Retângulo\n" + "2 - Circulo\n" + "3 - Quadrado");
		Operacoes op = new Operacoes(escolha);
		op.imprimeArea();
	}
}
