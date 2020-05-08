package testes;

public class Lampada {
	boolean estadoDaLampada;
	
	void acende(){
		estadoDaLampada = true;
	}
	
	void apaga(){
		estadoDaLampada = false;		
	}
	
	void mostraEstado(){
		if(estadoDaLampada==true){
			System.out.println("A lâmpada está acesa!");
		}else{
			System.out.println("A lâmpada está apagada!");
		}
	}

}
