package ex02;

public class Gerente extends Funcionario {
 public String gen;

public Gerente(int ctps, int rg, String nome, float salario, String gen) {
	super(ctps, rg, nome, salario);
	this.gen = gen;
}

public String getGen() {
	return gen;
}

public void setGen(String gen) {
	this.gen = gen;
}
 public void visualizar() {
	 super.visualizar();
	 System.out.println("               Gerente: " + this.gen);
 }
 
}
