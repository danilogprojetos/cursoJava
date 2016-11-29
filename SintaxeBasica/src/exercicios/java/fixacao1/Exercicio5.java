package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		String var1 = JOptionPane.showInputDialog("Digite o Primeiro numero");
		String var2 = JOptionPane.showInputDialog("Digite o Segundo numero");
		
		int num1 = Integer.parseInt(var1);
		int num2 = Integer.parseInt(var2);
		
		if (num1 > num2){
			JOptionPane.showMessageDialog(null, "O numero 1 é maior que o numero 2");
		} else if (num1 < num2){
			JOptionPane.showMessageDialog(null, "O numero 2 é maior que o numero 1");
		} else{
			JOptionPane.showMessageDialog(null, "Os dois numeros são igauis");
			
			
		}
	}

}
