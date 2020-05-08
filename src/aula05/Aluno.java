package aula05;

public class Aluno {
	String nome;
	String rg;
	String curso;
	double mensalidade;
	String telefone;
	
	
	public Aluno(String nome, String rg, String curso, double mensalidade, String telefone) {
		this.nome = nome;
		this.rg = rg;
		this.curso = curso;
		this.mensalidade = mensalidade;
		this.telefone = telefone;
	}

	Aluno(String n, String c, double m){
		this.nome = n;
		this.curso = c;
		this.mensalidade = m;		
	}

	
	void exibeInformacoes(){
		System.out.println("Informações de um aluno");
		System.out.println("====================================");
		System.out.println("Nome..........:" + this.nome);
		System.out.println("RG............:" + this.rg);
		System.out.println("Curso.........:" + this.curso);
		System.out.println("Mensalidade...:" + this.mensalidade);
		System.out.println("Telefone......:" + this.telefone);
		System.out.println("====================================");
		
	}
	
	void calculaReajusteMensalidade(double porcentagem){
		double decimal = porcentagem/100;
		mensalidade = (mensalidade*decimal)+mensalidade;		
	}
	
	void calculaReajusteMensalidade(){
		this.mensalidade*=1.1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
