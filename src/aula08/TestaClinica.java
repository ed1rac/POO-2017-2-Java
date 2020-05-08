package aula08;

public class TestaClinica {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Keanu Reeves", "masculino");
		System.out.println(pessoa.nome + "\n" + "Sexo: " + pessoa.sexo);
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Jon Snow";
		funcionario.matricula = "123";
		funcionario.dataAdmissao = "12/11/4567";
		funcionario.salario = 890.0;
		funcionario.sexo = "Masculino";
		System.out.println(funcionario.calculaBonificacao());
		
		funcionario.exibirNome();		
		System.out.println(funcionario.dataAdmissao);
		
		Medico medico = new Medico();
		medico.nome = "Dr. Gregory House";
		medico.salario = 8000.0;
		medico.sexo = "Masculino";
		medico.matricula = "007";
		medico.dataAdmissao = "01/09/2009";
		medico.CRM = 123;
		
		medico.exibeInfo();
		
		

	}

}
