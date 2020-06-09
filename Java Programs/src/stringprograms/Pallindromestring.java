package stringprograms;

public class Pallindromestring {

	public static void main(String[] args) {
		String s="madam",rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(rev.equals("madam")) {
			System.out.println("given string is a pallindrome string");
		}
		else {
			System.out.println("not a pallindrome string");
		}
	}

}
