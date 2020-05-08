package aula07;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	Pessoa(){
		
	}
	
	Pessoa(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	void exibeIMC(){
		double imc = this.peso/(this.altura*this.altura);
		System.out.print("Seu IMC, " + this.nome);
		System.out.printf(" é: %.2f \n", imc);
	}
	void exibeInfo(){
		System.out.println("=======================================");
		System.out.println("Nome....: " + nome);
		System.out.println("Idade...: " + idade);
		System.out.println("Altura..: " + altura);
		System.out.println("Peso....: " + peso);
		this.exibeIMC();
		System.out.println("Hashcode: " + this.hashCode());
		System.out.println("=======================================");
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pessoa){
			Pessoa p = (Pessoa) obj;
			return this.nome.equals(p.nome);
		}
		return false;
	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 10;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String mensagem="";
		mensagem+="=======================================\n";
		mensagem+="Nome....: " + this.nome + "\n";
		mensagem+="Idade...: " + idade + "\n";
		mensagem+="=======================================\n";
		
		return mensagem;
		//return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura="
				//+ altura + ", peso=" + peso + "]";
	}

	
	
	
	
	

}
