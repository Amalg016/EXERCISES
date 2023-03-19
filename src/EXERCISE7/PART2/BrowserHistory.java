package EXERCISE7.PART2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BrowserHistory {

    Map<String,List<String>> hashUrl=new HashMap<String,List<String>>();
    Map<String,List<String>> treeUrl=new TreeMap<String,List<String>>();
    Map<String,List<String>> linkedUrl=new LinkedHashMap<String,List<String>>();

    public void visit(String url) {

    	if(url.contains(".")) {		
    		StringTokenizer tk=new StringTokenizer(url,".");
		    tk.nextToken();
		    String extension=tk.nextToken();
		    if(hashUrl.containsKey(extension)) {
		    	hashUrl.get(extension).add(url);
		    	treeUrl.get(extension).add(url);
		    	linkedUrl.get(extension).add(url);
		    }
		    else {
		    List<String> list1=(new ArrayList<String>());
		    List<String> list2=(new ArrayList<String>());
		    List<String> list3=(new ArrayList<String>());
		    list1.add(url);
		    list2.add(url);
		    list3.add(url);
		    hashUrl.put(extension,list1);
		    treeUrl.put(extension, list2);
		    linkedUrl.put(extension, list3);
		    }    
    	}
    }
	
	public void deleteHistory(String url) {
    	if(url.contains(".")) {		
    		StringTokenizer tk=new StringTokenizer(url,".");
    		  tk.nextToken();
  		    String extension=tk.nextToken();
             
  		    if(hashUrl.containsKey(extension)) {
  		    	List<String> list1=hashUrl.get(extension);
  		    	List<String> list2=linkedUrl.get(extension);
  		    	List<String> list3=treeUrl.get(extension);
  		    
  		    	list1.remove(url);
  		    	list2.remove(url);
  		    	list3.remove(url);
  		    }  		    
    	}	
	}
	
	public void fetchHistory(String extension) {
		for(String i: hashUrl.get(extension)) {
	    	System.out.println(i);
		}
	}
	
	public void search(String searchWord) {
		for( Entry i: hashUrl.entrySet()) {
	    List<String> list=(List<String>) i.getValue();
		for(String j:list) {
			if(j.contains(searchWord)) {
				System.out.println(j);	    						
			}
		}
	    	
	    }	
	}
	
	public void size(String extension) {
		List list=hashUrl.get(extension);
		if(list!=null) {
			System.out.println(list.size());		
		   return;
		}
		System.out.println(0);		
	}
	
}
