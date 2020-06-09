package NaveenAutomationLabs;
import java.util.*;
public class sumofnaturalnumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n;
		System.out.println("enter n value");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of natural numbers is:"+sum);

	}

}
