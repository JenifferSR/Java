package ex05;

public class IngressoVip extends Ingresso {
	
	private String lugar;

	public IngressoVip(int codigo, String dia, int cadeira, String nome, String nome2, float valor, String lugar) {
		super(codigo, dia, cadeira, nome, nome2, valor);
		this.lugar = lugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
public void visualizar() {
	super.visualizar();
	System.out.println("               Numero da cadeira : " + this.lugar);
}
}
