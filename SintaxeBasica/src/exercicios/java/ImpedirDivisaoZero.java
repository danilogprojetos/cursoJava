package exercicios.java;

import javax.swing.JOptionPane;

public class ImpedirDivisaoZero {

	public static void main(String[] args) {
		
		String tex1 = JOptionPane.showInputDialog("DIgite o Primeiro Numero");
		String tex2 = JOptionPane.showInputDialog("Digite o Segundo numero");
		
		int num1 = Integer.parseInt(tex1);
		int num2 = Integer.parseInt(tex2);
		
		System.out.println("Soma: " + (num1 + num2) + "\nSubtra��o: " + (num1 - num2) + "\nMultiplica��o: " + (num1 * num2));
		
		if (num1 ==0){
			System.out.println("O Primeiro numero digitado � zero e n�o pode ser dividido");
		}else if (num2 ==0 ){
			System.out.println("O Segundo numero digitado � zero e n�o pode ser dividido ");
		}else{
		
		 System.out.println("Divis�o:" + (num1 / num2));
		}

	}

}
