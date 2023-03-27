package ex02;

public class Vendedor extends Funcionario {
	private String ven;

	public Vendedor(int ctps, int rg, String nome, float salario, String ven) {
		super(ctps, rg, nome, salario);
		this.ven = ven;
	}

	public String getVen() {
		return ven;
	}

	public void setVen(String ven) {
		this.ven = ven;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("               Vendedor : " + this.ven);
	}

}
