package EXERCISE9;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	Browser tab=new Browser();
	tab.visit("Google.com");
	tab.visit("Youtube.com");	
	tab.visit("facebook.com");
	Thread readHelper=new Thread(new ReadHelper());
	Thread deleteHelper=new Thread(new DeleteHelper());
	readHelper.start();
	readHelper.join();
	deleteHelper.start();
	deleteHelper.join();
    tab.visit("google.com");
    readHelper=new Thread(new ReadHelper());
    readHelper.start();
    //Or we can (use isAlive fn to check whether the thread is alive) or using synchronized methods or by synchronizing the list itself 
	}

}
class DeleteHelper implements Runnable {
	
	
	@Override
	public void run() {
		System.out.println();
		Browser.history.clear();		
		System.out.println("history cleared"); 
		System.out.println();
	}
	
}
class ReadHelper implements Runnable {
	
	@Override
	public void run() {
		System.out.println();
		System.out.println("Reading History");
		for(String e :Browser.history) {
			System.out.println(e);
		}
		System.out.println();
	}
	
}

