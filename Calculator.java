//Create a calculator that takes two numbers and an operator (+, -, *, /) and uses switch to perform the operation.

package tutorial2;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author Gayathri B Nair
		 * Date:25/05/2025
		 */
		Scanner sc=new Scanner(System.in);
		int num1,num2,result;
		String operator;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter an operatot(+,-,*,/)");
		operator=sc.next();
		switch(operator) {
		case "+":
			result=num1 + num2;
			System.out.println("Sum="+result);
			break;
		case "-":
			result=num1 - num2;
			System.out.println("Difference="+result);
			break;
		case "*":
			result=num1 * num2;
			System.out.println("Product="+result);
			break;
		case "/":
			if(num2!=0) {
			result=num1 / num2;
			System.out.println("Division="+result);
			}
			else
				System.out.println("Not Defined");
			break;
		default:
			System.out.println("Invalid Operator");	
		}
		sc.close();

	}

}
