package exercicios.java.fixacao2;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		String text1 = JOptionPane.showInputDialog("Digite o numero que deseja saber fatorial");
		
		int num1 = Integer.parseInt(text1);
		
		for (int total=1;num1>total;total++){
				int i = total *num1;	
			  System.out.println(i);
		}

	}

}
