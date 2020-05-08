package aula09;

public class Gerente extends Funcionario implements Autenticavel {
	
	private static final int senhaGuardada = 321;

	public double getBonus(){
		return this.salario * 0.3;
	}
	
	public void cobraEntrega(){
		System.out.println("Está pronto?");
	}
	
	public boolean autentica(int senha){
		if(senha == senhaGuardada){
			return true;
		}
		else return false;
	}

}
