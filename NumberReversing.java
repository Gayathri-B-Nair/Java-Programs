//Write a Java program to print the reverse of a given number using a for loop.


package module1lab;
import java.util.*;
public class NumberReversing {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:18/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int number,i,digit,reverse=0;
		System.out.println("Enter a number:");
		number=sc.nextInt();
		System.out.println("Original number:"+number);
		sc.close();
		for(i=0;i<number;i++)
		{
			digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
		}
		System.out.println("Reversed Number:"+reverse);

	}

}
