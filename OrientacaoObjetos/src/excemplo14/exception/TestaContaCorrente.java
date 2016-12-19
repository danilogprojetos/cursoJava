package excemplo14.exception;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente (1001);
		c.deposita(100);
		try {
			c.saca(50);
		} catch (Exception e) {
			 System.out.println(e.getLocalizedMessage());
		}
		
		c.imprimir();
		

	}

}
