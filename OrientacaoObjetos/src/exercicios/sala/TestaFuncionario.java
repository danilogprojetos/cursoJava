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
		
				
		/*n�o funciona porque n�o entra na regra � um, pois todo funcionario n�o � um gerente
		Gerente g2 = new Funcionarios();*/
		/*Este ja � aceitavel porque todos os gerentes s�o funcionarios
		 * Funcionario a2 = new Gerente;
		 */
		
	}

			
}
