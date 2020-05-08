package aula08;

public class TestaConta {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Alan", "Maia", "55555555", 7890.0);
		Conta c1 = new Conta(cliente1, 123, 4567.32, 1000.0);			
						
		c1.exibeInfo();

	}

}
