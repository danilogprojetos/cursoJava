package exemplo6.heranca;

public class ContaCorrenteComLimite extends ContaCorrente {

	double limite;
	
	boolean sava(double valor){
		if (valor <= (saldo + limite)){
			saldo -= valor;
			limite -= valor;
			return true;
		}
		return false;
	}
	
}
