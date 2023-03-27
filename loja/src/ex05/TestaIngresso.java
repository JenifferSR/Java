package ex05;

public class TestaIngresso {

	public static void main(String[] args) {
		
	Ingresso h1 = new Ingresso (111125, "04/02/23", 27, "Cynthia Erivo", "Jeniffer Silva", 625.0f);
		
		h1.visualizar();
		
	IngressoVip v1 = new IngressoVip (599855, "04/02/23", 27, "Cynthia Erivo", "Fabio Silva", 900.0f, "5R");
		v1.visualizar();
		
		IngressoMeiaEntrada vm = new IngressoMeiaEntrada (115625, "04/02/23", 27, "Cynthia Erivo", "Rafael Silva", 900.0f, "AN6826");
		vm.visualizar();

		
	}

}
