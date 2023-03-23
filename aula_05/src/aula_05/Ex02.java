package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Stack<String>pilha = new Stack<String>();

		byte opcao = 0;

		String livro = null;

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- adicionar livro");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar livro");
			System.out.println("0- Sair");

			opcao = (byte) entrada.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite um nome: ");
				entrada.nextLine();
				livro = entrada.nextLine();
				pilha.add(livro);

				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("Não existem livro cadastrados!");
				} else {
					System.out.println("Listar livros");
					for (String elemento : pilha) {
						System.out.println(elemento);
					}
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("pilha vazia!");
				} else {
					pilha.remove(livro);
					System.out.println("Remover livro: ");
				}

				break;
			default:
				if (opcao != 0)
					System.out.println("Opção inválida!");
				else if (opcao > 3)
					System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		entrada.close();
	}

}
