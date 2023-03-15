package atividadejava;

		import java.util.Scanner;

	public class Ex01 {

	    public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);
	        
	        float salario, abono, resultado;

	        System.out.println("Digite seu salário: ");
	        salario=leia.nextFloat();
	        
	        System.out.println("Digite seu abono: ");
	        abono=leia.nextFloat();

	        resultado = salario + abono;
	        System.out.println("Seu novo salário é: " + resultado);
	        
	        leia.close();
	    }

	}
