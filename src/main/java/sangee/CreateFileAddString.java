package sangee;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFileAddString {
	public static void main(String args[])  
	{  
	try  
	{  
	Scanner sc=new Scanner(System.in);         //object of Scanner class  
	//System.out.print("Enter the file name: ");  
	//String name=sc.nextLine();              //variable name to store the file name  
	FileOutputStream fos=new FileOutputStream("arunm.txt");  // true for append mode  
	System.out.print("Enter file content: ");         
	String str=sc.nextLine()+"\n";      //str stores the string which we have entered  
	byte[] b= str.getBytes();       //converts string into bytes  
	fos.write(b);           //writes bytes into file  
	fos.close();            //close the file  
	System.out.println("file saved.");  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();          
	}  
	}  
 

}
