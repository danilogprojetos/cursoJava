package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		String tex1 = JOptionPane.showInputDialog("Digite a temperatua em celsius");
		
		double temperatura = Double.parseDouble(tex1);
		
		JOptionPane.showMessageDialog(null, " A temperatura convertida em Fahrenheit é de: " +(9*temperatura+160) /5);

	}

}
