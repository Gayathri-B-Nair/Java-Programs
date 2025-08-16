/*4. Create a class Marks with:
• Variables: mark1, mark2, mark3
• Constructor to initialize all marks
• Method to calculate and return total and average
🟢 Input marks of a student and display result.
 */
package tutorial4;
import java.util.Scanner;
class Marks{
	double mark1;
	double mark2;
	double mark3;
	Marks(double mark1,double mark2,double mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	double total() {
		return mark1+mark2+mark3;
	}
	double average() {
		return (mark1+mark2+mark3)/3;
	}
}
public class MarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:02/08/2025
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark:");
		double mark1=sc.nextDouble();
		System.out.println("Enter the mark:");
		double mark2=sc.nextDouble();
		System.out.println("Enter the mark:");
		double mark3=sc.nextDouble();
		Marks m1=new Marks(mark1,mark2,mark3);
		System.out.println("Total:"+m1.total());
		System.out.println("Average:"+m1.average());
		sc.close();

	}

}
