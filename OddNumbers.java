//Take n as input and print odd numbers from 1 to n using a for loop and continue statement

package tutorial2;
import java.util.Scanner;
public class OddNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author Gayathri B Nair
		 * Date:24/05/2025
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		System.out.println("Odd numbers from 1 to "+n);
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		sc.close();

	}

}
