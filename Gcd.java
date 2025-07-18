// Write a Java program to find the greatest common divisor (GCD) of two numbers using a while loop.

package module1lab;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:18/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		int a=num1;
		int b=num2;
		int temp=0;
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println("GCD of "+num1+" and "+num2+" is "+a);
		sc.close();
	}

}
