package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		for (int i=0; i < 1; i++){
			
			String texto1 = JOptionPane.showInputDialog("Digite o Primeiro Numero ");
			String texto2 = JOptionPane.showInputDialog("Digite o segundo Numero ");
		
			int num1 = Integer.parseInt(texto1);
			int num2 = Integer.parseInt(texto2);
				
			

		System.out.println("A soma do primeiro numero com o segundo �: " + (num1 + num2) + "\nA divis�o dos dois numeros �:" + (num1 / num2) + "\nA substra��o dos dois numeros �:" + (num1 - num2) + "\nA multiplica��o dos dois numeros �:" +(num1 * num2) );
		
					 
		}
	}


}



