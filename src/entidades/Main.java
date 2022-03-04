package entidades;

public class Main {

	public static void main(String[] args) {
		Cliente wesley = new Cliente();
		Cliente joao = new Cliente();
		
		
		joao.setNome("João");
		wesley.setNome("Wesley");
		
		Conta cc = new ContaCorrente(wesley);		
		Conta poupanca = new ContaPoupanca(wesley);
		ContaEstudantil c5 = new ContaEstudantil( joao, 2000);
		
		c5.depositar(100);
		c5.emprestimo(5000);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		c5.imprimirExtrato();
	}

}
