package exercicios.java.fixacao2;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		String text1 = JOptionPane.showInputDialog("Digite o Numero que deseja saber a tabuada");
		
		int num1 = Integer.parseInt(text1);
	
		
		JOptionPane.showMessageDialog(null, "A Tabuada do numero" + num1 + " é "+"\n" 
												             + num1 + "x1=" +  (num1 *1 )+ 
												             "\n"  + num1 + "x2=" +(num1 *2 )+
												             "\n"  + num1 + "x3=" +(num1 *3 )+
												             "\n"  + num1 + "x4=" +(num1 *4 )+
												             "\n"  + num1 + "x5=" +(num1 *5 )+
												             "\n"  + num1 + "x6=" +(num1 *6 )+
												             "\n"  + num1 + "x7=" +(num1 *7 )+
												             "\n"  + num1 + "x8=" +(num1 *8 )+
												             "\n"  + num1 + "x9=" +(num1 *9 )+
												             "\n"  + num1 + "x10=" +(num1 *10 ));
		
	}

}
