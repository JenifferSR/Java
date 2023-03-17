package aula_02;

public class Cadeias {

	public static void main(String[] args) {
	
		String S1 = "Generation Brasil";
		String S2 = "GENERATION BRASIL";
		String S3= "Generation Brasil";
		
		System.out.println(S1 == S3);
		
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S2));
		// se o conteudo é exatamente igual
		System.out.println(S1.equalsIgnoreCase(S2));
		// se o conteudo é igua independente da forma que foi escrita
		System.out.println(S1.toUpperCase());
		System.out.println(S1.toLowerCase());
		//upper deixa Maiuscula lower deixa minuscula
		System.out.println(S1.substring(0,5));
		//So vai montrar a quantidade que solicitar
		System.out.println(S1.contains("Verdade"));
		// vai procurar a palavrar no conteudo 
		

	}

}
