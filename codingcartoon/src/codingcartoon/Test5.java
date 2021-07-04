package codingcartoon;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		int a[] = {1,4,5,5,6,6,6,2,3,3,12,1,2,123};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int k=0;
		Arrays.sort(a);
		int prev =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=prev)
			{
				prev =a[i];
				
			}
			else {
				a[i]=0;
				
			}
		}
		System.out.println("after rem duplicates");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			System.out.println(a[i]);
		}
	}

}
