package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategory {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		String path = "F:\\Dekjshkjhkjshhfkjsktop\\Chinchwad\\Agenda - 2.docx";
		
		FileInputStream fis = new FileInputStream(path);
		
		System.out.println("last line");
		
		
	}

}
