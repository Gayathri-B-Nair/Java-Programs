/*Remove an Element from a Vector 
 * Create a Vector<String> with the elements "Red", "Green", "Blue", and "Yellow". Remove "Green" and print the final contents of the vector.
 */
package tutorial5;
import java.util.Vector;
public class RemoveanElementfromaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:27/07/2025
		 */
		Vector<String> colour=new Vector<>();
		colour.add("Red");
		colour.add("Green");
		colour.add("Blue");
		colour.add("Yellow");
		System.out.println("Original vetor:"+colour);
		colour.remove(1);
		System.out.println("Final contents:"+colour);
		

	}

}
