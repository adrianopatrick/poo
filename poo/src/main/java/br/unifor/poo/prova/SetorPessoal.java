package br.unifor.poo.prova;

import java.util.Arrays;
import java.util.Comparator;

public class SetorPessoal {

	private Funcionario[] funcionarios;
	private Integer indice;
	private Double valorTotal = 0.0;
	private Funcionario maior = new Funcionario("inicio", 0.0);

	public SetorPessoal(Integer numeroFuncionarios) {
		funcionarios = new Funcionario[numeroFuncionarios];
		indice = 0;
	}

	// item a
	public void add(Funcionario funcionario) {
		funcionarios[indice++] = funcionario;
		valorTotal += funcionario.getSalario();
		if(funcionario.getSalario() > maior.getSalario()){
			maior = funcionario;
		}
	}

	// item b
	public void imprimirFolhaPagamento() {
		System.out.println("****Folha de Pagamento****");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() 
				+ ", Salário:" + funcionario.getSalario());
		}
	}
	
	//item c
	public Double valorTotal(){
		Double total = 0.0;
		for (Funcionario funcionario : funcionarios) {
			total += funcionario.getSalario();
		}
		return total;
	}
	
	public Double getValorTotal(){
		return this.valorTotal;
	}
	
	//item d
	public String retornaNomeFuncionarioComMaiorSalario(){
		Funcionario maior = new Funcionario("inicio", 0.0);
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getSalario() > maior.getSalario()){
				maior = funcionario;
			}
		}
		return maior.getNome();
	}
	
	public String retornaNomeFuncionarioMaiorSalario(){
		return this.maior.getNome();
	}
	
	//item e
	public void buscarPorDepartamento(Integer departamento){
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getDepartamento().equals(departamento)){
				System.out.println("Nome: "+funcionario.getNome() 
					+ "Cargo: " + funcionario.getCargo());
			}
		}
	}
	
	//item f
	public void buscarPorDepartamento(String cargo){
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getCargo().equals(cargo)){
				System.out.println("Nome: "+funcionario.getNome());
			}
		}
	}
	
	//item g
	public void imprimirFolhaPagamentoOrdenada() {
		Arrays.sort(funcionarios, (obj1, obj2) 
				-> ((Funcionario)obj1).getSalario()
					.compareTo(((Funcionario)obj2).getSalario()));
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() 
			+ ", Salário:" + funcionario.getSalario());
		}
	}
}
