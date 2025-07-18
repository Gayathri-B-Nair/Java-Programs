package module1;
import java.util.*;
public class SumOfNumbers {
	public static void main(String[] args) {
		
		/*Author:Gayathri B Nair
		 * Date:13/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int num1,num2,total;
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		total=num1+num2;
		System.out.println("Sum of two numbers="+total);
		sc.close();
		}
}
