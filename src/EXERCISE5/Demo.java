package EXERCISE5;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
        //member inner class.
		Browser browser=new Browser();		
		Browser.Bookmarks bookmarks= browser.new Bookmarks();
	
	    //anonymous inner class.
		Browser shortcuts=new Browser() {
			static ArrayList<String> shortcut=new ArrayList<String>();		
		};	
		
		//static nested class.
	    Browser.History history=new Browser.History();
	}

}
