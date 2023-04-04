package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;
import contaController.ContaController;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino = 0;
		String titular;
		float saldo, limite, valor;

		ContaController contas = new ContaController();

		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "Pedro Silva", 10000f, 900.0f);
		contas.cadastrar(cc1);

		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria Flor", 5000f, 600.0f);
		contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Melissa Ribeiro", 6000f, 15);
		contas.cadastrar(cp1);

		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Joana Moreira", 3000f, 20);
		contas.cadastrar(cp2);

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
			System.out.println("                                                             " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valor inteiros !");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {

				System.out.println(Cores.TEXT_CYAN_BOLD + "\n              BANCO JAVA - VOCÊ NO CAMINHO CERTO !!");
				sobre();
				leia.close();
				System.exit(0);

			}
			switch (opcao) {

			case 1:
				System.out.println("Cria conta\n\n");

				System.out.println("Digite o numero da agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o tipo da conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o limite de crédito (R$): ");
					limite = leia.nextFloat();

					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do aniversario da conta: ");
					aniversario = leia.nextInt();

					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as contas\n\n");
				contas.listarTodas();

				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados da conta - por número \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				contas.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados da conta \n\n");

				System.out.println("Digite o numero da conta: ");
				numero = leia.nextInt();

				if (contas.buscarNaCollection(numero) != null) {

					tipo = contas.retornaTipo(numero);

					System.out.println("Digite o numero da agência: ");
					agencia = leia.nextInt();
					System.out.println("Digite o nome do titular da conta: ");
					leia.skip("\\R?");
					titular = leia.nextLine();

					System.out.println("Digite o saldo da conta (R$): ");
					saldo = leia.nextFloat();

					// retornar tipo

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o limite de crédito (R$): ");
						limite = leia.nextFloat();

						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do aniversario da conta: ");
						aniversario = leia.nextInt();

						contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
					}
					default -> {
						System.out.println("Tipo de conta inválido !");
					}
					}
				} else {
					System.out.println(" A conta não foi encontrada");
				}
				keyPress();
				break;
			case 5:
				System.out.println("Apagar conta \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				contas.deletar(numero);

				keyPress();
				break;
			case 6:
				System.out.println("Saque \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do saque: ");
				valor = leia.nextFloat();

				contas.sacar(numero, valor);

				keyPress();
				break;
			case 7:
				System.out.println("Depósito\n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do depósito ");
				valor = leia.nextFloat();
				contas.depositar(numero, valor);

				keyPress();
				break;
			case 8:
				System.out.println("Transfêrir valor entre contas \n\n");

				System.out.println("Digite o numero da conta de origem:");
				numero = leia.nextInt();
				System.out.println("Digite o numero da conta de destino:");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				contas.transferir(numero, numeroDestino, valor);

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED + "\nOpição invalida !! \n ");

				keyPress();
				break;

			}
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_WHITE + "                                                             ");
		System.out.println("                 Jeniffer Souza Ribeiro                      ");
		System.out.println("                 jesouza774@gmail.com                        ");
		System.out.println("                 https://github.com/JenifferSR               ");
		System.out.println("                 https://www.linkedin.com/in/jeniffer-souza-ribeiro-8323971ab/");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "PRESSIONE A TECLA ENTER PARA CONTINUAR");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Erro de digitação !!");
		}
	}
}
