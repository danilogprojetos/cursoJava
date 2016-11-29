package exercicios.java.fixacao1;

import javax.swing.JOptionPane;


public class Exercicio1 {

	public static void main(String[] args) {
		
		
		String texto1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String texto2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		int num1 = Integer.parseInt(texto1);
		int num2 = Integer.parseInt(texto2);
		
		int total = num1 + num2;
		
		JOptionPane.showMessageDialog(null, total);
		
		

	}

}
