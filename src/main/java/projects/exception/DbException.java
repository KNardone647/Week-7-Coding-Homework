/**
 * 
 */
package projects.exception;

/**
 * @author kmnar
 *
 */
@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	/**
	 * 
	 */
	public DbException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public DbException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public DbException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DbException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}



}
