package aula02;

public class Lampada {
	//atributos
	String modelo;
	boolean estadoDaLampada;
	
	//métodos --> funcionalidades. o que eu posso fazer com o objeto o que ele pode fazer.
	void acender(){
		estadoDaLampada = true;		
	}
	
	void apagar(){
		estadoDaLampada = false;		
	}
	
	void mostraEstado(){
		if(estadoDaLampada==true){
			System.out.println("A lâmpada " + modelo + " está acesa!");
		}else{
			System.out.println("A lâmpada " + modelo + " está apagada");
			//JOptionPane.showMessageDialog(null, "A lâmpada está apagada");
		}		
	}
}
