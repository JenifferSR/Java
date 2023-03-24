package aula_06;

import java.util.Scanner;

import aula_06.calculos.Calculos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Calculos calc = new Calculos();
		// metodo ligado no outo pacote
		
int opcao;
double numero1, numero2;

		while(true) {
			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3- Subtração");
			System.out.println("4- Divisão");

			System.out.println("Qual a opção?");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				sobre();
				leia.close();
				System.exit(0);
				
			}
			
			System.out.println("Digite o 1° numero");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o 2° numero");
			numero2 = leia.nextDouble();
			
			switch(opcao) {
			case 1 -> System.out.println("Soma : " + calc.soma(numero1, numero2));
			case 2 -> System.out.println("Subtração : " + calc.subitração(numero1, numero2));
			case 3 -> System.out.println("Multiplicação : " + calc.multiplicacao(numero1, numero2));
			case 4 -> System.out.println("Divisão : " + calc.divisao(numero1, numero2) );
			default -> System.out.println("Opição invalida : ");
			
			}
		}
	
	}
	//sobre é um metodo
		public static void sobre() {
		System.out.println("Calculadora com Metodos");
		System.out.println("Jeniffer Souza");
		
	}
	
}
