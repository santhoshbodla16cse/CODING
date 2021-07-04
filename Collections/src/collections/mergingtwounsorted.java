package collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class mergingtwounsorted {

	public static void main(String[] args) {
		 int a[] = {10,20, 5, 15};
	       int  b[] = {20, 3, 2};
	       solve(a,b,a.length,b.length);

	}

	private static void solve(int[] a, int[] b, int n, int m) {
		SortedSet<Integer> ss = new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			ss.add(a[i]);
		}
		for(int i=0;i<m;i++) {
			ss.add(b[i]);
		}
		System.out.println(ss);
		
	}

}
