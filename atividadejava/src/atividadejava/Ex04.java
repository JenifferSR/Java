package atividadejava;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
	
	float numero1, numero2, numero3, numero4;
	String nome;
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("digite o nome");
	nome = leia.nextLine();
			
	System.out.println("Digite o primeiro numero");
	numero1 = leia.nextFloat();
	
	System.out.println("Digite o segundo numero");
	numero2 = leia.nextFloat();
	
	System.out.println("Digite o terceiro numero");
	numero3 = leia.nextFloat();
	
	System.out.println("Digite o quarto numero");
	numero4 = leia.nextFloat();
	
	System.out.println("Valor : " + ((numero1 * numero2) - (numero3 * numero4)));
	
	
	
	System.out.println("Nome: " + nome);
	
	leia.close();

}
}