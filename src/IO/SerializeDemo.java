package IO;

import java.io.*;
class Dog implements Serializable {
	
	
	int i=10,j=20;
    static int c=300;
   
   
    
	
}

public class SerializeDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Dog d1=new Dog();
		System.out.println("Before Serialization");
		System.out.println("i= "+d1.i+"\nj= "+d1.j+"\nj= "+d1.c);
		
		//ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ObjectfileDog.txt"));
		
		//oos.writeObject(d1);
	//oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ObjectfileDog.txt"));
		Dog d2=(Dog) ois.readObject();
		
		
		System.out.println("After Deserialization");
		System.out.println("i= "+d2.i+"\nj= "+d2.j+"\nj= "+d2.c);
		ois.close();
		

	}

}
