package DP;

public class subsetsumproblem {

	public static void main(String[] args) {
		int a[] = {2,3,7,8,10};
		int n = a.length;
		int W = 15;
		System.out.println(knapsack1(a,n,W));
		
	}

	private static int knapsack1(int[] a, int n, int w) {
		int [][] t = new int[n+1][w+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++ )
				//if(i==0 || j==0)
					t[i][j]=-1;
		}
		int x = knapSack(a,n,w,t);
		for(int i =0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		return t[n][w];
	}

	private static int knapSack(int[] a, int n, int w, int[][] t) {
		if(w==0)
			return 1;
		
		if(n==0) {
			return 0;
		}
		if(n==0 && w==0)
			return 1;
		if(t[n][w]!=-1)
			return t[n][w];
		
		if(a[n-1]<=w) {
			return t[n][w]=Math.max(knapSack(a,n-1,w-a[n-1],t),knapSack(a,n-1,w,t) );
		}
		else
			return t[n][w]=knapSack(a,n-1,w,t);
	}

}
