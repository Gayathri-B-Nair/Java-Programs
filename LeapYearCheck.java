//Write a Java program to check if a given year is a leap year or not using if-else statements.


package module1lab;
import java.util.*;
public class LeapYearCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:18/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year:");
		year=sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		sc.close();
	}

}
