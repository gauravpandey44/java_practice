package IO;

import java.io.File;
import java.io.IOException;

public class InputOuputExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			File f1=new File("/home/gaurav");
			File f2=new File("/home/gaurav/abc.txt");
			File tmp;
			for(String c : f1.list()) {
			
				tmp=new File(f1,c);
				if(tmp.isDirectory()) {
					
					System.out.println(c+" is a Directory");
					
				}
				else {
					
					System.out.println(c+" is a File");
				}
				
				
				
			}
			
			System.out.println(f2.length());
			
			
		
			
			
		
	}

}
