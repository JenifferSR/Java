package optional;

import java.util.Optional;

public class Opitional01 {
//é uma class que evita dar erro quando o objeto é nulo
	
	public static void main(String[] args) {
		
		String[] palavras = new String[10];

		palavras [5] = "turma 62";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);

		if (checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else
			System.out.println("A palavra é nula!");
		
		System.out.println("Optional está vazio ? " + checaNulo.isEmpty());

	}

}
