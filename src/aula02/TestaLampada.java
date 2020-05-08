package aula02;

public class TestaLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();		
		lampada.modelo = "Incandescente";
		
		lampada.mostraEstado();
		lampada.acender();
		lampada.mostraEstado();
		lampada.apagar();
		lampada.mostraEstado();
		
		Lampada lampada2 = new Lampada();
		lampada2.modelo = "Fluorescente";
		
		lampada2.mostraEstado();
		lampada2.acender();
		lampada2.mostraEstado();
		lampada2.apagar();
		lampada2.mostraEstado();
		
		System.out.println(lampada == lampada2);
		
		Lampada lampada3 = new Lampada();
		lampada3 = lampada2;
		System.out.println(lampada3.modelo);
		System.out.println(lampada2 == lampada3);
	}

}
