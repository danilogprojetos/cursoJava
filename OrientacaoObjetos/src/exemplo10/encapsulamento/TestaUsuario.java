package exemplo10.encapsulamento;

public class TestaUsuario {

	public static void main(String[] args) {
		
		//mostrar metodos expoxtos publicamente.
		Usuario u = new Usuario();
		u.setNome("Jeca");
		u.setSenha("1234567890");
		u.isLogado();
	}

}
