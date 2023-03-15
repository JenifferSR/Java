package atividadejava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o Desconto: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5)
				- descontos;
		
		System.out.println("O Salário Liquído é: " + df.format(salarioLiquido));
		
		leia.close();
	}

}
