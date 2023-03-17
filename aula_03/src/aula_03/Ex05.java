package aula_03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0, positivo = 0;

		do {
// lup
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0)
			positivo += numero;

		
			

		} while (numero != 0);
		//sai do lup
		
		System.out.println("soma dos numeros positivos: " + positivo);
		

	}

}
