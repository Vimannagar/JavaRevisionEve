package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {
	
	public static void main(String[] args) throws IOException 
	{
		
		
		String path = "F:\\Desktop\\Chinchwad\\Agenda - 2.docx";
		
		FileInputStream fis = new FileInputStream(path);
		
	}

}
