package aula07;
public class CarroTesta {

	public static void main(String[] args) {

		Carro carro = new Carro("Palio", false, 2012);
		carro.exibeInformacoes();
		
		Carro carro2 = new Carro("Fiesta", "azul", "1.4", 2016, 4, false, 15, "Hatch");
	/*	carro2.exibeInformacoes();
		carro2.ligar();
		carro2.acelerar(60);
		carro2.frear();
		carro2.desligar();
	*/	
		Carro carro3 = new Carro("Ferrari");
		System.out.println(carro2.getModelo());
		carro2.cor = "preta";
		carro2.setModelo("Palio");
		carro2.exibeInformacoes();
		
		carro3.exibeInformacoes();
		

	}

}
