package aula09;

public class SecretariaAgencia extends Secretaria {

	@Override
	public double getBonus() {
		return this.salario * 0.02;
	}

}
