package collections;

import java.util.*;
import java.util.HashMap;

import java.util.Map;
import java.util.LinkedList;

import java.util.List;
public class ver2 {
	
	public void method() {
		HashMap<Integer, LinkedList<Integer>> followers = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		followers.put(1,ll);
		
		
	}
	
	public static void main(String[] args) {
		ver2 obj = new ver2();
		obj.method();
	}

}
