package aula02;
public class CarroTesta {

	public static void main(String[] args) {

		Carro carro1 = new Carro();  //instanciar a classe carro
		
		carro1.modelo = "Palio";
		carro1.tipoCarro = "Hatch";
		carro1.anoDeFabricacao = 2015;
		carro1.cor = "Prata";
		carro1.aroRodas = 15;
		carro1.motor = "1.4";
		carro1.quantMarchas = 4;
		carro1.tracao = false;
		
		carro1.ligar();
		carro1.acelerar();
		carro1.exibeInformacoes();
		
		
		Carro carro2 = new Carro();
		Carro carro = new Carro();
		Carro carro3 = new Carro();
		
		carro.modelo = "Gol";
		carro.tipoCarro = "Hatch";
		carro.anoDeFabricacao = 2016;
		
		carro3.modelo = "Jeep Renegade";
		carro3.tipoCarro = "SUV";
		carro3.anoDeFabricacao = 2017;
		
		carro2.anoDeFabricacao = 2015;
		carro2.modelo = "Hilux";
		carro2.tipoCarro = "Caminhonete";

		carro1.frear();
		carro1.desligar();

	}

}
