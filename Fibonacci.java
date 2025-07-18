// Write a Java program to print the Fibonacci series up to a given number using a while loop.


package module1lab;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:17/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		int num,a=0,b=1,c;
		System.out.println("Enter the limit value:");
		num=sc.nextInt();
		System.out.println("Fibonacci series upto "+num);
		System.out.println(a);
		System.out.println(b);
		int i=0;
		while(i<num-2)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
		sc.close();
	}

}
