package aula08;

public class Pessoa {
	
	protected String nome;
	protected String sexo;
	
	void exibirNome(){
		System.out.println("Nome: " + this.nome);
	}
	
	void exibeInfo(){
		this.exibirNome();
		System.out.println("Sexo: " + this.sexo);
	}

	public Pessoa(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Pessoa(){
		
	}
	
	
}
