package exemplo1.classe_objeto;

public class Carro {
	
	//Atributos da Classe -> estado
	int potencia;
	int velocidade;
	String nome;
	
	//Metódos -> comportamento
	public void acelerar() {
		velocidade += potencia;
	}
	
	public void frear() {
		velocidade *= 0.5; 
	}
	
	public void imprimir(){
		System.out.println("Nome: " + nome + "Velocidade: " + velocidade);
	}
}
