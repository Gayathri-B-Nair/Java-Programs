//Input n numbers into an array and find the maximum and minimum values in the array.

package tutorial3;

import java.util.Scanner;

public class MaxAndMin {

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
		int maximum=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>maximum) {
				maximum=arr[i];
			}
		}
		System.out.println("The maximum value is: "+maximum);
		int minimum=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		System.out.println("The minimum value is: "+minimum);
		sc.close();

	}

}
