package ex04;

public class Perfumaria extends Farmacia {
	
	private String perf;

	public Perfumaria(int codigo, String nome1, int rg, String nome2, String nome3, float valor, String perf) {
		super(codigo, nome1, rg, nome2, nome3, valor);
		this.perf = perf;
	}

	public String getPerf() {
		return perf;
	}

	public void setPerf(String perf) {
		this.perf = perf;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("               Produto da perfumaria : " + this.perf);
	}
}
