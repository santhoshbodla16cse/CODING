package DP;

public class Coinchange_min {

	public static void main(String[] args) {
		int a[] = {3,1,2,1};
		int v = 4;
		knapSack(a,a.length,v);
	}

	private static void knapSack(int[] a,int l, int v) {
		int t[][] = new int[l+1][v+1];
		for(int i=0;i<l+1;i++) {
			for(int j=0;j<v+1;j++) {
				if(i==0) {
					t[i][j]= Integer.MAX_VALUE-1; 
				}
				if(j==0) {
					t[i][j]=0;
				}
				if(i==0&&j==0)
					t[i][j]=0;
			}
		}
		
		for(int i=1;i<l+1;i++) {
			for(int j=1;j<v+1;j++) {
				if(a[i-1]<=j) {
					t[i][j] = Integer.min(t[i][j-a[i-1]]+1, t[i-1][j]);
				}
				else
					t[i][j] = t[i-1][j];
			}
			}
		System.out.println(t[l][v]);
	}

}
