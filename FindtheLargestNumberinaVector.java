/*Find the Largest Number in a Vector
 *  Using a Vector<Integer> with values 25, 60, 15, 80, and 45, write a Java snippet to find and print the maximum value in the vector.
 */
package tutorial5;
import java.util.Vector;
public class FindtheLargestNumberinaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:26/07/2025
		 */
		Vector<Integer> values=new Vector<>();
		values.add(25);
		values.add(60);
		values.add(15);
		values.add(80);
		values.add(45);
		System.out.println("Original vector:"+values);
		int max=values.get(0);
		for(int numbers:values) {
			if(numbers>max) {
				max=numbers;
			}
		}
		System.out.println("Maximum value:"+max);

	}

}
