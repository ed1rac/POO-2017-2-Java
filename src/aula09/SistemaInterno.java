package aula09;

public class SistemaInterno {
	
	void login(Autenticavel a){
		
		int senha = 123;//pega a senha do banco
		@SuppressWarnings("unused")
		boolean ok = a.autentica(senha);
		
		//aqui eu posso chamar o autentica
		//não necessariamente é um funcionário
		//
	
		
	}
	
	
}
