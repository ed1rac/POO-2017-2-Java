package aula05;

public class Carro {

	public String cor;
	public String motor;
	public int anoDeFabricacao;
	private String modelo;
	private int quantMarchas;
	private boolean tracao;
	protected int aroRodas;
	protected String tipoCarro;
	
	public Carro(){
		this.tracao = true;
	}
	
	public Carro(String modelo, boolean t, int ano){
		this.modelo = modelo;
		this.tracao = t;
		this.anoDeFabricacao = ano;		
	}
	
	public Carro(String modelo, String cor, String motor, int ano, int quant, boolean t, int aro, String tipo){
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
	

	public void ligar(){
		System.out.println("O carro " + modelo + " ligou!");
	}
	
	public void acelerar(int velocidade){
		System.out.println("O carro " + modelo + " está acelerando!");
		for(int i=0;i<=velocidade;i+=5){
			System.out.print("Velocímetro: " + i + "\t" );
			if(i%10==0){
				System.out.println("\n");
			}
		}		
	}
	
	public void acelerar(){
		System.out.println("O carro está acelerando!");
	}
	
	public void frear(){
		System.out.println("Freando o carro!");
	}
	
	public void desligar(){
		System.out.println("O carro " + modelo + " desligou!");
	}
	
	public void exibeInformacoes(){
		System.out.println("======= INFORMACOES DO CARRO =======");
		System.out.println("Modelo ..........:" + this.modelo);
		System.out.println("Tipo.............:" + this.tipoCarro);
		System.out.println("Ano..............:" + this.anoDeFabricacao);
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
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String m){
		this.modelo = m;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public int getQuantMarchas() {
		return quantMarchas;
	}

	public void setQuantMarchas(int quantMarchas) {
		this.quantMarchas = quantMarchas;
	}

	public boolean isTracao() {
		return tracao;
	}

	public void setTracao(boolean tracao) {
		this.tracao = tracao;
	}

	public int getAroRodas() {
		return aroRodas;
	}

	public void setAroRodas(int aroRodas) {
		this.aroRodas = aroRodas;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	
	
	

}























