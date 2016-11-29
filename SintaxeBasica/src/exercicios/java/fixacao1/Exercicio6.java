package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Digite um numero");
		
		int numero = Integer.parseInt(texto);
		
		if (numero > 100 && numero < 200){
			
			JOptionPane.showMessageDialog(null, " O numero "+ numero + " Esta está entre 100 e 200");
		
		}else if (numero == 100 ){
			
			JOptionPane.showMessageDialog(null, "O numero " + numero + " É igual a 100");
		}
		if (numero == 200){
			
			JOptionPane.showMessageDialog(null, "O numero " + numero + " É igual a 200 ");
			
		}if(numero < 100 || numero > 200){
			JOptionPane.showMessageDialog(null, "O numero " + numero + " Não esta entre 100 e 200");
		}
			

	}

}
