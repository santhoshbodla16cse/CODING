package recursion;
import java.lang.*;
public class permutationwithcasechange {

	public static void main(String[] args) {
		String in = "ab";
		String out = "";
		
		permute(in,out);

	}

	private static void permute(String in, String out) {
		if(in.length()==0)
		{
		System.out.println(out);
		return;
		}
		
		String out1=out;
		String out2 = out;
		char temp;
		out1+=in.charAt(0);
		
		temp = Character.toUpperCase(in.charAt(0));
		
		out2+=temp;
		in = in.substring(1);
		permute(in,out1);
		permute(in,out2);
		
	}

}
