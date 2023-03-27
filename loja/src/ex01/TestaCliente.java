package ex01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(8584444, 1, 5, "Jeniffer Souza", 50.0f);
		
		c1.visualizar();
		
		PessoaFisica f1 = new PessoaFisica(8584444, 1, 20, "Fabio Souza", 80.0f, "26,558,669,6");
		
		f1.visualizar();
		
		PessoaJuridica j1 = new PessoaJuridica(6568224, 2, 40, "Rafael Souza", 100.0f, "888,9999,5555");
		
		j1.visualizar();
	}

}
