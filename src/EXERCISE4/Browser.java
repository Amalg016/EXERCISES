package EXERCISE4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Browser {

	public static ArrayList<String> urls=new ArrayList<>();
	
	public void visit(String url) {
		for(int i =0;i<urls.size();i++) {
			StringTokenizer l=new StringTokenizer(urls.get(i)," ## ");
			String site=l.nextToken();
			if(site.equals(url)) {
				int count =Integer.parseInt(l.nextToken());
				urls.set(i,site+" ## "+(++count));
				return;				
			}
		}
		urls.add(url+" ## 1");    //first time saving the url
	}
}
