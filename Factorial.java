package module1;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:15/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int number,i=1,fact=1;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+number+" is "+fact);
		sc.close();	
	}

}
