package EXERCISE1;

import java.util.ArrayList;

public class Browser {
	//String[] urls;
   private static ArrayList urls;
   private static int no;

	public Browser()
	{
		if(no==0) {	
		urls=new ArrayList<String>();
		}
		no++;
	}
	
	public Browser(String[] s){
		if(no==0) {
			urls=new ArrayList();			
		}
		for(int i=0;i<s.length;i++) {
			urls.add(s[i]);
			//System.out.println(urls.get(i));
			no++;
		}			
	}
	
    public void visit(String s) {
    	urls.add(s);
    	System.out.println(s);
    }
    
    public String[] getUrls() {
    	String[] k=new String[urls.size()];
    	for(int i=0; i<urls.size();i++) {
    	 k[i]=(String)urls.get(i);
    	 System.out.println(k[i]);
    	}
    	return k;
    }
    
}
