package EXERCISE1;

import java.util.ArrayList;

public class Browser {
	//String[] urls;
   private static ArrayList urls=new ArrayList<String>();
   
	public Browser()
	{	
		//
	}
	
	public void setUrls(String[] s)
    {
		for(int i=0;i<s.length;i++) {
			urls.add(s[i]);	
		}					
	}
	
    public void visit(String s) {
    	urls.add(s);
    	System.out.println("Visiting the url:"+s);
    }
    
    public String[] getUrls() {
    	String[] k=new String[urls.size()];
   	    System.out.println();
   	    System.out.println("Showing BrowserHistory");
    	for(int i=0; i<urls.size();i++) {
    	 k[i]=(String)urls.get(i);
    	 System.out.println(k[i]);
    	}
    	return k;
    }
    
}
