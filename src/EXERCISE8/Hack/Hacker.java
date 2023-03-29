package EXERCISE8.Hack;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Hacker {

	static Path fileName;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Browser.visit("facebook.com");
		Browser.visit("spotify.com");
		Browser.visit("google.com");

		try {

			Field field=Browser.class.getDeclaredField("history");	    
			field.setAccessible(true);
	    
			List<String> historyCopy=(List<String>)field.get(null);	       	 
        	 fileName=Paths.get("output.txt"); 

        	 //Writing to .txt
        		    Write(historyCopy);
        	 {
        		    //Reading the text file
        		    List<String> a=Read();
                    
        		    //Modifying the history in .txt
        		    a.add("youtube.com");
        		    Write(a);
        	 }
        		    //setting that history in browser class
        		    historyCopy.clear();
        		    List<String> a=Read();
        		    historyCopy.addAll(a);
        		    
        	 }
		catch (Exception e) {   
			e.printStackTrace();
		}
	}

	static void Write(List<String> historyCopy) {
		 try {
 		    Files.write(fileName, historyCopy); 		    
 		    System.out.println("Writing to : "+fileName.toFile().getAbsolutePath());
 	 } catch (Exception e) {
 		    e.printStackTrace();
 		}
	}
	
	static List<String> Read() {
		 try { 
			 List<String> a=Files.readAllLines(fileName);	  
			 return a;
	 		  //  System.out.println(fileName.toFile().getAbsolutePath());
	 	 } catch (Exception e) {
	 		    e.printStackTrace();
	 		}
		 return null;
	}
}
