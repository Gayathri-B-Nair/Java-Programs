package module1;
import java.util.Vector;
public class VectorAddElementsDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:26/07/2025
		 */
		
		Vector<String> mammals=new Vector<>();
		mammals.add("Dog");
		mammals.add("Horse");
		mammals.add(2,"Cat");
		System.out.println("Vector: "+mammals);
		Vector<String> animals=new Vector<>();
		animals.add("Crocodile");
		animals.addAll(mammals);
		System.out.println("New Vector: "+animals);

	}

}
