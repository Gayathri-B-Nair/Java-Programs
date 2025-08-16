/*Private Modifier
 * Try accessing the model variable directly from another class.
Observe the compiler error.
Use the showModel() method instead to access it. 
 */
package tutorial6;

class Car {
	private String model;
	public Car(String model) {
		this.model=model;
	}
	public void showModel() {
		System.out.println("Model: "+model);
	}

}
