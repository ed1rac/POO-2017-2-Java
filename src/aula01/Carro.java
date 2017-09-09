package aula01;

class Carro {

	String cor;
	String motor;
	int anoDeFabricacao;
	String modelo;
	int quantMarchas;
	boolean tracao;
	int aroRodas;
	String tipoCarro;
	
	void ligar(){
		System.out.println("O carro " + modelo + " ligou!");
	}
	
	void acelerar(int velocidade){
		System.out.println("O carro " + modelo + " está acelerando!");
		for(int i=0;i<=velocidade;i+=5){
			System.out.print("Velocímetro: " + i + "\t" );
			if(i%10==0){
				System.out.println("\n");
			}
		}		
	}
	
	void acelerar(){
		System.out.println("O carro está acelerando!");
	}
	
	void frear(){
		System.out.println("Freando o carro!");
	}
	
	void desligar(){
		System.out.println("O carro " + modelo + " desligou!");
	}
	
	void exibeInformacoes(){
		System.out.println("======= INFORMACOES DO CARRO =======");
		System.out.println("Modelo ..........:" + modelo);
		System.out.println("Tipo.............:" + tipoCarro);
		System.out.println("Ano..............:" + anoDeFabricacao);
		System.out.println("Cor..............:" + cor);
		System.out.println("Quant. marchas...:" + quantMarchas);	
		System.out.println("Motor............:" + motor);
		System.out.println("Rodas de aro.....:" + aroRodas);
		if(tracao==true){
			System.out.println("Carro traçado!");
		}else{
			System.out.println("Carro não traçado!");
		}
		System.out.println("====================================");
	}

}























