package aula06;

public class Funcoes {
	/*
	 * Criar dois m�todos est�ticos um para exibir uma string na tela
	 * chamado 'print'. E outro para pular uma linha chamado pula
	 * 
	 * e, em seguida, testar esses m�todos na classe TestaAluno
	 * 
	 */
	
	static void print(String mensagem){
		System.out.println(mensagem);
		
	}
	static void pula(){
		System.out.println();
	}
	
	static void pula(int x){
		for(int i =0;i<=x;i++){
			//System.out.println();
			pula();
		}
	}
	
	

}
