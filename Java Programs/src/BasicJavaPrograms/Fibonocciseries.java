package BasicJavaPrograms;

public class Fibonocciseries {

	public static void main(String[] args) {
		int n=5, a=0,b=1,c;
		System.out.print(a+" " +b);
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			
		
		a=b;
				b=c;
		
		
		}
	}

}
