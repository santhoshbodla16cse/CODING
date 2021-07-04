package recursion;

import java.util.Stack;

public class removemiddleinstack {

	public static void main(String[] args) {
		Stack<Integer>  s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		int l = s.size();
		removemiddle(s,l);
		
		System.out.println(s);

	}

	private static void removemiddle(Stack<Integer> s,int l) {
		if(s.isEmpty())
			return;
		
		int n = s.size();
		int x = s.pop();
		
		removemiddle(s,l);
		
		if(n==(l/2)+1) {
			return;
		}
		s.push(x);
		
	}

}
