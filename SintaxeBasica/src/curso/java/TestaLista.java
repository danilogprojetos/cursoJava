/*package curso.java;

import java.util.ArrayList;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		//Especifica o tipo de String e n�o aceita valores no Array do tipo inteiro 
		List <String> nomes = new ArrayList<String>();
		nomes.add("Capit�o Caverna");
		nomes.add("Batima");
		
		
		//imprimi o tamanho do Array
		System.out.println(nomes.size());
		//imiprimi o conteudo do Array
		for (Object o : nomes){
			System.out.println(o);
		}

	}

}*/
package curso.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		//Especifica o tipo de String e n�o aceita valores no Array do tipo inteiro 
		List <String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Joana");
		nomes.add("Ana");
		nomes.add("Zileide");
		
		Collections.sort(nomes);
		
		//imprimi o tamanho do Array
		System.out.println(nomes.size());
		//imiprimi o conteudo do Array
		for (Object o : nomes){
			System.out.println(o);
		}
								    //Posso ou n�o colocar ou n�o o tipo Integer 
		List<Integer> ns = new ArrayList<>();
		ns.add(44);
		ns.add(33);
		ns.add(12);
		ns.add(56);
		ns.add(88);
		
		Collections.sort(ns);
		
		for (Integer n : ns){
			// nesse caso o Primeiro que entra � o primeiro que sai, no caso de um relat�rio o filtro vem direto do banco.
			System.out.println(n);
		}
		
	}

}


