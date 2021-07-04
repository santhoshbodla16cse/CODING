package slidingwindow;
import java.util.Arrays;
import java.util.Scanner;
public class maxsumsubarrayofsizek {

	public static void main(String[] args) {
int [] a = {-2,-3,4,-1,-2,1,5,-3};
//		int k=5;
//		System.out.println(solve(a,a.length,k));
		
		Scanner sc = new Scanner(System.in);
		String l1 = sc.nextLine();
		int n1 = Integer.parseInt(l1);
		String l2 = sc.nextLine();
		String[] s = l2.split(" ");
		int[]  res = new int[n1];
		int i=0;
		
		while(i<n1) {
			int k = Integer.parseInt(s[i]);
			res[i] = solve(a,a.length,k);
			i++;
			
		}
		for(i=0;i<n1;i++) {
			System.out.println(res[i]);
		}
		String fin = Arrays.toString(res);
		System.out.println(fin);

	}

	private static int solve(int[] a, int length, int k) {
		int max  = 0;
		
		for(int i=0;i<k;i++) {
			max+=a[i];
		}
		int sum = max;
		//System.out.println(sum);
		int p=0;
		int q = k;
		while(q<length) {
			sum =sum+ a[q];
			
			sum =sum-a[p];
			
			q++;
			p++;
			max = Math.max(max, sum);
		//System.out.println(sum);
		}
		return max;
	}

}
