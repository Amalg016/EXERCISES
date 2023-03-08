package EXERCISE6;

import java.util.Scanner;

public class Demo {	
	static boolean exit=false; 
    static boolean started=false;	
    
    
	public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
		     BrowserHistory browser=new BrowserHistory("www.homepage.com");
	
		   while(!exit) {
			try {
		
				if(!started) {
					Log("Enter your action");
					started=true;				
				}
				else {
					Log("Enter your next action");					
				}
			   String name = scanner.nextLine();	
			
			   switch(name) {
			   case "visit":
				   Log("Enter the url");				
				   String url=	scanner.nextLine();
				   browser.visit(url);
				   break;
			   case "back":
				   Log("Enter the steps to go back");	
				   int steps=Integer.parseInt(scanner.nextLine());
				   browser.back(steps);
				   break;
				   
			   case "forward":
				   Log("Enter the steps to go forward");	
				   int step=Integer.parseInt(scanner.nextLine());
				   browser.back(step);
				 
				   break;
			   case "get":
				   Log("Enter the position");
				   int pos=Integer.parseInt(scanner.nextLine());
				   browser.get(pos);
				   break;
			   case "exit":
				   exit=true;
				   break;
			   }
				   
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		   }
		
	}
	
	static void Log(String msg) {
		System.out.println(msg);
	}
}
