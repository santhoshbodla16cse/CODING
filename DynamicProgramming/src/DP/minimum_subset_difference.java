package DP;

import java.awt.List;  
import java.util.*;  
  
public class minimum_subset_difference {  
  
    public static void main(String[] args) {  
        ArrayList<Integer> list = new ArrayList<>();  
  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  
  
        Iterator<Integer> it = list.iterator();  
        while (it.hasNext()) {                   
        	Integer value = it.next();              
            System.out.println("List Value:" + value);  
            if (value==3)  
                it.remove();  
        }  
  
    }  
  
}  