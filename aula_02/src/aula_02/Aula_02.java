package aula_02;

public class Aula_02 {

	public static void main(String[] args) {
		//Operadores pre (++ N) por (N ++)
		
		int n1 = 2, n2 = 2;
		
		/*System.out.println(n1 == n2 ^ n2 > n3);
			
		 * a b a^b  a||b   a&&b
		 * 1 1 0     1       1
		 * 1 0 1     1       0
		 * 0 1 1     1       0
		 * 0 0 0     0       0   */
		
		System.out.println("Variavel N1: " + n1);
		System.out.println("Variavel N1: " + (++ n1));
		
		System.out.println("Variavel N2: " + n2);
		System.out.println("Variavel N2: " + (n2 ++));
		System.out.println("Variavel N2: " + n2);
	
		//Operado pos usado em lup
		
		System.out.println("Variavel N2: " + (n2 += 2));
		
		//Atribuição com soma	(x += y) equivalente (x = x + y)
	
	
	
	}

}
