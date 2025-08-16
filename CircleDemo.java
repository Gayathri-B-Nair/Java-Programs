/*2.Create a class Circle with:
• Instance variable: radius
• A constructor to initialize radius
• Method to compute and display area and circumference
🟢 Use formula: area = πr², circumference = 2πr
 */
package tutorial4;
import java.util.Scanner;
class Circle{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double displayArea() {
		return 3.14*radius*radius;
	}
	double displayCircumference() {
		return 2*3.14*radius;
	}
}
public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:02/08/2025
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double radius=sc.nextDouble();
		Circle c1=new Circle(radius);
		System.out.println("Area of circle:"+c1.displayArea());
		System.out.println("Circumference of circle:"+c1.displayCircumference());
		sc.close();

	}

}
