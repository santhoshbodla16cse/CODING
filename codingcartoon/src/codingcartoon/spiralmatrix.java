package codingcartoon;

public class spiralmatrix {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiralview(a);
	}

	private static void spiralview(int[][] a) {
		int i=0;
		int r = a.length;
		int c = a[0].length;
		int k=0,l=0;
		while(k<r&&l<c) {
		for(i=l;i<c;i++) {
			System.out.print(a[k][i]+" ");
		}
		k++;
		for(i=k;i<r;i++) {
			System.out.print(a[i][c-1]+" ");
		}
		c--;
		
		if(k<r) {
			for(i=c-1;i>=l;i--) {
				System.out.print(a[r-1][i]+" ");
				
			}
			r--;
		}
		if(l<c) {
			for(i=r-1;i>=k;i--) {
				System.out.print(a[i][l]+" ");
				
			}
			l++;
		}
		
		}
		
	}

}
