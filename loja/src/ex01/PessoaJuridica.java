package ex01;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(int codigo, int produto, int quantidade, String nome, float valor, String cnpj) {
		super(codigo, produto, quantidade, nome, valor);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("               Numero do CNPJ : " + this.cnpj);
	}
}
