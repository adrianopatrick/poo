package interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.unifor.poo.aula.banco.Banco;

public class Main {

	public static void main(String[] args) {
		List<Banco> lista = new ArrayList<>();
		lista.add(new Banco("BB"));
		lista.add(new Banco("CEF"));
		lista.add(new Banco("Bradesco"));
		lista.add(new Banco("Santander"));
		lista.add(new Banco("ITAU"));

		// lista.forEach((banco) -> {
		// System.out.println(banco.getNome());
		// });
		//
		// Voadores patoAmericano = new Voadores() {
		// @Override
		// public void voar() {
		// System.out.println("voando....");
		// }
		// };
		// patoAmericano.voar();
		//
		// Voadores patoAfricano = () -> {
		// System.out.println("voando no calor...");
		// };
		// patoAfricano.voar();

		Collections.sort(lista, (b1, b2) -> {
			return b1.getNome().compareTo(b2.getNome());
		});

		lista.forEach((banco) -> {
			System.out.println(banco.getNome());
		});
	}

}
