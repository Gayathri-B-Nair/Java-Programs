package module1;

public class ExampleArray1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:25/07/2025
		 */
		int[] numbers=new int[10];
		System.out.println("Lenght="+numbers.length);
		System.out.println("Values in Array:");
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=i*2;
			System.out.println(numbers[i]);
		}

	}

}
