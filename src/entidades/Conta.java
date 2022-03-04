package entidades;

//Essa � uma classe abstrata porque n�o faz sentido a classe Conta ser instanciada, somente as classes ContaCorrente e ContaPoupanca
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	//� obrigat�rio implementar os m�todos da interface IConta
	@Override
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		}
		else if(valor > saldo) {
			System.out.println("Voc� n�o tem saldo suficiente para essa opera��o");
		}
		else {
			this.saldo -= valor;
			System.out.printf("\nOpera��o realizada com sucesso...");
			System.out.printf("\nSeu novo saldo � R$%.2f",saldo);
		}
	}

	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		}else {
			this.saldo += valor ;
			
			System.out.printf("\nOpera��o realizada com sucesso...");
			System.out.printf("\nSeu novo saldo � R$%.2f",saldo);
		}
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("\nTitular: %s", this.cliente.getNome()));
		System.out.println(String.format("Ag�ncia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
	//Getters e Setters
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	

}
