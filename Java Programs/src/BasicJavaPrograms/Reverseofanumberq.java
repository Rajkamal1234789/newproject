package BasicJavaPrograms;

public class Reverseofanumberq {

	public static void main(String[] args) {
		
		int n=78908,rev=0;
		
		while(n>0) {
			
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.print(rev);
	}

}
