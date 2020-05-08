package testes;

public class Data {
	int dia, mes, ano;

	Data(int dia, int mes, int ano) {
		if (dataEValida(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}
	}

	boolean dataEValida(Data d) {
		if ((d.dia >= 1) || (d.dia <= 31) || (d.mes >= 1) || (d.mes <= 12))
			return true;
		else
			return false;
	}

	boolean dataEValida(int umDia, int umMes, int umAno) {
		if ((dia >= 1) || (dia <= 31) || (mes >= 1) || (mes <= 12))
			return true;
		else
			return false;
	}

	void mostraData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);

	}

}
