package EXERCISE2;

public class Demo {

	public static void main(String[] args) {
		Browser tabOne= new GoogleChrome();
		Browser tabTwo= new Firefox();
		Browser tabThree= new Firefox();
		Browser tabFour= new GoogleChrome();
		Browser tabFive= new GoogleChrome();
	
		
		
		
		//Checking overloading fns in chrome
		GoogleChrome chrome=(GoogleChrome)tabOne;
		chrome.setPermissions(Permission.camera, true);
		chrome.setPermissions(true, true, true);
		
		
		
		
		
		Browser[] allBrowsers = new Browser[5];
		allBrowsers[0]=tabOne;
		allBrowsers[1]=tabTwo;
		allBrowsers[2]=tabThree;
		allBrowsers[3]=tabFour;
		allBrowsers[4]=tabFive;
		int count=0;
		for(Browser i:allBrowsers) {		
				if(i.getClass().getSimpleName().equals("GoogleChrome")) {
					count++;
				}
		}
		System.out.println("No. of googleChromes in the Array = "+count);

	
	
	
	
	}

}
