package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(" Qual o seu nome? ");
		String texto1 = JOptionPane.showInputDialog(" Qual o valor do seu Salario fixo? ");
		String texto2 = JOptionPane.showInputDialog(" Qual o valor das vendas efetuadas este mês? ");
		
		double salario = Double.parseDouble(texto1);
		double vendas =  Double.parseDouble(texto2);
		
		double total = vendas * 0.15;
		total += + salario;
		
		JOptionPane.showMessageDialog(null, nome + "Seu salrio Final este mês foi de:" + total);
		

	}

}
