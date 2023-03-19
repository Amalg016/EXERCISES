package EXERCISE7.PART1;

public class Demo {

	public static void main(String[] args) {
		BrowserHistory tabOne=new BrowserHistory();
 
		tabOne.visit("facebook");
		tabOne.visit("instagram");
		tabOne.visit("youtube.com");
		tabOne.visit("facebook.com");
		
		tabOne.search("com");		
		System.out.println();
		
		tabOne.fetchHistory();
		System.out.println();
		
		tabOne.updateHistory("linkedIn", 0);
		tabOne.fetchHistory();
		System.out.println();
		
		tabOne.deleteHistory(0);
		tabOne.fetchHistory();
	}

}
