//Input n numbers and store them in an array. Then display the array elements in the same order and in reverse order.

package tutorial3;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:26/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" integers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements in the same order: ");
		for(int i=0;i<n;i++)
		System.out.println(arr[i]+" ");
		System.out.println("Array elements in the reverse order: ");
		for(int i=n-1;i>=0;i--)
			System.out.println(arr[i]+" ");
		sc.close();

	}

}
