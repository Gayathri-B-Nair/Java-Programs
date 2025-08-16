package module1;

import java.util.Scanner;

public class ExampleArray3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:25/07/2025
		 */
		int[] numbers=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("Number "+(i+1)+":");
			numbers[i]=sc.nextInt();
		}
		System.out.println("\nNumbers You entered are:");
		for(int num:numbers)
		{
			System.out.print(num+"\t");
		}
		sc.close();
	}

}
