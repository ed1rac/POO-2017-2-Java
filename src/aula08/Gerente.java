package aula08;

public class Gerente extends Funcionario {
	
	int CRA;
	
	void liberarPagamento(){
		System.out.println("Pagamento liberado!");
	}
	
	public double calculaBonificacao(){
		return super.calculaBonificacao() + 1000.0;
	}

	public Gerente(String nome, String sexo, String data, String mat,
			double salario, int cra) {
		super(nome, sexo, data, mat, salario);
		this.CRA = cra;
		// TODO Auto-generated constructor stub
		
	}

	//falta invocar o construtor da superclasse
	
	
	
}
