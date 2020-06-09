package NaveenAutomationLabs;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1,n2,gcd=1;
		System.out.println("enter n1 value");
		n1=sc.nextInt();
		System.out.println("enter n2 value");
		n2=sc.nextInt();
		
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				 gcd=i;
			}
			
			
		}
		System.out.print(gcd);

	}

}
