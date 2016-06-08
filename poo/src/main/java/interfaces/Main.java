package interfaces;

import java.util.ArrayList;
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
		
		Collections.sort(lista, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
//		lista.stream().map().anyMatch((banco) -> banco.getNome().startsWith("B"));
		lista.forEach((banco) -> {System.out.println(banco.getNome());});
		
	}

}
