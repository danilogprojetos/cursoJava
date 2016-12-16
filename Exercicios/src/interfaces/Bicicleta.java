package interfaces;

public class Bicicleta implements Movimento {

	double velocidade = 10;
	
	@Override
	public void mover() {
		System.out.println("Bicicleta Andando");

	}

	@Override
	public void parar() {
		System.out.println("Bicicleta do Gordo Parada");

	}

	@Override
	public double getVelocidade() {
		this.velocidade *= 100;
		System.out.println("Velocidade da Bicicleta " + velocidade + " KM/h");
		return 0;
	}

}
