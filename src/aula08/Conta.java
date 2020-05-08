package aula08;

public class Conta {
	private int numero;
	public double saldo;
	public double limite;
	Cliente titular;
	
	
	public Conta(Cliente titular, int numero, double saldo, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
	}
	
	public Conta(){
		
	}

	boolean saca(double valor){
		if(valor<(this.saldo+limite)){
			System.out.println("");
			this.saldo-=valor;
			System.out.println("Saque de " + valor + " realizado com sucesso");
			System.out.println("");
			return true;
		}
		System.out.println("Nao pode sacar " + valor);
		System.out.println("Saldo Insuficiente!");
		this.exibeSaldo();
		return false;
	}
	
	void deposita(double valor){
		this.saldo+=valor;
	}
	
	void exibeSaldo(){
		System.out.println("Conta nº : " + this.numero);
		System.out.println("==========================");
		System.out.println("Saldo atual.........:" + this.saldo);
		System.out.println("Limite..............:" + this.limite);
		System.out.println("==========================");
		double limiteTotal = this.saldo + this.limite;
		System.out.println("Saldo com o limite..:" + limiteTotal);
	}
	
	void exibeInfo(){
		System.out.println("");
		System.out.println("Titular: ");
		this.titular.exibeInfo();
		this.exibeSaldo();
		System.out.println("");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
