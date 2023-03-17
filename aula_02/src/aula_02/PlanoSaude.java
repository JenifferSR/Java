package aula_02;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		//ctrl shift o para  dar import
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		// leia nextint quarda o valor inteiro da variavel
		
		if (idade >= 0 && idade <= 10)
			 System.out.println("o valor do plano é de R$100 ");
		else if (idade > 10 && idade <= 29)
			 System.out.println("o valor do plano é de R$200 ");
		else if (idade > 29 && idade <= 45)
			 System.out.println("o valor do plano é de R$300 ");
		else if (idade > 45 && idade <= 59)
			 System.out.println("o valor do plano é de R$500 ");
		else if (idade > 59 && idade <= 65)
			 System.out.println("o valor do plano é de R$600 ");
		else if (idade > 65)
			 System.out.println("o valor do plano é de R$1.000 ");
		else 
			System.out.println("Idade invalida");
		
		//else if quando faz um laço 
		
		leia.close();
		
		
		
	}

}
