package pl.atena.aj.be.utils;

public class BadArticleIDException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected final int ID;
	
	public BadArticleIDException(int id) {
		this.ID = id;
	}
	
	public void MyException() {
		System.out.println("ID musi byæ wiêksze od zera.");
	}
}
