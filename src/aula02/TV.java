package aula02;

public class TV {
	boolean ligada;
	int canal, volume;
	
	void ligar(){
		if (ligada==false){
			System.out.println("A TV foi ligada!");
			ligada = true;
		}else{
			System.out.println("A TV já está ligada!");
		}
	}
	void desligar(){
		if (ligada==true){
			System.out.println("A TV foi desligada!");
			ligada = false;
		}else{
			System.out.println("A TV já está desligada!");
		}
	}
	void aumentarVolume(){
		volume++;
	}
	void aumentarVolume(int valor){
		for(int i =1;i<=valor;i++)
			aumentarVolume();
	}
	void diminuirVolume(){
		volume--;
	}
	void trocarCanal(int c){
		canal = c;
	}
	
	void mostraInfo(){
		System.out.println("======================");
		System.out.print("ligada? "); 
		if (ligada==true){
			System.out.print("  Sim");
		}else{
			System.out.print("  Não");
		} System.out.println();
		System.out.println("Canal  ==> " + canal);
		System.out.println("Volume ==> " + volume);
		System.out.println("======================");
	}
	

}
