package library_management;

public class AuthorNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return getClass()+"you have entered invalid author name...please enter \n"
				+ "James||ritchie||effcodd";
	}
	
}
