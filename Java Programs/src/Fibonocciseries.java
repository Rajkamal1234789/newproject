import java.util.*;
public class Fibonocciseries {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n,a=0,b=1,c;
	System.out.println("enter n  value");
	n= sc.nextInt();
		System.out.print(a+ " "+b);
		for(int i=1;i<=n;i++) {
		c=a+b;
		System.out.print(" " + c);
		
		a=b;
		b=c;
	
		}
	}
	}


