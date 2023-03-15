package atividadejava;


	import java.util.Scanner;

	public class Ex02{
		
		public static void main(String[] args) {
		
		float numero1, numero2, numero3, numero4;
		Scanner leia = new Scanner(System.in);
		
				
		System.out.println("Digite a primeira nota");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite a terceira note");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota");
		numero4 = leia.nextFloat();
		
		System.out.println("Media : " + ((numero1 + numero2 + numero3 + numero4) / 4));
		
		
	
		
		leia.close();

	}
	}