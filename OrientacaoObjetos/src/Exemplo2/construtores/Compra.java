package Exemplo2.construtores;

public class Compra {
	int valor;
	int parcelas;
	
	//contrutor padrão 
	public Compra(){
		
	}
	
	public Compra(int valor) {
		this.valor  = valor;
		parcelas = 1;
	}
	
	public Compra(int valor, int parcelas){
		this.valor = valor;
		this.parcelas = parcelas;
	}
	
	public void imprimir(){
		System.out.println("valor: " + valor
				+ " Parcelas: " + parcelas);
		
		
	}
}
