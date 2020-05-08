package aula08;

public class Paciente extends Pessoa {

	protected String dataInternacao;
	
	public Paciente(String nome, String sexo) {
		super(nome, sexo);
		
	}
	
	Paciente(String nome, String sexo, String data){
		super(nome, sexo);
		this.dataInternacao = data;
	}
	
	void exibeInfo(){
		super.exibeInfo();
		System.out.println("Data da Internação: " + this.dataInternacao);
	}

}
