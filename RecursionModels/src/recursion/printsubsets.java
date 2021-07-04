package recursion;

public class printsubsets {

	public static void main(String[] args) {
		String in = "abc";
		String out ="";
		
		subsetsprint(in,out);

	}

	private static void subsetsprint(String in, String out) {
		if(in.length()==0) {
			System.out.println(out);
			System.out.println("---------");
			return;
		}
		
		String out1 = out;
		String out2 = out;
			//String x  = in.substring(0,1);
		out2+=in.charAt(0);
			//System.out.println(out2);
		in=in.substring(1);
			//System.out.println(in);
		subsetsprint(in,out1);
		subsetsprint(in,out2);
		
		return;
		
		
	}

}
