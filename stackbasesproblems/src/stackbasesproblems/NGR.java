package stackbasesproblems;
import java.util.Stack;
public class NGR {

	public static void main(String[] args) {
		int []a = {2,3,4,2,1,6};
		Stack<Integer> s = new Stack<Integer>();
		int[] res = new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			if(s.isEmpty()==true) {
				res[i]=-1;
				//System.out.println("1"+res[i]);
			}
			else if(s.isEmpty()!=true&&s.peek()>=a[i]) {
				res[i] = s.peek();
				//System.out.println("2"+res[i]);
			}
			else if(s.isEmpty()!=true&&s.peek()<a[i])
			{
				while(s.isEmpty()!=true) {
					if(s.peek()<a[i]) {
						s.pop();
					}
					else {
						res[i]=s.peek();
						break;
						//System.out.println("3"+res[i]);
						//break;
					}
				}
				if(s.isEmpty()==true)
					res[i]=-1;
				//System.out.println("4"+res[i]);
			}
			s.push(a[i]);
			//System.out.println(a[i]);
		}
		for(int j =0;j<res.length;j++)
		{
			System.out.print(res[j]+" ");
		}

	}

}
