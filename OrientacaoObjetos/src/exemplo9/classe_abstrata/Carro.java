package exemplo9.classe_abstrata;

public class Carro extends Veiculo{
	//como o atributo esta private pra mim conseguir usar ele devo usar a pala super pra poder pegar da superClasse
	public Carro(String nome){
		super(nome);
	}
		public void mover(){
			System.out.println("Carro movendo-se");
		
	}
		
		public String getPosicao() {
			// TODO Auto-generated method stub
			return null;
	}
}
