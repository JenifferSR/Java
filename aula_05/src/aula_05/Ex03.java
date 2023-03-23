package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03{
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	ArrayList<String> Cores = new ArrayList<String>();
	
	for (int i = 0; i < 5; i++) {
		System.out.println("Digite uma cor: ");
		Cores.add(entrada.nextLine());
	}
	
	System.out.println("Listando cores: ");
	System.out.println(Cores);
	
	System.out.println("Ordenando cores: ");
	Cores.sort(null);
	System.out.println(Cores);
	
	entrada.close();

}

}