package module1;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:
		 */
		int[] numbers= {1,2,3,4,5};
		for(int x:numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names= {"January","February","March","April"};
		for(String name:names) {
			System.out.print(name);
			System.out.print(",");
		}

	}

}
