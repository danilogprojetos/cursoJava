package curso.java;

public class TestaArray {

	public static void main(String[] args) {
		
		int [] idades = new int[10];

		//desta maneira que atribuo valores nas posições
		//posição zero que a posição inicial
		idades [0] = 45;
		idades [1] = 23;
		idades [2] = 21;
		idades [3] = 60;
		idades [4] = 52;
		idades [5] = 48;
		idades [6] = 03;
		idades [7] = 12;
		idades [8] = 27;
		idades [9] = 17;
		
		System.out.println(idades[0]);
		
		//Também podemos fazer um array com String
		String [] nomes = new String[3];
		nomes[0] = "Capitão Caverna";
		nomes[1] = "Batma";
		nomes[2] = "Superômi";
		
		System.out.println(nomes[2]);
		
		//for simples
		for (int i=0; i < nomes.length; i++){
			System.out.println(nomes[i]);
		
		//for melhorado
		
		for (String n : nomes ){
			
			System.out.println(nomes[i]);
			
			}
		}
	}

}
