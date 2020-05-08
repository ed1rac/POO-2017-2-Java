package testes;

public class TestaLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.mostraEstado();
		lampada.acende();
		lampada.mostraEstado();
		lampada.apaga();
		lampada.mostraEstado();

	}

}
