package stringprograms;

public class findingnumberofwordsinastring {

	public static void main(String[] args) {
		
		String s= "qwer ghty juij kilp juig huhdkhk nkdkhdsk ytyutu gjagjg gghkjh bjhagjgyu hkhka";
		
//		to find any number or count we should use count
		
		int count=0;
		
		char ch=' ';
		for(int i=0;i<=s.length()-1;i++) {
			
			if(s.charAt(i)==(ch)) {
				count++;
				
			}
			
		}
		count=count+1;
		System.out.print(count);
		

	}

}
