package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		String infor1 = JOptionPane.showInputDialog("Qual o valor da Cotação do Dolar");
		String infor2 = JOptionPane.showInputDialog("Qual a quatidade de Dolar que deseja converter");

		double cotacao = Double.parseDouble(infor1);
		double reais = Double.parseDouble(infor2);
		double total = cotacao * reais;
		
		JOptionPane.showMessageDialog(null, "A quantidade rendida em reais é de " + total);
	}

}
