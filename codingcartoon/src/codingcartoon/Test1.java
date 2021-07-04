package codingcartoon;
import java.util.Scanner;
public class Test1 {
	public static void reverse(int a[], int i,int j) {
		if(i>j)
			return;
		else {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			reverse(a,++i,--j);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int [n];	
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			
		}
		reverse(a,n/2,n-1);
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
		
		}
		
		
	}


