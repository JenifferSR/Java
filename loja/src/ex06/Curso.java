package ex06;

public class Curso {
	
	private String data;
	private String materia;
	private String horario;
	private int sala;
	private float valor;
	public Curso(String data, String materia, String horario, int sala, float valor) {
		this.data = data;
		this.materia = materia;
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      DADOS FACULDADE                      ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("               Inicio das aulas : " + this.data               );
		System.out.println("               Curso escolido : " + this.materia              );
		System.out.println("               Turno : " + this.horario                       );
		System.out.println("               Sala : " + this.sala                           );
		System.out.println("               Valor : " + this.valor                         );
		
		
		
		
	}
	
	
}
