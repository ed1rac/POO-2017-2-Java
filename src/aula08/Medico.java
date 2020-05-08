package aula08;

public class Medico extends Funcionario {
	int CRM;
	
	public void operar(){
		System.out.println("Médico " + this.nome + " está operando...");
	}
	
	public double calculaBonificacao(){   //reescrita de método e polimorfismo
		return this.salario * 0.2;
	}
	
	void exibeInfo(){
		super.exibeInfo();
		System.out.println("CRM: " + this.CRM);
		System.out.println("Bonus: " + this.calculaBonificacao());
	}

	public Medico(String nome, String sexo, String data, String mat, double salario, int crm) {
		super(nome, sexo, data, mat, salario);
		this.CRM = crm;
	}

	public Medico() {
		// TODO Auto-generated constructor stub
	}


}
