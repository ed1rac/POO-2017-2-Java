package aula06;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.numero = 123;
		
		Cliente cliente = new Cliente("Beatriz", "Monteiro", "1111111111", 5000.0);
		conta.titular = cliente;
		conta.saldo = 3500.0;
		conta.limite = 1000.0;
		conta.exibeInfo();

		

	}

}
