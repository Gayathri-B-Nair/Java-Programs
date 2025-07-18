package module1;
import java.util.Scanner;
public class TernaryOperatorDemo {
	public static void main(String[] args) {
		
		/*Author:Gayathri B Nair
		 * Date:13/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int firstNumber,secondNumber;
		System.out.println("Enter the first number");
		firstNumber=sc.nextInt();
		System.out.println("Enter the second number");
		secondNumber=sc.nextInt();
		int bigNumber;
		bigNumber=firstNumber>secondNumber?firstNumber:secondNumber;
		System.out.println("I am "+bigNumber+",the big number");
		sc.close();
	}

}
