/*Sum All Elements in an Integer Vector
 *  Create a Vector<Integer> and add the numbers 10, 20, 30, 40, and 50. Then, calculate and print the sum of all the elements in the vector.
 */
package tutorial5;
import java.util.Vector;
public class SumAllElementsinanIntegerVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:27/07/2025
		 */
		Vector<Integer> values=new Vector<>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		System.out.println("Original vector:"+values);
		int sum=0;
		for(int numbers:values) {
			sum=sum+numbers;
		}
		System.out.println("Sum:"+sum);

	}

}
