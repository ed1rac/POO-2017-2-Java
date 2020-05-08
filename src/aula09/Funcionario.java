package aula09;

public abstract class Funcionario {
	
	private String nome;
	protected double salario; //a classe Funcionario e todas as suas filhas podem acessar esse atributo privado
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public abstract double getBonus(); //método abstrato PRECISA ser escrito por todas as classes filhas
	
	public String getNome(){
		return nome;
	}

}
