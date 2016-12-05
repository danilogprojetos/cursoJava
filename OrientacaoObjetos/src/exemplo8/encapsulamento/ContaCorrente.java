package exemplo8.encapsulamento;

public class ContaCorrente {
	
	private int numero;
	//Coloco Private em salto para ninguem poder ter o acessa ao atributo saldo
	private double saldo;
	
	public ContaCorrente(int numero){
		this.numero = numero;
		
	}

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
