package EXERCISE7.PART2;

public class Demo {

	public static void main(String[] args) {

		BrowserHistory tabOne=new BrowserHistory();
		//tabOne.visit("facebook.com");
		tabOne.visit("Desk.Zoho.com");
		tabOne.visit("Zoho.com");
		
		tabOne.search("co");
		System.out.println();
		
		tabOne.size("com");
		System.out.println();
		
		tabOne.search("fac");
		System.out.println();
		
		//tabOne.deleteHistory("com");
		tabOne.search("com");
	}

}
