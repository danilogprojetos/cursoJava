package exemplo6.heranca;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente();
		c.saldo =0;
		c.numero =1234;
		
		c.deposita(100);
		c.imprimir();
		c.saca(50);
		c.imprimir();
		
		ContaCorrenteComLimite cl = new ContaCorrenteComLimite ();
		cl.numero = 6789;
		cl.saldo =0;
		cl.limite = 100;
		
		System.out.println("Conta com Limite:");
		cl.imprimir();
		boolean sacou = cl.saca(50);
		cl.imprimir();
	
	}

}
