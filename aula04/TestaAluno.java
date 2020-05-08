package aula04;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ozeas", "Sistemas de Informação", 1065);
	//	Aluno aluno2 = new Aluno("Rodrigo Cuevas", "Estética e Cosmética", 1065);
		
		aluno.exibeInformacoes();
		aluno.calculaReajusteMensalidade(12);
		Funcoes.pula();
		aluno.exibeInformacoes();
		Funcoes.pula(5);
		Funcoes.print("Como é legal programar!");
		
	/*	aluno2.exibeInformacoes();
		aluno2.calculaReajusteMensalidade();
		aluno2.exibeInformacoes();
*/
	}

}
