package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio12 {
		
		
	public static void main(String[] args) {
		String renda = JOptionPane.showInputDialog("Qual a quantidade de Dinheiro depositada");
		
		double poupanca;
		double rendimento =  Double.parseDouble(renda);
		poupanca = rendimento *0.070;
		poupanca += + rendimento;
				
		JOptionPane.showMessageDialog(null, "Após um mês seu dinheiro valera" + poupanca );
	}

}
