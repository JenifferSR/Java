package ex05;

public class IngressoMeiaEntrada extends Ingresso {
	private String entrada;

	public IngressoMeiaEntrada(int codigo, String dia, int cadeira, String nome, String nome2, float valor,
			String entrada) {
		super(codigo, dia, cadeira, nome, nome2, valor);
		this.entrada = entrada;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("               Numero da carteirinha estudante : " + this.entrada);
}
}
