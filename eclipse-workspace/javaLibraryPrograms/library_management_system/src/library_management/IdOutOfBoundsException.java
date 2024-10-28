package library_management;

public class IdOutOfBoundsException extends RuntimeException {

	@Override
	public String toString() {
		return getClass()+"you have entered invalid id.";
	}
	
}
