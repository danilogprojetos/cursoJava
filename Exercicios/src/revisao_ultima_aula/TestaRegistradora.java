package revisao_ultima_aula;

public class TestaRegistradora {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Capit�o Caverna");
		
		Gerente g = new Gerente();
		g.setNome("Batima");
	
		Secretaria fp = new Secretaria();
		fp.setNome("Super�mi");
		
		RegistradoraHorarios r = new RegistradoraHorarios();
		
		r.registra(f);
		
		r.registra(fp);
		
	}

}
