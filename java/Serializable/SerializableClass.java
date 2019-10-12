package Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableClass  {
	public static void main(String[] args) throws IOException {
		Emp emp=new Emp();
		emp.name="kiran";
		emp.id=123;
		FileOutputStream fos=new FileOutputStream("F:\\Selenium\\Java\\Serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		fos.close();

 
	}
	

}
