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
    
    //Or we can use isAlive fn to check whether the or using synchronized methods  
	}

}
class DeleteHelper implements Runnable {
	
	
	@Override
	public void run() {
		Browser.history.clear();		
	}
	
}
class ReadHelper implements Runnable {
	
	@Override
	public void run() {
		for(String e :Browser.history) {
			System.out.println(e);
		}
	}
	
}