//Search for a number in the array and print its position if found, or a message if not found.

package tutorial3;

import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:25/07/2025
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" integers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to search:");
		int intKey=sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++) {
		if(arr[i]==intKey) {
			System.out.println(intKey+" found at index="+i);
			f=1;
			break;
		}
		}
		
		if(f==0)
			System.out.println("Number is not found");
		sc.close();

	}

}
