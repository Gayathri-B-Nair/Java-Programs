package module1;

import java.util.Vector;

public class VectorRemoveElementDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:26/07/2025
		 */
		Vector<String> animals=new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		System.out.println("Initial Vector: "+animals);
		String element=animals.remove(1);
		System.out.println("Removed element: "+element);
		System.out.println("New Vector: "+animals);
		animals.clear();
		System.out.println("Vector after clear(): "+animals);
		

	}

}
