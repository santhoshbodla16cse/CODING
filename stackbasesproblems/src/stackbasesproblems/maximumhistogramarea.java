package stackbasesproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class maximumhistogramarea {

	public static void main(String[] args) {
		
		int []a = {6,2,5,4,5,1,6};
		int width = 1;
		int[] a1 = nsr(a,a.length);
		int[] a2 = nsl(a,a.length);
		int res[] = new int[a.length];
		int max=0;
		for(int i=0;i<a.length;i++) {
		res[i] = (a1[i]-a2[i]-1)*a[i];
		//System.out.println(res[i]);
		if(max<res[i]) {
			max=res[i];
		}
		}
//		for(int i=0;i<a.length;i++)
//			System.out.print(" "+a2[i]);
		System.out.println(max);

	  }	
	

	private static int[] nsr(int[] a, int length) {
		
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> si = new Stack<Integer>();
		int []res = new int[length];
		for(int i=length-1;i>=0;i--)
		{
			if(s.isEmpty()==true) {
				res[i]=-1;
			}
			else if(s.isEmpty()!=true && s.peek()<a[i]) {
				res[i]=si.peek();
				//System.out.println(res[i]);
			}
			else if (s.isEmpty()!=true&&s.peek()>=a[i]) {
				while(s.isEmpty()!=true) {
					if(s.peek()>=a[i]) {
						s.pop();
						si.pop();
					}
					else
					{
						res[i]=si.peek();
						//res[i]=Arrays.binarySearch(a, s.peek());
					//	System.out.println(res[i]);
						break;
					}
					
				}
				if(s.isEmpty()==true) {
					res[i]=-1;
				}
			}
			s.push(a[i]);
			si.push(i);
		}
		
		
		
		return res;
	}

	private static int[] nsl(int[] a, int length) {
		
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> si = new Stack<Integer>();
		int []res = new int[length];
		for(int i=0;i<length;i++)
		{
			if(s.isEmpty()==true) {
				res[i]=-1;
			}
			else if(s.isEmpty()!=true && s.peek()<a[i]) {
				res[i]=si.peek();
			}
			else if (s.isEmpty()!=true&&s.peek()>=a[i]) {
				while(s.isEmpty()!=true) {
					if(s.peek()>=a[i]) {
						s.pop();
						si.pop();
					}
					else
					{
						res[i]=si.peek();
						break;
					}
					
				}
				if(s.isEmpty()==true) {
					res[i]=-1;
				}
			}
			s.push(a[i]);
			si.push(i);
		}
		return res;
	}

}
