package excemplo14.exception;

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
//Metodo sem nenhum retorno  //Lança uma Exceção 
	void saca(double valor) throws SaldoInsuficienteExcepiton{
		if ( valor <= saldo){
			saldo -= valor;
	}else{
	throw new SaldoInsuficienteExcepiton(saldo);
		}
	}

	void imprimir(){
		System.out.println("No." + numero +"saldo:" + saldo);
	}
}
