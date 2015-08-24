package IO;

import java.io.File;
import java.io.IOException;

public class InputOuputExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("abc.txt");
			System.out.println(f.exists());
			
				f.createNewFile();
				String sep=File.separator;
			File f2=new File(sep+"Users/gp1384.ATTAPA.DOM/Documents/Eclipse/java_practice/abc2.txt");
			//f2.createNewFile();
			
			System.out.println(f2.exists());
			System.out.println(File.separator);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			
		
	}

}
