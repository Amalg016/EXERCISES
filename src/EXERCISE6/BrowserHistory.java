package EXERCISE6;

import java.util.ArrayList;

public class BrowserHistory {
String currentUrl;
int currentNo;
ArrayList<String> history=new ArrayList<String>();
	

    public BrowserHistory(String homepage) {
		currentUrl=homepage;
	}
	
	void visit(String url) throws InvalidURLException{
		if(url.endsWith(".com")||url.endsWith(".in")||url.endsWith(".org")) {			
			currentUrl=url;
			history.add(url);
			currentNo=history.size()-1;	
		}
		else {
			throw new InvalidURLException("Invalid url extension");
		}
	}
     
	String back(int steps) throws NoHistoryFoundException{
		int n=currentNo-steps;
		if(n>=0) {
			currentNo=n;
			return history.get(n);
		}
		currentNo=0;
		throw new NoHistoryFoundException("No History Found");
//		return  history.get(currentNo);
	}
	
	String forward(int steps)throws NoHistoryFoundException {
		int n=currentNo+steps;
		if(n<history.size()) {
			currentNo=n;
			return history.get(n);
		}	
		
		throw new NoHistoryFoundException("No History Found");
	//	return history.get(history.size()-1); 
	}
	
	String get(int position) throws Exception {
		if(position>=history.size()) {
			throw new Exception("Invalid position");
		}
		if(position<0) {		
			throw new InvalidPositionException("Provide only positive values");
		}
		return history.get(position);
	}
	
}
