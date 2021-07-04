
public class DescendingSortedArray {

	public static void main(String[] args) {
		int[] a= {10,9,8,7,6};
		int s=7;
		int ans = binarysearch(a,s,0,a.length-1);
		System.out.println(ans);
	}

	private static int binarysearch(int[] a, int s, int l, int r) {
		if(r>l)
		{
			int mid =l+(r-l)/2;
			if(a[mid]==s)
				return mid;
			else if(a[mid]>s)
				return binarysearch(a,s,mid+1,r);
			else
				return binarysearch(a,s,l,mid-1);
			
		}
		else
			return -1;
		
	}

}
