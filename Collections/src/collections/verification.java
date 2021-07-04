package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class verification {
	public static void main(String args[]) {
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,2,3,4,5};
		solve(arr1,arr2,arr1.length,arr2.length,6);
	}

	private static void solve(int[] arr1, int[] arr2, int n, int m, int W) {
		Set<Integer> hmap = new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			hmap.add(arr1[i]);
		}
		for(int j=0;j<m;j++) {
			if(hmap.contains(W-arr2[j])) {
				System.out.println(W-arr2[j]+" "+arr2[j]);
			}
		}
		
	}
}
