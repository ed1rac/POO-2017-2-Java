package aula09;

public class TestaAutenticavel {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		Autenticavel cliente = new Cliente();
		
		boolean deuCerto = diretor.autentica(123);
		boolean deuCerto2 = cliente.autentica(321);
		
		if(deuCerto) {
			System.out.println("O diretor logou");
		}else{
			System.out.println("O diretor não logou");
		}
		
		if(deuCerto2) {
			System.out.println("O cliente logou");
		}else{
			System.out.println("O cliente não logou");
		}

	}

}
