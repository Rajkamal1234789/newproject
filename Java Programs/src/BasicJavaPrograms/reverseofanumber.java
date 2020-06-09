package BasicJavaPrograms;

public class reverseofanumber {

	public static void main(String[] args) {
		int n=1123,r;
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
		}

	}

}
