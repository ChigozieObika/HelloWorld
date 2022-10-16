package com.bptn.courseweek4;


import java.io.*;  
import java.util.*;  
class SerializationExample {  

	public static void main(String [] args)  
	{  
		ArrayList<String> al = new ArrayList<String>();  
		al.add("Ravi");    
		al.add("Vijay");    
		al.add("Ajay");    

		try  
		{  
			//Serialization  
			FileOutputStream fos = new FileOutputStream("file");  
			ObjectOutputStream oos = new ObjectOutputStream(fos);  
			
			oos.writeObject(al);  
			
			fos.close();  
			oos.close(); 
			
			//Deserialization  
			FileInputStream fis=new FileInputStream("file");  
			ObjectInputStream ois=new ObjectInputStream(fis);  
			
			ArrayList  list=(ArrayList)ois.readObject();  //Deserialization happens here
			
			System.out.println(list);    
		
		}catch(Exception e)  
		
		{  
			System.out.println(e);  
		}  
	}  
}         