package recursion;

public class permutationwithspaces {

	public static void main(String[] args) {
		String in = "bc";
		String out ="a";
		
		permute(in,out);
				

	}

	private static void permute(String in, String out) {
		if(in.length()==0)
		{
			System.out.println(out);
			return;
		}
		
		String out1 = out;
		String out2 = out;
		out1+=" "+in.charAt(0);
		out2+=in.charAt(0);
		in = in.substring(1);
		
		permute(in,out1);
		permute(in,out2);
		
		return;
		
	}

}
