/*1. Create a class Employee with:
• Instance variables: empId, empName, salary
• A constructor that initializes values
• A method displayEmployee() to display details
🟢Take input for two employees and print their data.
*/
package tutorial4;
import java.util.Scanner;
class Employee{
	int empId;
	String empName;
	long salary;
	Employee(int empId,String empName,long salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void displayEmployee() 
	{
		System.out.println("\n--- Employee Details ---");
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Salary:"+salary+"\n");
	}
}
public class EmployeeDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
/*Author:Gayathri B Nair
* Date:02/08/2025
*/
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter details of 2 employees");
	for(int i=0;i<2;i++) {
		System.out.println("Enter details of employee "+(i+1));
		System.out.println("Enter Employee ID:");
		int empId=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empName=sc.next();
		System.out.println("Enter Salary:");
		long salary=sc.nextLong();
		Employee e1=new Employee(empId,empName,salary);
		e1.displayEmployee();
	}
	sc.close();
	}
}