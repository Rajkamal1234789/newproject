package BasicJavaPrograms;

public class Armstrongnumber {
//sum of cubes of its digits=armstrong number // 0 and 1 also armstrong numbers
	public static void main(String[] args) {
		int r,n=153,arm=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
			
		}
		if(arm==temp) {
			System.out.println("it is a armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
		

	}

}
