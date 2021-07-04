package recursion;
import java.lang.Math;

public class kthsymbolingrammer {

	public static void main(String[] args) {
		int n=4,k=4;
		int res =solve(n,k);
		System.out.println(res);

	}

	private static int solve(int n, int k) {
		if(n==1 && k==1)
			return 0;
		
		int mid = (int) (Math.pow(2, n-1)/2);
		
		if(k<=mid)
			return solve(n-1,k);
		else {
			return 1-solve(n-1,k-mid);
		}
		
	}

}
