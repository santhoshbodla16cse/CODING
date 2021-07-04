package recursion;

public class sortarray {
	public static void main(String args[]) {
		int a[] = {8,3,7,5,1,9};
		recursivelysort(a,a.length);
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void recursivelysort(int[] a, int l) {
		if(l==1) {
			return;
		}
		
		recursivelysort(a,l-1);
		
		for(int i=0;i<l-1;i++) {
			if(a[i]>a[l-1]) {
				a[i] = a[i]^a[l-1]^(a[l-1]=a[i]);
			}
		}
		
		
	}
}
