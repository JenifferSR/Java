package ex05;

public class Ingresso {
	private int codigo;
	private String dia;
	private int cadeira;
	private String nome;
	private String nome2;
	private float valor;

	public Ingresso(int codigo, String dia, int cadeira, String nome, String nome2, float valor) {
		this.codigo = codigo;
		this.dia = dia;
		this.cadeira = cadeira;
		this.nome = nome;
		this.nome2 = nome2;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getCadeira() {
		return cadeira;
	}

	public void setCadeira(int cadeira) {
		this.cadeira = cadeira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {

		System.out.println("-------------------------------------------------------------");
		System.out.println("                      DADOS DO SHOW                          ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("               Cogigo do Ingresso :" + this.codigo            );
		System.out.println("               Dia do Show :" + this.dia                      );
		System.out.println("               Numero da cadeira : " + this.cadeira           );
		System.out.println("               Nome do Evento : " + this.nome                 );
		System.out.println("               Nome do Cliente : " + this.nome2               );
		System.out.println("               Valor do ingresso : " + this.valor             );
		System.out.println("-------------------------------------------------------------");

	}
}