package BasicJavaPrograms;
import java.util.*;
public class calculatorusingswitchcase {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter first  numbers");
		double first=reader.nextDouble();
		System.out.println("enter second number");
		double second=reader.nextDouble();
		
		System.out.println("please enter operator:(+,-,*,/):");
		
		double result = 0;
		
		char operator=reader.next().charAt(0);
		
		switch (operator) {
		case '+':
			result=first+second;
			
			break;
		case '-':
			result=first-second;
			
			break;
		case '*':
			result=first*second;
			
			break;
		case '/':
			result=first/second;
			
			break;
		default:
			System.out.println("please pass the correct operator");
			break;
		}
		System.out.println(result);
	}

}
