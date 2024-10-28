package library_management;

public class PagesOutOfBoundsException extends RuntimeException {

	@Override
	public String toString() {
		return getClass()+"you have entered invalid no of pages...please enter\n"
				+ "pages in the range of 500 to 3000";
	}
	
}
