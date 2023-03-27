package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		//CONTA
		Conta c1 = new Conta(1, 123, 1, "Jeniffer Souza", 10000.0f);
//CONTA CORRENTE
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Fabio Silva", 10000.0f, 10000.0f);
		//CONTAPUPANCA
		ContaPoupanca cp = new ContaPoupanca(3, 123, 2, "Rafael Lopes", 10000.0f, 15);
		
		Conta c2 = new Conta();
		
		
		c2.visualizar();


		c1.visualizar();
		cc1.visualizar();
		cc1.sacar(20000.0f);
		cc1.visualizar();
		cp.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BOLD + "-------------------------------------------------------------");
			System.out.println("                                                             ");
			System.out.println("                          BANCO JAVA                         ");
			System.out.println("                                                             ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("                                                             ");
			System.out.println("                  1 - Cria conta                             ");
			System.out.println("                  2 - Listar todas as contas                 ");
			System.out.println("                  3 - Buscar conta por numero                ");
			System.out.println("                  4 - Atualizar dados da conta               ");
			System.out.println("                  5 - Apagar conta                           ");
			System.out.println("                  6 - Sacar                                  ");
			System.out.println("                  7 - Depositar                              ");
			System.out.println("                  8 - Transferir valor entre contas          ");
			System.out.println("                  9 - Sair                                   ");
			System.out.println("                                                             ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("                                                             ");
			System.out.println("                  Entre com a opção desejada:                ");
			System.out.println("                                                             ");
			System.out.println("-------------------------------------------------------------" + Cores.TEXT_RESET);

			opcao = leia.nextInt();


			if (opcao == 9) {

				System.out.println(Cores.TEXT_CYAN_BOLD + "\n              BANCO JAVA - VOCÊ NO CAMINHO CERTO !!");
				sobre();
				leia.close();
				System.exit(0);

			}
			switch (opcao) {
			case 1 -> {
				System.out.println("Cria conta\n\n");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
			}
			}
			do {
				System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
				tipo = leia.nextInt();
			} while (tipo < 1 && tipo > 2);

			System.out.println("Digite o Saldo da Conta (R$): ");
			saldo = leia.nextFloat();

			switch (tipo) {
			case 1 -> {
				System.out.println("Digite o Limite de Crédito (R$): ");
				limite = leia.nextFloat();

				// criar o objeto conta corrente
			}
			case 2 -> {
				System.out.println("Digite o dia do Aniversario da Conta: ");
				aniversario = leia.nextInt();

				// criar o objeto conta poupanca
			}

			// case 2 -> System.out.println("Listar todas as contas \n\n");
			case 3 -> {
				System.out.println("Consultar dados da conta - por numero \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 4 -> {
				System.out.println("Atualizar dados da conta \n\n");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}
			}
			// fim do condicional buscar na collection

			case 5 -> {
				System.out.println("Apagar conta \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Saque \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do saque: ");
				valor = leia.nextInt();
			}
			case 7 -> {
				System.out.println("Deposito\n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do deposito ");
				valor = leia.nextInt();
			}
			case 8 -> {
				System.out.println("Transferir valor entre contas \n\n");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}

				// fim do condicional buscar na collection
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);

			}
			default -> System.out.println(Cores.TEXT_RED + "\nOpição invalida !! \n ");
			}
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_WHITE + "                                                             ");
		System.out.println("                 Jeniffer Souza Ribeiro                      ");
		System.out.println("                 jesouza774@gmail.com                        ");
		System.out.println("                 https://github.com/JenifferSR               ");
	}
}
