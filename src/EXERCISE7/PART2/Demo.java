package EXERCISE7.PART2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserHistory tabOne=new BrowserHistory();
		tabOne.visit("facebook.com");
		tabOne.visit("gggsgs.com");
		tabOne.visit("aaaa.in");
		tabOne.visit("youtube.com");
		tabOne.visit("facebook.org");
		
		tabOne.search("co");
		System.out.println();
		
		tabOne.size("s");
		System.out.println();
		
		tabOne.search("fac");
		System.out.println();
		
		tabOne.deleteHistory("facebook.com");
		tabOne.search("com");
	}

}
