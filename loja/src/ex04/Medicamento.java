package ex04;

public class Medicamento extends Farmacia {
	
	private String med;

	public Medicamento(int codigo, String nome1, int rg, String nome2, String nome3, float valor, String med) {
		super(codigo, nome1, rg, nome2, nome3, valor);
		this.med = med;
	}

	public String getMed() {
		return med;
	}

	public void setMed(String med) {
		this.med = med;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("               Medicamento original ou generico : " + this.med);
		
}}
