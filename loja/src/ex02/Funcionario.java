package ex02;

public class Funcionario {
	private int ctps;
	private int rg;
	private int cargo;
	private String nome;
	private float salario;

	public Funcionario(int ctps, int rg, int cargo, String nome, float salario) {
		super();
		this.ctps = ctps;
		this.rg = rg;
		this.cargo = cargo;
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

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
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

		String tipo = "";

		switch (this.cargo) {
		case 1 -> tipo = "Estagiario";
		case 2 -> tipo = "Pleno";
		}
	
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      DADOS DO FUNCIONARIO                   ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("               Numero da carteira de trabalho: " + this.ctps  );
		System.out.println("               Numero do RG : " + this.rg                     );
		System.out.println("               Cargo : " + tipo                               );
		System.out.println("               Nome do funcionario: " + this.nome             );
		System.out.println("               Valor do salario: " + this.salario             );

	
}
	
	
}
