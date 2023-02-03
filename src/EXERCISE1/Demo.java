package EXERCISE1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] d= {"s","d"};
        Browser b=new Browser();
        b.visit("Sss");
        b.getUrls();
        Browser a=new Browser(d);
        a.getUrls();
	}

}
