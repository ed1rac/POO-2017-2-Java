package estruturasDados;

import javax.swing.JOptionPane;

public class Lista {
	Celula primeira, ultima;
	int totalCelulas;
	
	//construtor
	public Lista(){
		primeira = ultima = null;
		totalCelulas=0;
	}
	
	public int getTotalCelulas(){
		return totalCelulas;
	}
	
	public boolean ListaVazia(){
        if (getTotalCelulas() == 0){
            return true;
       }
       return false;
    }
	
	public void insereNoInicio(Celula c){
		if(ListaVazia()){
			primeira = ultima = c;
		}else{
			c.prox = primeira;
			primeira = c;
		}
		totalCelulas++;
	}
	
	public void insereNoFim(Celula c){
		//caso nao tenham celulas
		if(ListaVazia()){
			primeira = ultima = c;			
		}else{
			ultima.prox = c;
			ultima = c;
		}
		totalCelulas++;
	}
	
	public void excluirCelula(Celula c){
		Celula celulaAtual, celulaAnterior;
		celulaAtual = celulaAnterior = primeira;
		int contador = 1;
		
		if(ListaVazia()==false){
			while(contador<=getTotalCelulas() && celulaAtual.valor != c.valor){
				celulaAnterior = celulaAtual;
				celulaAtual = celulaAtual.prox;
				contador++;
			}
			
			 if(celulaAtual.valor == c.valor){
		            if ( getTotalCelulas() == 1){
		                primeira = ultima = null;
		           }
		           else{
		               if (celulaAtual == primeira){
		                   primeira = celulaAtual.prox;
		               }
		               else{
		                   celulaAnterior.prox = celulaAtual.prox;
		               }
		           }
		           totalCelulas--;
		        }
		    }
			
		}
	
	public void exibirLista(){
	    Celula temp = primeira;
	    String valores = "";
	    int contador = 1;
	    if (ListaVazia() == false ){
	        while (contador <= getTotalCelulas()){
	            valores += Integer.toString(temp.valor)+"-";
	            temp = temp.prox;
	            contador++;
	        }
	    }
	    JOptionPane.showMessageDialog(null, valores);
	 }
	
}
