package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		// loop do = while
		do {
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);

				loop = false;
				
			} catch (InputMismatchException e) {
				//System.err.println("Exceção : " + e);
				System.out.println("Digite um numero inteiro");
				// ler novamente
				ler.nextLine();
			} catch (ArithmeticException e) {
				//System.err.println("Exceção : " + e);
				System.out.println("Não existe divião por zero !!");
				ler.nextLine();
			} finally {
				System.out.println("Sempre serei executada!");
			}
		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
