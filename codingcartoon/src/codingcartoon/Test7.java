package codingcartoon;

public class Test7 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {6,3,2,67,45,22};
		
		intersection(a,b,a.length,b.length);

	}

	private static void intersection(int[] a, int[] b, int m, int n) {
		int i=0;
		int j=0;
		int k=0;
		while(i<m&&j<n)
		{
			if(a[i]<b[j])
			{
				System.out.println("num is" + a[i]);
				i++;
			}
			else if(b[j]<a[i])
			{
				System.out.println("num is" + b[j]);
				j++;
			}else {
				
//				if(b[j]!=k)
//				{
				System.out.println("num is" + b[j]);
//				
//				}
//				k=b[j];
				j++;
				i++;
			}
		}
		
		//printing remaining elelments
		
		while(i<m)
		{
			System.out.println(a[i++]);
		}
		while(j<n)
		{
			System.out.println("num is" + b[j++]);
		}
		
	}

}
