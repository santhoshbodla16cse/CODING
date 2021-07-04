package DP;

public class EqualSumPartitioning {

	public static void main(String[] args) {
		int a[] = {5,5,5,11,4};
		int  sum = 0;
		for(Integer i : a) {
			sum+=i;
		}
		if(sum%2!=0)
			System.out.println(0);
		else
		System.out.println(knapsack1(a,a.length,sum/2));

	}

	private static int knapsack1(int[] a,int n, int w) {
		int t[][] = new int[n+1][w+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				//if(i==0 || j==0)
				t[i][j]=-1;
				//System.out.print(t[n][w]+" ");
			}
			//System.out.println();
		}
		int x = knapSack(a,n,w,t);
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				//t[i][j]=false;
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		return x;
	}

	private static int knapSack(int[] a, int n,int w, int[][] t) {
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<w+1;j++)
			{
				if(i==0)
				t[i][j]=0;
				
				if(j==0)
					 t[i][j]=1;
				
				
			}
		}
		
	
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<w+1;j++)
			{
				if(a[i-1]<=j) {
					t[i][j] = Math.max(t[i-1][j-a[i-1]], t[i-1][j]);
				}
				else
					t[i][j]=t[i-1][j];
				
			}
		}
		return t[n][w];
	}

}
