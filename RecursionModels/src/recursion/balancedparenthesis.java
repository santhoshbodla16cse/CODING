package recursion;

public class balancedparenthesis {
	public static void main(String args[]) {
		int in = 6;
		String out ="";
		if(in % 2!=0) {
			System.out.println("cant print balanced parenthesis");
		}
		else
		{
			solve(in,in/2,in/2,out);
		}
	}

	private static void solve(int in,int i, int j, String out) {
		if(i==0&&j==0) {
			if(out.length()==in)
			System.out.println(out);
			return;
		}
		
		
		if(i!=0){
			String out1 = out;
			out1+="(";
			
			solve(in,i-1,j,out1);
			}
		if(j>i) {
			String out2 =out;
		out2+=")";
		
		solve(in,i,j-1,out2);

		}		
		return;
		
		
		
	}
}
