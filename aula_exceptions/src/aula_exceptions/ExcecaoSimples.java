package aula_exceptions;

public class ExcecaoSimples extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	//poli morfismo com sobrecarga aplicando dois parametros
	
	public ExcecaoSimples() {}
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
	
	
}
