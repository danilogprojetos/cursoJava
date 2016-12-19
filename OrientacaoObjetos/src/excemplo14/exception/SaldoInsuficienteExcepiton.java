package excemplo14.exception;

public class SaldoInsuficienteExcepiton extends Exception{
	
	private double saldo;
	
	public SaldoInsuficienteExcepiton(double saldo){
		this.saldo = saldo;
	}
	
	public String getMessage(){
		return "Saldo Incsuficiente" + saldo;
	}
	
	
}
