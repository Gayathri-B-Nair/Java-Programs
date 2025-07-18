package module1;
import java.util.*;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:17/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of first "+n+" natural numbers is "+sum);
	}

}
