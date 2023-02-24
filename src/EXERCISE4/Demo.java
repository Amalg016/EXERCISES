package EXERCISE4;

public class Demo {

	public static void main(String[] args) {

		Browser b=new Browser();
		b.visit("www.facebook.com");
		b.visit("www.facebook.com");
		System.out.println(Browser.urls.get(0));
	}

}
