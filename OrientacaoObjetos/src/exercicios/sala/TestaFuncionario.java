package exercicios.sala;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionarios a = new Funcionarios();
		a.nome = "Antonio";
		a.cpf = "09805631940";
		a.salario = 1289.45;
	
		
		Gerente b = new Gerente();
		b.nome ="Marcos";
		b.cpf = "0102102120";
		b.salario = 250000;
		
				
		/*não funciona porque não entra na regra é um, pois todo funcionario não é um gerente
		Gerente g2 = new Funcionarios();*/
		/*Este ja é aceitavel porque todos os gerentes são funcionarios
		 * Funcionario a2 = new Gerente;
		 */
		
	}

			
}
