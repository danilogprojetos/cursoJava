package exercicios.java;

import javax.swing.JOptionPane;

public class ImpedirDivisaoZero {

	public static void main(String[] args) {
		
		String tex1 = JOptionPane.showInputDialog("DIgite o Primeiro Numero");
		String tex2 = JOptionPane.showInputDialog("Digite o Segundo numero");
		
		int num1 = Integer.parseInt(tex1);
		int num2 = Integer.parseInt(tex2);
		
		System.out.println("Soma: " + (num1 + num2) + "\nSubtração: " + (num1 - num2) + "\nMultiplicação: " + (num1 * num2));
		
		if (num1 ==0){
			System.out.println("O Primeiro numero digitado é zero e não pode ser dividido");
		}else if (num2 ==0 ){
			System.out.println("O Segundo numero digitado é zero e não pode ser dividido ");
		}else{
		
		 System.out.println("Divisão:" + (num1 / num2));
		}

	}

}
