package codingcartoon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
public class Test4 {
//find duplicates
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0;i<n;i++)
	{
		a[i] = sc.nextInt();
		
	}
	
	findduplicates(a,n);

	}

private static void findduplicates(int[] a, int n) {
	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	for(Integer i : a) {
		if(map.containsKey(i))
		{
			map.put(i, map.get(i)+1);
		}
		else {
			map.put(i, 1);
		}
	}
	Iterator<Map.Entry<Integer,Integer>> itr  = map.entrySet().iterator();
	while(itr.hasNext())
	{
	Map.Entry<Integer, Integer>	entry = itr.next();
	System.out.print("key =" + entry.getKey());
	System.out.println("value =" + entry.getValue());
	if(entry.getValue()>1)
	{
		System.out.println("duplicates exits for"+ entry.getKey() );
	}
	}
	
}

}
