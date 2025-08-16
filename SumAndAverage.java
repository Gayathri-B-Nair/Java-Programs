//Input n numbers and calculate the sum and average of the elements in the array.

package tutorial3;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:25/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		double average=0;
		System.out.println("Enter "+n+" integers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			average=(double)sum/n;
		}
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+average);
		sc.close();

	}

}
