package aula04;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ozeas", "Sistemas de Informa��o", 1065);
	//	Aluno aluno2 = new Aluno("Rodrigo Cuevas", "Est�tica e Cosm�tica", 1065);
		
		aluno.exibeInformacoes();
		aluno.calculaReajusteMensalidade(12);
		Funcoes.pula();
		aluno.exibeInformacoes();
		Funcoes.pula(5);
		Funcoes.print("Como � legal programar!");
		
	/*	aluno2.exibeInformacoes();
		aluno2.calculaReajusteMensalidade();
		aluno2.exibeInformacoes();
*/
	}

}
