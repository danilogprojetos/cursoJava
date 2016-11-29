package exercicios.java.fixacao1;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int total = 0;
		String nome = JOptionPane.showInputDialog("Qual seu Nome?");
		
		for (int i=0; i<3; i++){
			String media = JOptionPane.showInputDialog("Digite a nota");
			total += + Integer.parseInt(media);
		}
		
		int mediaFinal = total /4;
			String mensagem = "";
	
	    if (mediaFinal >= 7){
		 mensagem ="Aprovado";
	
	    JOptionPane.showMessageDialog(null, nome +" Você foi: " + mensagem);
		
		}else if (mediaFinal <= 5){
			mensagem = "Reprovado";
		
		JOptionPane.showMessageDialog(null, nome + "Você foi:" + mensagem);
	
		} else {
			mensagem = " Em exame ";
		JOptionPane.showMessageDialog(null, nome + " Você esta " + mensagem);
			
			}
		}
	}
	
