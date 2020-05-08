package aula04;

public class CalculaRaizQuadrada {
	
	
	public static double raiz2(int x){
		return Math.sqrt(x);
	}

	public static void main(String[] args) {
		
		System.out.println("Programa que calcula a raiz quadrada de 2");
		//double raizde2 = Math.sqrt(2);
		System.out.println("A raiz quadrada de 2 é: " + CalculaRaizQuadrada.raiz2(2) );
		System.out.println("O valor de PI é: " + Math.PI);
		System.out.println(Math.pow(2, 10));
		for(int i=1;i<=20;i++){
			System.out.println("2 ^ " + i + " = " + Math.pow(2, i));
		}
		

	}

}
