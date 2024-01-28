package Testing;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		map.put('a', 5);
		map.put('b', 3);
		map.put('a', 3);

		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}

}
