package aula07;

public class Cliente {
	public String nome;
	public String sobrenome;
	public String cpf;
	public double renda;
	
	public void exibeNome(){
		System.out.println(this.nome + " " + this.sobrenome);
	}
	
	public String nomeCompleto(){
		return this.nome +" " +  this.sobrenome;
	}
	
	public Cliente(String nome, String sobrenome, String cpf, double renda) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.renda = renda;
	}

	Cliente(){
		
	}
	
	void exibeInfo(){
		System.out.println("Cliente.......:" + this.nomeCompleto());
		System.out.println("CPF...........:" + this.cpf);
		System.out.println("Renda.........:" + this.renda);
	}

}
