package Arrayprograms;

public class copyingelementsofonearrytoother {

	public static void main(String[] args) {
		
		int [] a= {1,2,4,5,6,7};
		
		int[]raj=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			raj[i]=a[i];
		}
		
		//displaying elements of array raj
		
		for(int i=0;i<raj.length;i++) {
			System.out.print(raj[i]);
		}

	}

}
