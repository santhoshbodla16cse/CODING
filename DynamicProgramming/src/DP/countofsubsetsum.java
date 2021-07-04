package DP;

public class countofsubsetsum {

	public static void main(String[] args) {
		int a[] = {2,3,5,1};
		int sum =5;
		int l = a.length;
		subsetcount(a,l,sum);
	}

	private static void subsetcount(int[] a, int n, int w) {
		int[][] t = new int[n+1][w+1];
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
			for(int j=1;j<w+1;j++) {
				if(a[i-1]<=j) {
					t[i][j]=t[i-1][j-a[i-1]] + t[i-1][j];
				}
				else
					t[i][j]= t[i-1][j];
			}
		}
		System.out.println(t[n][w]);
	}

}
