package exemplo5.metodos;

public class Aluno {

	String nome;
	int bim1;
	int bim2;
	int bim3;
	int bim4;
	int media;
	
	public int media(){
		int soma = bim1 + bim2 + bim3 + bim4;
		int media = soma /4;
		return media; 
	}
	
	public boolean foiAprovado(){
			return media() >= 6;
		
		}
	
	}




//Alterar o metodo verifica para retornar verdadeiro ou falso para saber se um aluno foi aprovado.
// A média para aprovação é 6