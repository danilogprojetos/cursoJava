package exemplo11.interfaces;

public class Carro implements Movel  {

	@Override
	public void mover() {
		System.out.println("carro correndo ");
		
	}

	@Override
	public void parar() {
		System.out.println("carro parado");
		
	}

	@Override
	public double getvalocidade() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
