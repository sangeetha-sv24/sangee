package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="hhkpphhhyyiuyy";
		String str="hyyhyy";
		char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(charArray);
	      Set<Character> ch=new HashSet<Character>();
		System.out.println(str.length());
		//hh = 3 ,pp = 1, yy = 2
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int i=0;
		for(;i<str.length();i++) {
			char val=str.charAt(i);
			int count=0;
			for(int j=i;j<str.length();j++) {
				if(j<str.length()-2) {
					if(str.charAt(j)==val&&str.charAt(j+1)==val) {
						count++;
					}
				}
				
			}
			if(i==str.length()-2) {
				if(str.charAt(i)==val&&str.charAt(i+1)==val)
					count++;
			}
			
			if(map.containsKey(val)) {
				val=val;
			}else{
				if(count!=0)
					map.put(val,count);	
			}
			
//			System.out.println(val+" occurance is "+count);
//			
//			while(i<str.length()-2 && str.charAt(i+1)==val) {
//				
//				i++;
//			}
//			
		}
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
