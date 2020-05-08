package aula09;

public class Diretor extends Funcionario implements Autenticavel {
	
	public void cobraEntrega(){
		System.out.println("Está pronto, cara?");
	}

	public double getBonus() {
		return this.salario * 0.1;
	}
	
	public boolean autentica(int senha){
		if(senha == 321){
			return true;
		}
		else 
			return false;
	}

}
