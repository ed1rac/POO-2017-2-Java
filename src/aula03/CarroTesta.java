package aula03;
public class CarroTesta {

	public static void main(String[] args) {

		Carro carro = new Carro("Palio", false, 2012);
		carro.exibeInformacoes();
		System.out.println(Carro.getQuantPneus());
		
		
		Carro carro2 = new Carro("Fiesta", "azul", "1.4", 2016, 4, false, 15, "Hatch");
		System.out.println(Carro.getQuantPneus());
		carro2.exibeInformacoes();
		carro2.ligar();
		carro2.acelerar(60);
		carro2.frear();
		carro2.desligar();
		
		
		Carro carro3 = new Carro("Ferrari");
		carro3.exibeInformacoes();
		

	}

}
