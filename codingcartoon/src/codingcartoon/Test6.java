package codingcartoon;

import java.util.Set;
import java.util.HashSet;
public class Test6 {

	public static void main(String[] args) {
		int[] a = {1,3,2,0,2,1};
		int n=3;
		Set set = new HashSet(a.length);
		for(Integer i : a)
		{
			int target = n-i;
			if(!set.contains(target))
			{
				set.add(i);
			}
			else
			{
				System.out.println("(" + i + "," + target+")");
			}
		}

	}

}
