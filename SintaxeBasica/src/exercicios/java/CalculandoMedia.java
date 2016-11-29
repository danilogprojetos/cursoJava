package exercicios.java;

import javax.swing.JOptionPane;

public class CalculandoMedia {

	public static void main(String[] args) {

		int soma = 0;

		for (int i = 0; i < 4; i++) {
			String digitado = JOptionPane.showInputDialog("Digite nota");
			soma = soma + Integer.parseInt(digitado);
		}

		int resultado = soma / 4;
		String mensagem = "";

		if (resultado > 7) {
			mensagem = "Aprovado";

			JOptionPane.showMessageDialog(null, "Você foi:" + mensagem);
		
		} else if (resultado < 5) {
			mensagem = "Reprovado";

			JOptionPane.showMessageDialog(null, "Você foi:" + mensagem);
		} else {
			mensagem = "Em exame";
			JOptionPane.showMessageDialog(null, "Você foi:" + mensagem);
		}

	}

}
