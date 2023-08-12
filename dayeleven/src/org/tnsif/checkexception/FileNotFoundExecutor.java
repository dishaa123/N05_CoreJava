package org.tnsif.checkexception;
/* Demonstrate on checked exception*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FilterInputStream;
public class FileNotFoundExecutor {

	public static void main(String[] args) {
		try {
		FileInputStream f = new FileInputStream("C:\\Users\\disha\\Downloads\\Dishaaher_resume.docx");
		System.out.println("file has found");
		}
		catch(FileNotFoundException e){
			System.out.println("File is not exit: "+e);
		}
	}

}
