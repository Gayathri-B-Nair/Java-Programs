package module1;
import java.util.Scanner;
class SampleData{
	String name;
	int age;
	void display() {
		System.out.println("\nStudent Data");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class SampleDataDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayatrhi B Nair
		 * Date:25/05/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		SampleData student=new SampleData();
		System.out.println("Enter name:");
		student.name=sc.nextLine();
		System.out.println("Enter age:");
		student.age=sc.nextInt();
		student.display();
		sc.close();

	}

}
