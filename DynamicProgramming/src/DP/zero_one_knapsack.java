package DP;

import java.util.Arrays;

public class zero_one_knapsack {
	//static int[][] t = new int[4][4] ;
	
	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
  
        System.out.println(knapSack1(W, wt, val, n));
       // System.out.println(t[4][4]);
	}
	static int knapSack1(int W, int wt[], int val[], int N)
	{  
	     
	    // Declare the table dynamically
	    int dp[][] = new int[N + 1][W + 1]; 
	     
	    // Loop to initially filled the 
	    // table with -1 
	    for(int i = 0; i < N + 1; i++)   
	        for(int j = 0; j < W + 1; j++)   
	            dp[i][j] = -1;    
	     int x = knapSack(W, wt, val, N, dp); 
	     
	     for(int i = 0; i < N + 1; i++) {  
		        for(int j = 0; j < W + 1; j++)  {
		            System.out.println(dp[i][j]+" "); 
		        }
		        System.out.println();
	     }
	    return x;
	}
	private static int knapSack(int w, int[] wt, int[] val, int n,int[][] t) {
		if(w==0||n==0) {
			return 0;
		}
		if(t[n][w]!=-1) {
			return t[n][w];
		}
		if(wt[n-1]<=w) {
			return t[n][w]= Math.max(val[n-1]+knapSack(w-wt[n-1],wt,val,n-1,t), knapSack(w,wt,val,n-1,t));
		}
		else 
			return t[n][w]=  knapSack(w,wt,val,n-1,t);
		
	}

}
