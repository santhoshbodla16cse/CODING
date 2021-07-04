package stackbasesproblems;

import java.util.Stack;

public class stockspanproblem {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		int a[] = {100, 80, 60, 70, 60, 75, 85};
		int[] res = new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(s.isEmpty()==true) {
				res[i] =1;
			}
			else if(s.isEmpty()!=true&&a[s.peek()]>a[i]) {
				res[i]=1;
			}
			else if(s.isEmpty()!=true&&a[s.peek()]<=a[i]) {
				res[i]=1;
				while(s.isEmpty()!=true) {
					if(a[s.peek()]<=a[i]){
					res[i] = res[s.peek()]+res[i];
					s.pop();
					}
					else
						break;
				}
				
				}
			s.push(i);
			}
		for(int i=0;i<a.length;i++) {
			System.out.print(res[i]+" ");
		}
		}

	}
