package ex04;

public class Farmacia {
	private int codigo;
	private String nome1;
	private int rg;
	private String nome2;
	private String nome3;
	private float valor;
	
	
	public Farmacia(int codigo, String nome1, int rg, String nome2, String nome3, float valor) {
		this.codigo = codigo;
		this.nome1 = nome1;
		this.rg = rg;
		this.nome2 = nome2;
		this.nome3 = nome3;
		this.valor = valor;
	}





	public int getCodigo() {
		return codigo;
	}





	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}





	public String getNome1() {
		return nome1;
	}





	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}





	public int getRg() {
		return rg;
	}





	public void setRg(int rg) {
		this.rg = rg;
	}





	public String getNome2() {
		return nome2;
	}





	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}





	public String getNome3() {
		return nome3;
	}





	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}





	public float getValor() {
		return valor;
	}





	public void setValor(float valor) {
		this.valor = valor;
	}





	public void visualizar() { 
	System.out.println("-------------------------------------------------------------");
	System.out.println("                      DADOS FARMACIA                         ");
	System.out.println("-------------------------------------------------------------");
	System.out.println("               Codigo do produto : " + this.codigo            );
	System.out.println("               Nome do comprador :" + this.nome1              );
	System.out.println("               RG do comprador :" + this.rg                   );
	System.out.println("               Nome do funcionario que fez a venda :" + this.nome2);
	System.out.println("               Nome do produto :" + this.nome3                );
	System.out.println("               Valor do produto : " + this.valor              );
	
	
}
}