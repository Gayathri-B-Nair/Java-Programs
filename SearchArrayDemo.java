package module1;

import java.util.Arrays;

public class SearchArrayDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:25/07/2025
		 */
		int intArr[]= {10,20,15,22,35};
		Arrays.sort(intArr);
		int intKey=22;
		System.out.println(intKey+" found at index="+ Arrays.binarySearch(intArr,intKey));

	}

}
