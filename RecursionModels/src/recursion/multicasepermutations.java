package recursion;

public class multicasepermutations {

	public static void main(String[] args) {
		String in = "a1B2";
		String out = "";
		
		permute(in,out);
	}
	private static void permute(String in, String out) {
		if(in.length()==0)
		{
		System.out.println(out);
		return;
		}
		
		if(Character.isLetter(in.charAt(0))) {
		String out1=out;
		String out2 = out;
		char temp;
		out1+=in.charAt(0);
		if(Character.toLowerCase(in.charAt(0))==in.charAt(0))
		temp = Character.toUpperCase(in.charAt(0));
		
		//if(Character.toUpperCase(in.charAt(0))==in.charAt(0))
		else
		temp = Character.toLowerCase(in.charAt(0));
		
		out2+=temp;
		in = in.substring(1);
		
		permute(in,out1);
		permute(in,out2);
		}
		else {
			String out3 = out;
			out3+=in.charAt(0);
			in = in.substring(1);
			permute(in,out3);
		}
		
	}

}
