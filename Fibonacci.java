//Input n and print the first n Fibonacci numbers using a for loop.

package tutorial2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author Gayathri B Nair
		 * Date:25/05/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int num,a=0,b=1,c;
		System.out.println("Enter the limit value:");
		num=sc.nextInt();
		System.out.println("Fibonacci series upto "+num);
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		sc.close();

	}

}
