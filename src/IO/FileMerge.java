package IO;

import java.io.*;
public class FileMerge {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 
		BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
		PrintWriter pw=new PrintWriter("Merge_of_file1_file2.txt");
		
		String s;
		while((s=br1.readLine())!=null ){
			
		pw.println(s);
			
		}
		pw.flush();
		br1.close();
		while((s=br2.readLine())!=null ){
			
			pw.println(s);
				
			}
		pw.flush();
		br2.close();
		pw.close();
		
		

	}

}
