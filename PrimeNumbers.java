//  Write a Java program to print all prime numbers between 1 and 100 using a for loop and if-else statements.

package module1lab;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:18/07/2025
		 */
		
		int i,j,isPrime;
		System.out.println("Prime numbers between 1 and 100");
		for(i=2;i<=100;i++)
		{
			isPrime=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=0;
					break;
				}
			}
			if(isPrime==1)
			{
				System.out.println(i+" ");
				
			}
		}

	}

}
