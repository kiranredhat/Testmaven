package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.*;
public class DeSerializableClass {
	public static void main(String[] args)  {
		Emp emp=null;
		try
		{
			FileInputStream fis=new FileInputStream("F:\\Selenium\\Java\\Serializable.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp=(Emp) ois.readObject();
			ois.close();
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Deserializing Employee....");
			System.out.println(emp.name);
			System.out.println(emp.id);
		}
		
	}

	

}
