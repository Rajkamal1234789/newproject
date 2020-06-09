package BasicJavaPrograms;

public class Factorsofanumber {

	public static void main(String[] args) {
		
		// factors of 10 : 1,2,5,10
		
		int n=10;
		
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
