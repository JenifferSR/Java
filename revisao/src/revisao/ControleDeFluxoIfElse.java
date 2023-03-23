package revisao;

import java.util.Scanner;

public class ControleDeFluxoIfElse {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int estoque;
		
		System.out.println("Digite o valor do estoque");
		estoque = leia.nextInt();
		
		if(estoque >= 100) {
			System.out.println("produto suficiente");
		}else if (estoque <100 && estoque > 50) {
			System.out.println("alerta : avaliar possibilidade de novo pedido");
		}else {
			System.out.println("atenção faça um novo pedido");
		}
		
		
leia.close(); 
	}

}
