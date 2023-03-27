package ex01;

public class Cliente {

	private int codigo ;
	private int produto;
	private int quantidade;
	private String nome;
	private float valor;
	
	public Cliente(int codigo, int produto, int quantidade, String nome, float valor) {
		super();
		this.codigo = codigo;
		this.produto = produto;
		this.quantidade = quantidade;
		this.nome = nome;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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

		String tipo = "";

		switch (this.produto) {
		case 1 -> tipo = "Blusa";
		case 2 -> tipo = "Sapato";
		}

	System.out.println("---------------------------------------------------------------");
	System.out.println("                      DADOS DA LOJA                            ");
	System.out.println("---------------------------------------------------------------");
	System.out.println("               Codigo do produto: " + this.codigo               );
	System.out.println("               Qual produto : " +        tipo                   );
	System.out.println("               Quantidade : " +           this.quantidade       );
	System.out.println("               Nome do Cliente: " + this.nome                   );
	System.out.println("               Valor da compra : " + this.valor                 );

	
	
}
	
}
