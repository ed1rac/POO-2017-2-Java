package aula02;

public class Lampada {
	//atributos
	String modelo;
	boolean estadoDaLampada;
	
	//m�todos --> funcionalidades. o que eu posso fazer com o objeto o que ele pode fazer.
	void acender(){
		estadoDaLampada = true;		
	}
	
	void apagar(){
		estadoDaLampada = false;		
	}
	
	void mostraEstado(){
		if(estadoDaLampada==true){
			System.out.println("A l�mpada " + modelo + " est� acesa!");
		}else{
			System.out.println("A l�mpada " + modelo + " est� apagada");
			//JOptionPane.showMessageDialog(null, "A l�mpada est� apagada");
		}		
	}
}
