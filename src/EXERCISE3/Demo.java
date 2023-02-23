package EXERCISE3;

public class Demo {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			new Browser();
		}	
	 int primitiveTabCount=Browser.primitiveTabCount;
	 Integer count=primitiveTabCount;         //AutoBoxing 
     System.out.println(count); 
	 
	 
	Integer objectTabCount=Browser.objectTabCount;
	int i=objectTabCount;                   //Unboxing
	System.out.println(i);
	}

	
}
