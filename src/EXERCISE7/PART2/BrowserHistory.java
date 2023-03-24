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

    Map<String,List<String>> hashUrl=new HashMap<>();
    Map<String,List<String>> treeUrl=new TreeMap<>();
    Map<String,List<String>> linkedUrl=new LinkedHashMap<>();

    public void visit(String url) {

    	String[] parts=url.split("[.]");
    	if(parts.length > 1)
    	{		 		
		    String extension= parts[parts.length-1];
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
	
	public void deleteHistory(String extension) {       
  		   
		if(hashUrl.containsKey(extension)) { 
			hashUrl.remove(extension);
			treeUrl.remove(extension);
			linkedUrl.remove(extension);
		}  		     		
	}
	
	public void fetchHistory(String extension) {
		for(String i: hashUrl.get(extension)) {
	    	System.out.println(i);
		}
	}
	
	public void search(String searchWord) {
		for( Entry<String,List<String>> i: hashUrl.entrySet()) {
	    List<String> list=i.getValue();
		for(String j:list) {
			if(j.contains(searchWord)) {
				System.out.println(j);	    						
			}
		}
	    	
	    }	
	}
	
	public void size(String extension) {
		List<String> list=hashUrl.get(extension);
		if(list!=null) {
			System.out.println(list.size());		
		   return;
		}
		System.out.println(0);		
	}
	
}
