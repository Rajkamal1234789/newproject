package Arrayprograms;
import java.util.*;
public class arraymaxmin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			int maxvalue=a[0];
			if(a[i]>maxvalue) {
				maxvalue=a[i];
			}
		}

	}

}
