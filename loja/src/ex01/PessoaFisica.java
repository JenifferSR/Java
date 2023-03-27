package ex01;

public class PessoaFisica extends Cliente {
	private String rg;

	public PessoaFisica(int codigo, int produto, int quantidade, String nome, float valor, String rg) {
		super(codigo, produto, quantidade, nome, valor);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("               Numero do RG : " + this.rg);

}}
