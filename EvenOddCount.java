//Count the number of even and odd elements in the array of n integers entered by the user.

package tutorial3;

import java.util.Scanner;

public class EvenOddCount {

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
		int evenCount=0,oddCount=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) 
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Total no of even elements:"+evenCount);
		System.out.println("Total no of odd elements:"+oddCount);
		sc.close();

	}

}
