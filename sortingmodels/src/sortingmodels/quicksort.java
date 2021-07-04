package sortingmodels;

public class quicksort {

	public static void main(String[] args) {
		int[] a = {9,8,7,6};
		int low = 0;
		int high = a.length-1;
		quicksortpartition(a,low,high);
		printarray(a);

	}

	private static int quicksort1(int[] a, int l, int r) {
		
		int pivot = a[l];
		
		while(l<r) {
		while(a[l]<pivot) {
			l++;
		}
		while(a[r]>pivot) {
			r--;
		}
		if(l<r) {
			//swap(a[l],a[r]);
			a[l]=a[l]^a[r]^(a[r]=a[l]);
			
		}
		}
		pivot = pivot^a[r]^(a[r]=pivot);
		return r;
	}
	static void quicksortpartition(int[] a, int l, int h) {
		
		
		//int l=0,r=length-1;
		if(l<h) {
			int par = quicksort1(a,l,h);
			
			quicksortpartition(a,l,par-1);
			quicksortpartition(a,par+1,h);
			
		}
		
	}
	static void printarray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
