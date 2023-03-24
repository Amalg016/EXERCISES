package EXERCISE7.PART1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class BrowserHistory {

	private static Stack<String> stackUrl=new Stack<>();
	private static ArrayList<String> arrayUrl=new ArrayList<>();
	private static LinkedList<String> linkedUrl=new LinkedList<>();
	private static Vector<String>vectorUrl=new Vector<>();
    
	private static HashSet<String> hashUrl = new HashSet<>();
	private static LinkedHashSet<String> linkedHashUrl = new LinkedHashSet<>();
	private static TreeSet<String> treeUrl = new TreeSet<>();
    
    public void visit(String url) {
		stackUrl.add(url);
		arrayUrl.add(url);
        linkedUrl.add(url);
        vectorUrl.add(url);
        hashUrl.add(url);
        linkedHashUrl.add(url);
        treeUrl.add(url);
	}
	
	public void Sort() {
	Collections.sort(stackUrl);
	Collections.sort(arrayUrl);
	Collections.sort(linkedUrl);
	Collections.sort(vectorUrl);
	TreeSet<String> hashHelper = new TreeSet<String>(hashUrl);
	hashUrl.clear();
	hashUrl.addAll(hashHelper);
	TreeSet<String> linkedHashHelper = new TreeSet<String>(linkedHashUrl);
	linkedHashUrl.clear();
	linkedHashUrl.addAll(linkedHashHelper);
	
	//TreeSet is already sorted
	
	for (String i:arrayUrl) {
		System.out.println(i);
	}
	}
	
	public void deleteHistory(int index) {
		stackUrl.remove(index);
		arrayUrl.remove(index);
		linkedUrl.remove(index);
		vectorUrl.remove(index);
		remove(index,hashUrl);
		remove(index,linkedHashUrl);
		remove(index,treeUrl);
	}
	
	private void remove(int index,Set<String> set) {
		 ArrayList<String> list = new ArrayList<String>(set);	
		 list.remove(index);
		 set.clear();
		 set.addAll(list);
	}
	
	private void remove(String url,Set<String> set) {
		 ArrayList<String> list = new ArrayList<String>(set);	
		 list.remove(url);
		 set.clear();
		 set.addAll(list);
	}
	
	public void deleteHistory(String url) {
		stackUrl.remove(url);
		arrayUrl.remove(url);
		linkedUrl.remove(url);
		vectorUrl.remove(url);
		remove(url,hashUrl);
		remove(url,linkedHashUrl);
		remove(url,treeUrl);
	}
		
	public void fetchHistory() {

		for(String i: arrayUrl) {
    	System.out.println(i);
		}
	}
	public void search(String extension) {
		for(String i: arrayUrl) {
	    	if(i.endsWith(extension)) {
	    		System.out.println(i);	    		
	    	}
	    }	
	}
	
	public void size() {
		System.out.println(arrayUrl.size());
	}
	
	public void updateHistory(String url,int index) {
		add(url,index,linkedUrl);
		add(url,index,vectorUrl);
		add(url,index,stackUrl);
		add(url,index,arrayUrl);
		add(url,index,hashUrl);
		add(url,index,linkedHashUrl);
		add(url,index,treeUrl);
	}
	
	private void add(String url,int index,Collection<String> set) {
		 String b[]=set.toArray(new String[set.size()]);
		 b[index]=url;
		 set.clear();
		 Collections.addAll(set,b);
	}
}
