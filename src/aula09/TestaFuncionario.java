package aula09;

public class TestaFuncionario {

	public static void main(String[] args) {
		Desenvolvedor ozeas = new Desenvolvedor();
		ozeas.setSalario(1000.0);
		
		System.out.println(ozeas.getBonus());
		
		Gerente rodrigo = new Gerente();
		rodrigo.setSalario(2000.0);
		rodrigo.cobraEntrega();
		
		System.out.println(rodrigo.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(ozeas);
		totalizador.adiciona(rodrigo);
		
		System.out.println(totalizador.getTotal());
		
	

	}

}
