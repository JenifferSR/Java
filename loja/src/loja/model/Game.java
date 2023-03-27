package loja.model;

public class Game {

	public static void main(String[] args) {
	
		
		TestaGame g1 = new TestaGame(5954555,2023,"FIFA Futebol 2023",100.0F);
		
         g1.visualizar();
         
         Jogos j1 = new Jogos(5954555,2023,"FIFA Futebol 2023",100.0F,"Cd");

         j1.visualizar();

         Console c1 = new Console(5954555,2023,"FIFA Futebol 2023",100.0F,"Play 5");

         c1.visualizar();

	}

	
		
	}
