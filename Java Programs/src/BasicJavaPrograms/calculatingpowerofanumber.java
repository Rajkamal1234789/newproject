package BasicJavaPrograms;

public class calculatingpowerofanumber {

	public static void main(String[] args) {
		
		// 2^4=16 ; 2*2*2*2=16
		
		int base=2;
		int exponent=4;
		
		long result=1;
		while(exponent!=0) {
			result*=base;
			--exponent;
			
		}
		System.out.println(result);
		
		

	}

}
