package ex06;

public class CursoEspecializacao extends Curso {

	private String especializacao;

	public CursoEspecializacao(String data, String materia, String horario, int sala, float valor,
			String especializacao) {
		super(data, materia, horario, sala, valor);
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public void visualizacao() {
		super.visualizar();
		System.out.println("               Materia para o curso de especializacao : " + this.especializacao);
		System.out.println("-------------------------------------------------------------");

	}
}
