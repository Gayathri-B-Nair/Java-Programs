/*Search for a String Element 
 * Create a Vector<String> with values: "Pen", "Notebook", "Eraser", and "Marker". Ask the user (using Scanner) to enter an item name.
 *  Check if the item exists in the vector and print "Item found" or "Item not found".
 */
package tutorial5;
import java.util.Vector;
import java.util.Scanner;
public class SearchforaStringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:27/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		Vector<String> items=new Vector<>();
		items.add("Pen");
		items.add("Notebook");
		items.add("Eraser");
		items.add("Marker");
		System.out.println("Enter an item name:");
		String item=sc.next();
			if(items.contains(item)) {
				System.out.println("Item found");
			}
			else {
				System.out.println("Item not found");
			}
		sc.close();

	}

}
