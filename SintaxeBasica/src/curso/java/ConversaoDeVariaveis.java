package curso.java;

import javax.swing.JOptionPane;

public class ConversaoDeVariaveis {

	public static void main(String[] args) {
		
		//Conversão de variaveis
		byte b = 127;
		int  i = 128;
		b = (byte)i;		
		//System.out.println(b);
		
		//Conversão de String que aceita texto para aceitar numero -> como também posso ter com o doble
		String texto = JOptionPane.showInputDialog("Número");
		int n1 = Integer.parseInt(texto);
		System.out.println(n1 + n1);

		
		
	}

}
