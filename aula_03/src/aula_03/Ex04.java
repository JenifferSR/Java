package aula_03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int idade, sexo, categoria, contador = 0, backend=0, frontendF = 0, mobile40 = 0, fullstackf = 0;
		char continua = 'S';
		
		while(continua == 'S') {

			System.out.println("Digite a sua idade: ");
			idade =  leia.nextInt();
			
			
			System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
				sexo =  leia.nextInt();
	
						
			System.out.println("Digite o seu 1 – Backend\r\n"
					+ "2 – Frontend\r\n"
					+ "3 – Mobile\r\n"
					+ "4 – FullStack\r\n"
					+ " ");
			categoria =  leia.nextInt();
		
			contador ++;
			
			if((sexo == 1 || sexo == 2 || sexo == 3 )&& categoria == 1)
				backend ++;
			
			if(sexo == 2 && categoria == 2)
				frontendF ++;
			
			if(sexo == 1 && idade >= 40 && categoria == 3)
				mobile40 ++;
			
			if(sexo == 2 && idade <= 30 && categoria == 4)
				fullstackf ++;
			
			
			
			System.out.println("Deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N)? ");
			continua =  leia.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Total de Fichas preenchidas: " + contador);
		
		System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
		
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + frontendF);
		
		System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + mobile40);
		
		System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos " + fullstackf);
		

	}

}
