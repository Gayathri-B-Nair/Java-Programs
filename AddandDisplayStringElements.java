/*Add and Display String Elements 
 * Create a Vector<String> to store the names of 5 fruits.Add the elements, and then print each fruit on a new line using an enhanced for loop.
 */
package tutorial5;
import java.util.Vector;
public class AddandDisplayStringElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:26/07/2025
		 */
		Vector<String> fruits=new Vector<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Strawberry");
		fruits.add("Banana");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}

	}

}
