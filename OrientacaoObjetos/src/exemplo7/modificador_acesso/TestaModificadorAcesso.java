package exemplo7.modificador_acesso;

public class TestaModificadorAcesso {


	void testaModificadores(){
		ModificadoresAcesso m = new ModificadoresAcesso();
		m.modificadorDefault = 0;
		m.modificadorPublic = 0;
		m.modificadorProtected = 0;
		//S� conseguimos acessar este modificador dentro da classe onde ele esta declarada
		//m.modificadorPrivate = 0;
	}
}
