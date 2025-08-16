//Input an integer and check if it's a palindrome (reads same forward and backward) using a while loop.

package tutorial2;
import java.util.Scanner;
public class PalindromCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author Gayathri B Nair
		 * Date:25/05/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int n,num,rev=0,digit;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		n=num;
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(num==rev)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
		sc.close();

	}

}
