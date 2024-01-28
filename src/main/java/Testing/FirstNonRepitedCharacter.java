package Testing;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepitedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="eononysysev";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);				
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		for(Map.Entry m:map.entrySet()) {
			int count=(int) m.getValue();
			if(count==1) {
				System.out.println("First Non repeted character is "+m.getKey());
				break;
			}
		}
	}

}
