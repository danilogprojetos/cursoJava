package exercicios.java;

import javax.swing.JOptionPane;

public class CalculandoIdade {

	public static void main(String[] args) {
		

		String idade = JOptionPane.showInputDialog("Digite a sua data de nascimento");
		String nascimento = JOptionPane.showInputDialog("Digite o ano de em que estamos");
		
		int num1 = Integer.parseInt(idade);
		int num2 = Integer.parseInt(nascimento);
		
		int total = num1 -num2;
		
		JOptionPane.showMessageDialog(null, total);
	}

}
