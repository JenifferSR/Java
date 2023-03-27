package ex02;

public class Funcionario {
	private int ctps;
	private int rg;
	private String nome;
	private float salario;

	public Funcionario(int ctps, int rg, String nome, float salario) {
		super();
		this.ctps = ctps;
		this.rg = rg;
		this.nome = nome;
		this.salario = salario;
	}

	public int getCtps() {
		return ctps;
	}

	public void setCtps(int ctps) {
		this.ctps = ctps;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void visualizar() {

	
	
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      DADOS DO FUNCIONARIO                   ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("               Numero da carteira de trabalho: " + this.ctps  );
		System.out.println("               Numero do RG : " + this.rg                     );
		System.out.println("               Nome do funcionario: " + this.nome             );
		System.out.println("               Valor do salario: " + this.salario             );

	
}
	
	
}
