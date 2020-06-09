package NaveenAutomationLabs;

import java.util.*;
public class factorialofanumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int fact=1,n;
	System.out.println("enter n value");
	n=sc.nextInt();
	for(int i=1;i<=n;i++) {
			fact=fact*i;
	}
		System.out.println("factorial of a given number is:"+fact);
		
	}		

}
