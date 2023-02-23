package EXERCISE3;

public class Browser {

	public static int primitiveTabCount;
	public static Integer objectTabCount=0;
	public Browser() {
		primitiveTabCount++;
		objectTabCount++;
	}
}
