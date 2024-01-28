package Testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

Map<String,String> map=new HashMap<String,String>();

List<String> key=new ArrayList<String>();
List<String> value=new ArrayList<String>();
map.put("Title", "java");
map.put("absd", "sdsd");
for(Map.Entry m:map.entrySet()){

System.out.println((String)m.getKey()+" "+(String)m.getValue());
key.add((String) m.getKey());
value.add((String) m.getValue());

}
System.out.println(key);
System.out.println(value);

	}

}
