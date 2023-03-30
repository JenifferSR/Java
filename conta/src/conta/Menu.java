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

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		ContaController contas = new ContaController();

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
			System.out.println("                                                             "+ Cores.TEXT_RESET);
	

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
				
				System.out.println("Digite o Numero da Agência: ");				
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

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

					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}
				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				contas.listarTodas();
				
				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados da conta - por numero \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				contas.procurarPorNumero(numero);
				
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados da conta \n\n");

				System.out.println("Digite o numero da conta: ");
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

				keyPress();
				break;
			case 5:
				System.out.println("Apagar conta \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				keyPress();
				break;
			case 6:
				System.out.println("Saque \n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do saque: ");
				valor = leia.nextFloat();
				
				keyPress();
				break;
			case 7:
				System.out.println("Deposito\n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do deposito ");
				valor = leia.nextFloat();

				keyPress();
				break;
			case 8:
				System.out.println("Transfêrir valor entre contas \n\n");

				System.out.println("Digite o numero da Conta de Origem");
				numero = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);
				
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
			System.out.println("Erro de digitacção");
		}
	}
}
