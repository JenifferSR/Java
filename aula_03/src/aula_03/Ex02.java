package aula_03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		
		 Scanner leia = new Scanner(System.in);

	        int numero, impar = 0, par= 0;

	        for(int contador = 1; contador <= 10; contador ++) {
	            System.out.println("Digite o "+ contador +"º número: ");
	            numero = leia.nextInt();

	            if(numero%2==0) 
	                par++;
	            else
	                impar++;
	        }
	        System.out.println("Total de números pares: "+ par);
	        System.out.println("Total de números ímpares: "+ impar);

	    }

	}