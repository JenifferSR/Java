package ex06;

public class CursoLivre extends Curso {

	private String livre;

	public CursoLivre(String data, String materia, String horario, int sala, float valor, String livre) {
		super(data, materia, horario, sala, valor);
		this.livre = livre;
	}

	public String getLivre() {
		return livre;
	}

	public void setLivre(String livre) {
		this.livre = livre;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("               Curso livre : " + this.livre);
		System.out.println("-------------------------------------------------------------");

	}
	
	
}
