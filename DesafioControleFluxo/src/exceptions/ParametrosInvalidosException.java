package exceptions;

public class ParametrosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String msg) {
		super(msg);
	}

	public ParametrosInvalidosException(String message, Throwable cause) {
		super(message, cause);
	}

}
