import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public void imprimirContas() {
		System.out.println("=======================");
		System.out.println("# BANCO #");
		System.out.println("=======================\n");
		for (Conta conta: contas) {
			conta.imprimirExtrato();
			System.out.println("=======================\n");
		}
	}

	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
