/*Default Modifier
 * Create another class in the same package and access species directly.
Try moving that class to a different package and see what happens.
 */
package tutorial6;

class Animal {
	String species;
	Animal(String species){
		this.species=species;
	}
	void displaySpecies() {
		System.out.println("Species: "+species);
	}

}
