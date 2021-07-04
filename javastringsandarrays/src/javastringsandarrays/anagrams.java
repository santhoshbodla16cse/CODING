package javastringsandarrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class anagrams {

	public static void main(String[] args) {
		String s1 = "abbc";
		char[] ch1 = s1.toCharArray();
		String s2 = "cabb";
		char[]  ch2 = s2.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		boolean b = Arrays.equals(ch1, ch2);
//		if(b==true)
//			System.out.println("Both are anagrams");
//		else
//			System.out.println("not anagrams");
		
		Map<Character,Integer> map = new HashMap<Character ,Integer>();
		for(Character ch : ch1) {
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		checkforanagrams(ch2,map);
	}

	private static int checkforanagrams(char[] ch2, Map<Character, Integer> map) {
		for(Character ch : ch2) {
			if(map.containsKey(ch)&&map.get(ch)>0)
			{
				map.put(ch, map.get(ch)-1);
			}
			else
			{
				System.out.println("not anagarams");
				return -1;
			}
		}
		System.out.println("Both are anagrams");
		return -1;
	}

}
