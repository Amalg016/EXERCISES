package EXERCISE8.Hack;

import java.util.ArrayList;
import java.util.List;

public class Browser {

	private static List<String> history=new ArrayList<>();

	static void visit(String url) {
		history.add(url);
	}
}
