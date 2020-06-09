package BasicJavaPrograms;

public class primess {

	public static void main(String[] args) {
		
		int n=23;
		
		int count=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println("it is a prime number");
		}
		else
			System.out.println("it is not a prime number");

	}

}
