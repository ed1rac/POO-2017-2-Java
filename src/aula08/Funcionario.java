package aula08;

public class Funcionario extends Pessoa {
	
	protected String dataAdmissao;
	 protected String matricula;
	 double salario;
	 
	 public double calculaBonificacao(){
		 return this.salario * 0.10;
	 }
	 
	 void exibeInfo(){
		 super.exibeInfo();
		 System.out.println("Data de Admissão: " + this.dataAdmissao);
		 System.out.println("Matricula: " + this.matricula);
		 System.out.println("Salário: " + this.salario);
	 }
	 
	 public Funcionario(String nome, String sexo, String data, String mat, double salario) {
			super(nome, sexo);
			this.salario = salario;
			this.dataAdmissao = data;
			this.matricula = mat;
			
		}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	 


}
