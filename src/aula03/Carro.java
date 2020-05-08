package aula03;

class Carro {

	String cor;
	String motor;
	int anoDeFabricacao;
	String modelo;
	int quantMarchas;
	boolean tracao;
	int aroRodas;
	String tipoCarro;
	private static int quantPneus=4;
	
	Carro(){
		this.tracao = true;
	}
	
	Carro(String modelo, boolean t, int ano){
		this.modelo = modelo;
		this.tracao = t;
		this.anoDeFabricacao = ano;		
	}
	
	Carro(String modelo, String cor, String motor, int ano, int quant, boolean t, int aro, String tipo){
		this.modelo = modelo;
		this.tracao = t;
		this.anoDeFabricacao = ano;
		this.cor = cor;
		this.motor = motor;
		this.quantMarchas = quant;
		this.aroRodas = aro;
		this.tipoCarro = tipo;
	}
	
	Carro(String modelo){
		this.modelo = modelo;
	}
	

	void ligar(){
		System.out.println("O carro " + modelo + " ligou!");
	}
	
	void acelerar(int velocidade){
		System.out.println("O carro " + modelo + " est� acelerando!");
		for(int i=0;i<=velocidade;i+=5){
			System.out.print("Veloc�metro: " + i + "\t" );
			if(i%10==0){
				System.out.println("\n");
			}
		}		
	}
	
	void acelerar(){
		System.out.println("O carro est� acelerando!");
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
			System.out.println("Carro tra�ado!");
		}else{
			System.out.println("Carro n�o tra�ado!");
		}
		System.out.println("====================================");
	}

	public static int getQuantPneus() {
		return quantPneus;
	}

	public static void setQuantPneus(int quantPneus) {
		Carro.quantPneus = quantPneus;
	}

}























