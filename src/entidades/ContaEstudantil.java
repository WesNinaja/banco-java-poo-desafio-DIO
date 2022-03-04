package entidades;

public class ContaEstudantil extends Conta {
	
	private double disponivelEmprestimoEstudantil = 5000 ;

	public ContaEstudantil(Cliente cliente, double disponivelEmprestimoEstudantil) {
		super(cliente);
		this.disponivelEmprestimoEstudantil = disponivelEmprestimoEstudantil;
	}

	
	
	//encapsulamento
	public double getDisponivelEmprestimoEstudantil() {
		return disponivelEmprestimoEstudantil;
	}

	public void setDisponivelEmprestimoEstudantil(double disponivelEmprestimoEstudantil) {
		this.disponivelEmprestimoEstudantil = disponivelEmprestimoEstudantil;
	}
	
	//metodos
	
	public void emprestimo(double valorEmprestimo2) {
		if(disponivelEmprestimoEstudantil >= valorEmprestimo2) {
			  
			depositar(valorEmprestimo2);
			
			setDisponivelEmprestimoEstudantil( disponivelEmprestimoEstudantil) ;
			
			setDisponivelEmprestimoEstudantil(getDisponivelEmprestimoEstudantil()-valorEmprestimo2);
		}else {
			System.out.println("\nVocê não tem limite de empréstimo para isso");
		}
	}

	
	@Override
	public void imprimirExtrato() {
		System.out.println("\n----------------------------------");
		System.out.println("--------------Extrato Conta Estudantil-------------");
		System.out.println("\n----------------------------------");
		super.imprimirInfosComuns();
	}


}