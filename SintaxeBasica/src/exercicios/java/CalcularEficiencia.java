package exercicios.java;

import javax.swing.JOptionPane;

public class CalcularEficiencia {

	public static void main(String[] args) {
		String text1 = JOptionPane.showInputDialog("Digite o que você alcançou"); //527 
		String text2 = JOptionPane.showInputDialog("Digite a sua meta" ); //800 
		
		double num1 = Double.parseDouble(text1);
		double num2 = Double.parseDouble(text2);
		
		double total = num1 /num2;
		total = total *100; 
		JOptionPane.showMessageDialog(null, "A eficiencia é de: " +total);
		

	}

}
