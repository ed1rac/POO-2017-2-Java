package aula09;

public class SecretariaAdministrativa extends Secretaria {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
