package recursion;

import java.util.Stack;

public class stacksort {
	 static void insertstack(Stack<Integer> s, int x) {
		if(s.isEmpty()||x>s.peek()) {
			s.push(x);
			return;
		}
		
		int temp = s.pop();
		
		insertstack(s,x);
		s.push(temp);
		
	}
	 static void sortstack(Stack<Integer> s) {
		if(s.isEmpty())
			return ;
		
		int x = s.pop();
		sortstack(s);
		
		insertstack(s,x);
		
		
	}

	public static void main(String[] args) {
		
		  Stack<Integer> s = new Stack<>();
	        s.push(30);
	        s.push(-5);
	        s.push(18);
	        s.push(14);
	        s.push(-3);
	 
        sortstack(s);
        System.out.println(s);
		

	}





}
