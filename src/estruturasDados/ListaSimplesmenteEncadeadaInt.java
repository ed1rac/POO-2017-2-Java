package estruturasDados;

public class ListaSimplesmenteEncadeadaInt {

	public static void main(String[] args) {
		Lista l = new Lista();

		 l.insereNoFim(new Celula(2));
		 l.insereNoFim(new Celula(12));
		 l.insereNoInicio(new Celula(22));
		 l.insereNoFim(new Celula(32));
		 l.insereNoFim(new Celula(2));

		 l.exibirLista();

		 l.excluirCelula(new Celula(12));
		 l.exibirLista();

	}

}
