package recursion;

import java.util.Stack;

public class reversestack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		//System.out.println(s.peek());
		revstack(s);
		System.out.println(s);

	}

	private static void revstack(Stack<Integer> s) {
		if(s.isEmpty())
			return;
		
		int x = s.pop();
		//System.out.println(s);
		revstack(s);
		
		revinsert(s,x);
		
		
	}

	private static void revinsert(Stack<Integer> s, int x) {
		if(s.isEmpty()) {
			s.push(x);
			return;
		}
		//System.out.println(s);
		int temp = s.pop();
		
		revinsert(s,x);
		//System.out.println(s);
		s.push(temp);
		
	}

}
