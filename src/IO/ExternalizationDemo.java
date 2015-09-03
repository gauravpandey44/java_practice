package IO;


import java.io.*;
class Dog2 implements Externalizable {
	
	
	int i=1,j=2;
    int c=3;
    
    public Dog2()
    {
    	System.out.println("inside unparameterised Constructor of Dog2 ");
    }
    public void writeExternal(ObjectOutput oo)throws IOException {
    	
    	oo.writeObject(c);
    	
    }
    public void readExternal(ObjectInput oi) throws ClassNotFoundException, IOException {
    	
    	
        c=(Integer) (oi.readObject());
        
    }
   
    
	
}


public class ExternalizationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Dog2 d1=new Dog2();
		System.out.println("Before Serialization");
		System.out.println("i= "+d1.i+"\nj= "+d1.j+"\nj= "+d1.c);
		
		//ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ObjectfileDog2.txt"));
		
		//oos.writeObject(d1);
	    //oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ObjectfileDog2.txt"));
		Dog2 d2=(Dog2) ois.readObject();
		
		
		System.out.println("After Deserialization");
		System.out.println("i= "+d2.i+"\nj= "+d2.j+"\nj= "+d2.c);
		ois.close();
		
		
	}

}
