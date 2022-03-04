package entidades;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n----------------------------------");
		System.out.println("--------------Extrato Conta Poupança-------------");
		System.out.println("\n----------------------------------");
		super.imprimirInfosComuns();
	}
}
