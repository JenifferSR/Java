package ex06;

public class TestaCurso {

	public static void main(String[] args) {
		Curso c1 = new Curso ("25/05/22","Desgner Grafico","Manhã", 25, 752.0f);
		c1.visualizar();
		
		CursoLivre cl = new CursoLivre ("25/05/22","ADM","Noite", 29, 900.0f, "Materia livre WORD ");
		
		CursoEspecializacao ce = new CursoEspecializacao ("25/05/22","Desgner de Inetriores","Tarde", 26, 825.0f, "Materia para Especializacao Cores");
		
		
		ce.visualizacao();
		cl.visualizar();
	}

}
