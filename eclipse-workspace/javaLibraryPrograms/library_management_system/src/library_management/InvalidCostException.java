package library_management;

public class InvalidCostException extends RuntimeException {

	@Override
	public String toString() {
		return getClass()+"you have entered invalid cost....please enter\n"
				+ "in the range of 200 to 2000";
	}
	
}
