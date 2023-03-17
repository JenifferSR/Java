package atividade;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

    	float preco;
		int menu;
		int quantidade;

		System.out.println("Menu");
		System.out.println("1\tCachorro Quente R$ 10,00");
		System.out.println("2\tX-Salada R$ 15,00");
		System.out.println("3\tX-Bacon R$ 18,00");
		System.out.println("4\tBauru R$ 12,00");
		System.out.println("5\tRefrigerante R$ 8,00");
		System.out.println("6\tSuco de laranja R$ 13,00\n\n");
		
		System.out.println("Digite o numero do pedido ");
		menu = leia.nextInt();
					
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();

	
		switch (menu) {

		case 1:
			System.out.println("Valor Total:" + (preco = 10 * quantidade));
			break;
		case 2:
			System.out.println("Valor Total: " + (preco = 15 * quantidade));
			break;
		case 3:
			System.out.println("Valor Total: " + (preco = 18 * quantidade));
			break;
		case 4:
			System.out.println("Valor Total: " + (preco = 12 * quantidade));
			break;
		case 5:
			System.out.println("Valor Total: " + (preco = 8 * quantidade));
			break;
		case 6:
			System.out.println("Valor Total: " + (preco = 13 * quantidade));
			break;
			

		}
	}

}
