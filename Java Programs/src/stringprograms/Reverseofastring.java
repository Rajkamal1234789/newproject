package stringprograms;

public class Reverseofastring {

	public static void main(String[] args) {
		String s="rajkamal",rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
			
		}
		
		System.out.print(rev);
	}

}
