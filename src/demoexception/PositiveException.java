package demoexception;

public class PositiveException extends Exception {

	private static final long serialVersionUID = 1952971734896934946L;
	
	public PositiveException() {
		super("La valeur est n�gative !");
	}
	
	public PositiveException(String message) {
		super(message);
	}

}
