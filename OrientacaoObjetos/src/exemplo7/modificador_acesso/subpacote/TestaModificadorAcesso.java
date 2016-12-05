package exemplo7.modificador_acesso.subpacote;

import exemplo7.modificador_acesso.ModificadoresAcesso;

public class TestaModificadorAcesso {

	void testaModificadores(){
		ModificadoresAcesso m = new ModificadoresAcesso();
		//Só consegue ser acessado no mesmo pacote
		//m.modificadorDefault = 0;
		m.modificadorPublic = 0;
		//Só consegue acessar se estiver no mesmo pacote
		//m.modificadorProtected = 0;
		//Só conseguimos acessar este modificador dentro da classe onde ele esta declarada
		//m.modificadorPrivate = 0;
	}
}


