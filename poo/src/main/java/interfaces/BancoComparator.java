package interfaces;

import java.util.Comparator;

import br.unifor.poo.aula.banco.Banco;

public class BancoComparator implements Comparator<Banco>{

	@Override
	public int compare(Banco o1, Banco o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
