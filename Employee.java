/*Protected Modifier
 * Create a subclass (e.g., Manager) that extends Employee.
Try accessing the salary variable and method from the subclass.
Also, try to access it from a non-subclass in a different package.

 */
package tutorial6;

class Employee {
	protected int salary=80000;
	Employee(int salary){
		this.salary=salary;
	}
	protected void showSalary() {
		System.out.println("Salary: "+salary);
	}

}
