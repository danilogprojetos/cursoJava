package exercicios.java;

import javax.swing.JOptionPane;

public class TransformandoDoisNumeros {

	public static void main(String[] args) {
		
		String tex1 = JOptionPane.showInputDialog("DIgite o Primeiro Numero");
		String tex2 = JOptionPane.showInputDialog("Digite o Segundo numero");
		
		int num1 = Integer.parseInt(tex1);
		int num2 = Integer.parseInt(tex2);
		
				
		System.out.println("Soma: " + (num1 + num2) + "\nSubtração: " + (num1 - num2) + "\nMultiplicação: " + (num1 * num2) + "\nDivisão: " + (num1 / num2));
		

	}

}
