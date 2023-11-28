import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// Here we can see the implicit/Widening Type TypeCasting
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c = s.next().charAt(0);
		int a=c;
		System.out.println("Printing the Character:"+" "+c);
		System.out.println("Printing the integer value of the character:"+" "+a);
		// Here the value of the character is directly converted to integer by considering the ASCII value of 'X' 
		//This is Called implicit TypeCasting
		
		//Here We Can see the explicit/Narrowing Type TypeCasting
		System.out.println("Enter the Integer Value");
		int f=s.nextInt();
		char m=(char)f;
		System.out.println("Printing the integer Value:"+" "+a);
		System.out.println("Printing the Character Value of the given integer:"+" "+m);
		                                                                         
		
		
		
	}

}
