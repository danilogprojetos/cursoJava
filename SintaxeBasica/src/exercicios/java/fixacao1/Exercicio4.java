package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String mensagem = JOptionPane.showInputDialog("Digite um numero");
		
		int num1 = Integer.parseInt(mensagem);
		
		
		
		if (num1 > 10){
			
		JOptionPane.showMessageDialog(null, num1 + "� maior que 10!");
			
		}else if (num1 == 10){ 
		
		JOptionPane.showMessageDialog(null, num1 + "� exatamente igual a 10!");
		
		}else{
			
		JOptionPane.showMessageDialog(null, num1 + "� menor que 10!");
		}
			
			
	}

}
