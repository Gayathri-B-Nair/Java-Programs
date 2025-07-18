//Write a Java program to check whether a given number is prime using if-else statements and a for loop.


package module1lab;
import java.util.*;
public class PrimeCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:17/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int number,i,count=0;
		System.out.println("Enter a number:");
		number=sc.nextInt();
		sc.close();
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==0 && number>1)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
	}

}
