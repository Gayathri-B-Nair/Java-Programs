//Sort the array elements in ascending order and display the sorted array.

package tutorial3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

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

		Arrays.sort(arr);
		System.out.println("The sorted Array is");
		for(int element:arr)
			System.out.println(element+"");
		sc.close();
		

	}

}
