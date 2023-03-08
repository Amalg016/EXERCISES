package EXERCISE6;

public class InvalidURLException extends Exception{
	public InvalidURLException(String msg){
		super(msg);
	}
}

class NoHistoryFoundException extends Exception{
	public NoHistoryFoundException(String msg){
		super(msg);
	}
}

class InvalidPositionException extends Exception{
	public InvalidPositionException(String msg) {
		super(msg);
	}
}