package interfaces;

public class Caminhao implements Movimento {

	double velocidade = 5;
	
	@Override
	public void mover() {
		System.out.println("Caminhão se movendo");

	}

	@Override
	public void parar() {
		System.out.println("Caminhão parado");

	}

	@Override
	public double getVelocidade() {
		this.velocidade *= 10;
		System.out.println("Velocidade Caminhao " + velocidade + " KM/h");
		return 0;
	}

}
