package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("/home/gaurav/abc.txt");
		fw.write("Gaurav \n Pandey");
		fw.write('\n');
		fw.write("hello");
		//fw.flush();
		//fw.close();
		
		

	}

}
