
public class firstandlastoccurence {

	public static void main(String[] args) {
		int[]  a = {1,2,3,4,10,10,10,10,17,18};
		int s=10;
		//we need to find first and last ocuurence of numb 10
		int f = fandlsearch1(a,s,0,a.length);
		int l = fandlsearch2(a,s,0,a.length);
		System.out.println("first occc is "+ f +" last occ is "+ l);
	}

	private static int fandlsearch1(int[] a, int s, int l, int r) {
		if(r>l)
		{
			int mid = l + (r-l)/2;
			if(a[mid]==s)
			{
				if(a[mid-1]!=s) {
				//System.out.println("first occ is "+mid);
				return mid;
				}
				else
				{
					return fandlsearch1(a,s,l,r-1);
				}
				
			}
			else if(a[mid]>s)
			{
				return fandlsearch1(a,s,l,mid-1);
			}
			else
			{
				return fandlsearch1(a,s,mid+1,l);
			}
			
			
		}
		else
			return -1;
		
	}
	private static int fandlsearch2(int[] a, int s, int l, int r) {
		if(r>l)
		{
			int mid = l + (r-l)/2;
			if(a[mid]==s)
			{
				if(a[mid+1]!=s) {
				//System.out.println("first occ is "+mid);
				return mid;
				}
				else
				{
					return fandlsearch2(a,s,l+1,r);
				}
				
			}
			else if(a[mid]>s)
			{
				return fandlsearch2(a,s,l,mid-1);
			}
			else
			{
				return fandlsearch2(a,s,mid+1,l);
			}
			
			
		}
		else
			return -1;
		
	}

}
