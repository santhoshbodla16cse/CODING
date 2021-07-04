
public class medianintwosortedarray {

	public static void main(String[] args) {
		int[]  a1 = {1,2,3,4,5,6,7};
		int [] a2 = {8,9,10,11};
		
		int res = solve(a1,a2);
		System.out.println(res);
	}

	private static int solve(int[] a1, int[] a2) {
		int a1_mid = a1.length/2;
		int a2_mid = a2.length/2;
		
		if(a1.length==0 )
			return a2[a2_mid];
		if(a1_mid<a2_mid) {
			
		}
		
		return 0;
	}

}
