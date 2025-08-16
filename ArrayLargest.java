package module1;
import java.util.*;
public class ArrayLargest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
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
		int largest=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("The largest element is: "+largest);
		sc.close();

	}

}
