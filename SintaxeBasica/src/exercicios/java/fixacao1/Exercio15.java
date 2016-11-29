package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercio15 {
		
	public static void main(String[] args) {
		
		double imposto = 45;
		double porcentagem = 28;
		
		String text = JOptionPane.showInputDialog("Informe o valor do custo de Fabrica do veiculo");
		
		double custo = Double.parseDouble(text);
		double  total = (imposto + porcentagem );
		double resultadoFinal = (custo * total) /100;
		resultadoFinal += custo;
		JOptionPane.showMessageDialog(null, resultadoFinal);
		
		
	}

}
