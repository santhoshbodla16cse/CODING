package javastringsandarrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class FrequencyOfANumber {

	public static void main(String[] args) {
		int a[] = {1,2,2,2,3,3,4,4,4,4,4,4,4,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(Integer i : a) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		mostfreqnumber(a,map);
		

	}

	private static void mostfreqnumber(int[] a, HashMap<Integer, Integer> map) {
		Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			//System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " is a multi freq number ");
			}
		}
		
	}

}
