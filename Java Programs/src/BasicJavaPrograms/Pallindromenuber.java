package BasicJavaPrograms;

public class Pallindromenuber {

	public static void main(String[] args) {
		int n=111,r,rev=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println("pallindrome number");
		}
		else {
			System.out.println("not a pallindrome number");
		}

	}

}
