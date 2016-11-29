package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		
		String tex1 = JOptionPane.showInputDialog("Qual o valor da Compra?");
		
		double num1 = Double.parseDouble(tex1);
		double  compra;
		compra = num1 /5;
		
		JOptionPane.showMessageDialog(null, " O Valor da compra dividido em quatro prestações é de " + compra);

	}

}
