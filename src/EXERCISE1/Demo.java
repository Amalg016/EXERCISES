package EXERCISE1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Browser b=new Browser();
        b.visit("Sss");
        b.getUrls();
        String[] d= {"s","d"};
        Browser a=new Browser();
        a.Set(d);
        a.getUrls();
	}

}
