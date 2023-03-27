package loja.model;

public class TestaGame {
	private int numero;
	private int versao;
	private String nome;
	private float valor;

	public TestaGame(int numero, int versao, String nome, float valor) {
		super();
		this.numero = numero;
		this.versao = versao;
		this.nome = nome;
		this.valor = valor;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {

	
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      DADOS DA LOJA                          ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("               Codigo do jogo: " + this.numero                );
		System.out.println("               Versão do jogo : " + this.versao               );
		System.out.println("               Nome do jogo : " + this.nome                   );
		System.out.println("               Valor do jogo : " + this.valor                 );

	
}
}