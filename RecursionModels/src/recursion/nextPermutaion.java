package recursion;

import java.util.*;
class nextPermutation {
    public void nextPermute(int[] nums) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        int c=0;
        String in = sb.toString();
        String out ="";
        ArrayList<String> al = new ArrayList<String>();
        nextpermute(in,out,al);
        Collections.sort(al);  
        System.out.println(al);
//        Iterator itr=al.iterator();  
//        while(itr.hasNext()){
//        System.out.println(itr.next());
//        } 
    } 
    
    public void nextpermute(String in,String out,ArrayList<String> al){
        if(in.length()==0){
        	//if(out.length()==3)
            al.add(out);
        	//System.out.println(out);
        	return;
        }
        String out1 = out;
        String out2=out;
        //out1=
        out2 +=in.charAt(0);
        
        in = in.substring(1);
        nextpermute(in,out1,al);
        nextpermute(in,out2,al);
    }
    public static void main(String args[]){
        int []a = {1,2,3};
        nextPermutation np = new nextPermutation();
        np.nextPermute(a);
    }
}