package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		byte opcao = 0;

		String nomes = null;

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- Adicionar um novo Cliente na fila");
			System.out.println("2- Listar todos os Clientes na fila");
			System.out.println("3- Retirar um nome da fila");
			System.out.println("0- Sair");

			opcao = (byte) entrada.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite um nome: ");
				entrada.nextLine();
				nomes = entrada.nextLine();
				fila.add(nomes);
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("Não existem nomes cadastrados!");
				} else {
					System.out.println("Listar nomes");
					for (String elemento : fila) {
						System.out.println(elemento);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("fila vazia!");
				} else {
					fila.remove(nomes);
					System.out.println("Remover um nome: ");
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
