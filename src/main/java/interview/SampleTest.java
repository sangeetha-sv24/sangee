package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sangeethaass";
		/*HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry m:map.entrySet()) {
			int temp=(int) m.getValue();
			if(temp>1) {
				System.out.println(m.getKey());
			}
		} */
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count>1)
				set.add(str.charAt(i));
		}
		System.out.println(set);

	}

}
