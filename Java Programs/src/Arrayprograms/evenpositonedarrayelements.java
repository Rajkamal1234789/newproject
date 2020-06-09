package Arrayprograms;

public class evenpositonedarrayelements {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		//even positioned elements
		System.out.println("displaying even positioned elements");
		for(int i=1;i<a.length;i=i+2) {
			System.out.print(a[i]+ "");
		}

		System.out.println("displaying elements in odd positioned");
		
		for(int i=0;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}
		
	}

}
