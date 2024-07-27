
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Adriano");

		Cliente cliente = new Cliente("Adriano");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		banco.adicionaConta(cc);
		banco.adicionaConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		banco.imprimirContas();
	}

}
