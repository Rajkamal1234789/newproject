package NaveenAutomationLabs;

public class Checkingwhetheritisaalphabetornot {

	public static void main(String[] args) {
		
		char ch='P';
		
		if((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z'))
		{
			System.out.println("it a alphabet");
		}
		else {
			System.out.println("not an alphabet");
		}

	}

}
