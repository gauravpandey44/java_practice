package IO;

import java.io.*;


public class FileReaderDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileReader fw=new FileReader("/home/gaurav/abc.txt");
	
		fw.read();
		int ch;
		while((ch=fw.read()) != - 1)
		System.out.print((char)ch);

		
	}

}
