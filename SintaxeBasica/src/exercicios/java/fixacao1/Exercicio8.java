package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		String texto1 = JOptionPane.showInputDialog("Qual a Kilometragem percorrida pelo Automovel");
		String texto2 = JOptionPane.showInputDialog("Qual a Capacidade de armazenamento de combustivel do Veiculo");
		
		int km = Integer.parseInt(texto1);
		int capacidade = Integer.parseInt(texto2);
		
		int total = km / capacidade;
		
		JOptionPane.showMessageDialog(null, "A eficiencia do veiculo foi de: " + total + " Kilometros Por Litro");
		
	}

}
