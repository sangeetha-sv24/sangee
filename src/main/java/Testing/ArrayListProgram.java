package Testing;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList(); 
		  
        // Add Strings to list 
        // each string represents student name 
        students.add("Ram"); 
        students.add("Mohan"); 
        students.add("Sohan"); 
        students.add("Rabi"); 
  
        // print result 
        System.out.println("list of Students:"); 
  
        // forEach method of ArrayList and 
        // print student names 
        students.forEach((n) -> System.out.println(n)); 
	}

}
