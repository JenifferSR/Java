package aula_03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("numero de inicio");
		numero1 = leia.nextInt();

		System.out.println("numero Fim");
		numero2 = leia.nextInt();

		if (numero1 > numero2) {
			System.out.println("intervalo invalido");
		}
		
		for(int contador = numero1; contador <= numero2; contador ++) {
			if (contador%3 == 0 && contador%5 == 0 )
			System.out.println(contador + " é mutiplo de 5 e 3");
		
		}
		
		}
		
	}
	

