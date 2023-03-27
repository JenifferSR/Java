package ex02;

public class TestaFuncionario {
	public static void main(String[] args) {
Funcionario f1 = new Funcionario (123456, 123456, "Jeniffer Souza", 5000.0f);

f1.visualizar();
Gerente g1 = new Gerente (123456, 123456, "Fabio Souza", 10000.0f,"Senior");

g1.visualizar();

Vendedor v1 = new Vendedor (123456, 123456, "Rafafel Souza", 5000.0f, "Pleno");

v1.visualizar();
}
}