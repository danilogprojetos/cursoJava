package exercicios.java.fixacao2;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String text1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String text2 = JOptionPane.showInputDialog("Digite o Segundo numero: ");
		
		int num1 = Integer.parseInt(text1);
		int num2 = Integer.parseInt(text2);
		int intervalo=0;
		
		if(num1 > num2){ 
			//num2=10
			//num1=5
			
			num2 = num2 + num1;
			//num2 = num2 + num1 : portanto vale 15;
			
			num1 = num2 - num1;
			//num1 = num2 + num1 : portanto vale 10;
			
			num2 = num2 - num1;
			//num2 = num2 - num1 : portanto vale 5;
			
			for (int i = 1 + num1; i<num2; i++){
				intervalo=i;
				System.out.println(intervalo);
			}			
		}else{
					
		for (int i = 1 + num1; i<num2; i++){
			intervalo=i;
			System.out.println(intervalo);
		}
		
		
		}
				
	}

}
