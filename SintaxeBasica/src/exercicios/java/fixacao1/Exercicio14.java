package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Digite o valor de custo do produto");
		String var2 = JOptionPane.showInputDialog("Digite a Porcentagem de lucro que quer ter sobre o Produto");
		
		double valorCusto = Double.parseDouble(var1);
		double valorLucro = Double.parseDouble(var2);
		double total = (valorCusto * valorLucro) /100;
		total += valorCusto;
		
		JOptionPane.showMessageDialog(null,"Com a porcentagem de: " +valorLucro+"%"+" Sobre o Valor de Custo" + valorCusto +" O preço de venda é:" +total);
		

	}

}
