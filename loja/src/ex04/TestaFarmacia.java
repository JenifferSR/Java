package ex04;

public class TestaFarmacia {

	public static void main(String[] args) {
	
		Farmacia h1 = new Farmacia (111125, "jeniffer Souza", 11111111, "Rafael Silva", "Dipirona", 125.0f);
		
		h1.visualizar();
		
Medicamento m1 = new Medicamento (25665, "Fabio Souza", 595456, "Rafael Silva", "Dipirona", 89.0f, "DIPIONA GENERICO");
		
		m1.visualizar();
		
Perfumaria p1 = new Perfumaria (111125, "jeniffer Souza", 11111111, "Rafael Silva", "SEM MEDICAMENTO", 15.0f, "Creme Salon");
		p1.visualizar();
	}

}
