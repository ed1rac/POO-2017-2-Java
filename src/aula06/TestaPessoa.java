package aula06;

import javax.swing.JOptionPane;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Eliel Pinho", 33, 1.645, 69);
		Pessoa pessoa2 = new Pessoa("Ozeas Nobre", 18, 1.65, 60);
				
		pessoa.exibeInfo();	    
		Funcoes.pula(2);
		pessoa2.exibeInfo();
		
		System.out.println(pessoa);
		System.out.printf("%s", pessoa2);
		JOptionPane.showMessageDialog(null,pessoa);
		
	/*	if(pessoa.equals(pessoa2)){
			System.out.println("Os objetos são iguais");
		}else{
			System.out.println("Os objetos são diferentes");
		}
		
	*/	
		

	}

}
