package loja.model;

public class Console extends TestaGame {

	private String con;

	public Console(int numero, int versao, String nome, float valor, String con) {
		super(numero, versao, nome, valor);
		this.con = con;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("               Play 4 ou Play 5 : " + this.con);
	}

}
