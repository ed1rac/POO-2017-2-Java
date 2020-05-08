package aula09;

public class Cliente implements Autenticavel {
	
	
	private String nome;
	@SuppressWarnings("unused")
	private String endereco;
	
	Cliente(){
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
