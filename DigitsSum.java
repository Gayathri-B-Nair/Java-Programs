//Input a four-digit number and calculate the sum of its digits using a while loop.

package tutorial2;
import java.util.Scanner;
public class DigitsSum {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author Gayathri B Nair
		 * Date:24/05/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum of the digits in "+num+" is:"+sum);
		sc.close();

	}

}
