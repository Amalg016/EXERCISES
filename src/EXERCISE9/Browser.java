package EXERCISE9;
import java.util.ArrayList;
import java.util.List;


public class Browser {
	static List<String> history=new ArrayList<>();

	public void visit(String url) {
		System.out.println("Visting : "+url);
		history.add(url);		
	}
	
	public void delete() {
		history.clear();
	}
	
}
