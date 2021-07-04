package recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class printuniquesubsets {

	public static void main(String[] args) {
		String in = "aab";
		String out ="";
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		printunique(in,out,hmap);
		Set<Map.Entry<String, Integer>> entrySet = hmap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet)
		{ 
			
				System.out.println(entry.getKey());
			}
			

	}

	

	private static void printunique(String in, String out,HashMap<String,Integer> hmap) {
		if(in.length()==0)
		{
			if(hmap.containsKey(out))
			{
				hmap.put(out,hmap.get(out)+1);
			}
			else
			{
				hmap.put(out, 1);
			}
			//System.out.println(out);
			return;
		}
		String  out1 = out;
		String  out2 = out;
		
		out2+=in.charAt(0);
		in = in.substring(1);
		
		printunique(in,out1,hmap);
		printunique(in,out2,hmap);
	}

}
