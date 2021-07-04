package codingcartoon;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"santhosh");
		map.put(2,"santhosh1");
		map.put(3,"santhosh2");
		keysetiteration(map);
	}

	private static void keysetiteration(Map<Integer, String> map) {
		for(Integer i : map.keySet()) {
			System.out.println("key = " + i);
			System.out.println("value = " + map.get(i));
		}
		
	}

}
