package atividade;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, pergunta;
		int idade;
		boolean doacao = false;

		System.out.println("Digite nome: ");
		nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação ? (S/N) ");
		pergunta = leia.next().toUpperCase();

		if (pergunta == "S")
			doacao = true;

		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome + " Não está apto(a) para doar sangue!");
			else
				System.out.println(nome + " Está apto para doar sangue! ");
		} else if (idade < 18 || idade > 69)
			System.out.println(nome + " Não está apto para doar sangue!");
		else
			System.out.println(nome + " Está apto para doar sangue! ");

		leia.close();
	}

}
