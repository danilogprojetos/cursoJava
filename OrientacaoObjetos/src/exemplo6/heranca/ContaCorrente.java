package exemplo6.heranca;

public class ContaCorrente {
	
	int numero;
	double saldo;

	void deposita(double valor){
		saldo += valor;
			
	}

	boolean saca(double valor){
		if ( valor <= saldo){
			saldo -= valor;
			return true;
			}
	return false;
	}

	void imprimir(){
		System.out.println("No." + numero +"saldo:" + saldo);
	}
}
