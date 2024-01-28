package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Set<Integer> set=new LinkedHashSet<Integer>(list);
		System.out.println(set);
		Integer[] A = {22, 45,33, 66, 55, 34, 77};  
		 Set<Integer> set1 = new HashSet<Integer>();   
		 //convert array to List using Arrays.asList() method
	     set1.addAll(Arrays.asList(A));  
	     System.out.println(set1);
		
	}

}
