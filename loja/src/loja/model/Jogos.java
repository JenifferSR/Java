package loja.model;

public class Jogos extends TestaGame {
	
	private String jog;


	public Jogos(int numero, int versao, String nome, float valor, String jog) {
		super(numero, versao, nome, valor);
		this.jog = jog;
	}
	
	 public String getJog() {
		return jog;
	}

	public void setJog(String jog) {
		this.jog = jog;
	}

	public void visualizar() {
		 super.visualizar();
		 System.out.println("               Jogo em CD ou Downlads : " + this.jog); 
}}
