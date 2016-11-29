package exemplo1.classe_objeto;

public class TestaCarro {

	public static void main(String[] args) {
	
		//Controi o objeto da classe carro 
		Carro fusca = new Carro();
		fusca.velocidade = 0;
		fusca.potencia = 15;
		fusca.nome = "Fusca";
		
		fusca.acelerar();
		fusca.frear();
		fusca.imprimir();
		
		
		Carro gol = new Carro();
		gol.velocidade = 0;
		gol.potencia = 30;
		gol.nome = "Gol";
		
		fusca.acelerar();
		fusca.acelerar();
		
		fusca.frear();
		
		fusca.imprimir();
		gol.imprimir();
		

	}

}
