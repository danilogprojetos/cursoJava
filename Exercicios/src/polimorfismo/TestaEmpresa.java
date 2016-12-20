package polimorfismo;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa e = new Empresa ();
		
		Funcionario f = new Funcionario();
		f.setNome("Capit�o Caverna");
		
		Gerente g = new Gerente();
		g.setNome("Scooby");
		
		Funcionario a = new Funcionario();
		a.totalDeBonificacao(10);
		System.out.println("total de Bonifica��o" + a);
		
		e.contrata(f);
		e.contrata(g);
		
		e.imprime();
		
		e.demite(f);
		System.out.println("Depois da demiss�o");
		
		e.imprime();

	}

}
