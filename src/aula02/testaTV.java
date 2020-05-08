package aula02;

public class testaTV {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.volume = 10;
		tv.ligar();
		tv.trocarCanal(4);
		tv.mostraInfo();
		tv.aumentarVolume(20);
		tv.mostraInfo();
		tv.diminuirVolume();
		tv.mostraInfo();

	}

}
