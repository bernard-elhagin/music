package pl.atena.aj.be.utils;

public class ExistingIDException extends BadArticleIDException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExistingIDException(int id) {
		super(id);
	}

	@Override
	public void MyException() {
		System.out.println("ID: " + ID + " ju¿ istnieje.");
	}
}
