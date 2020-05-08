package aula06;

public class Funcoes {
	/*
	 * Criar dois métodos estáticos um para exibir uma string na tela
	 * chamado 'print'. E outro para pular uma linha chamado pula
	 * 
	 * e, em seguida, testar esses métodos na classe TestaAluno
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
