package module1;
import java.util.*;

class MyCalculator
{
	double number1;
	double number2;
	MyCalculator(double num1,double num2)
	{
		number1=num1;
		number2=num2;
	}
	
	double add() 
	{
		return number1+number2;
	}
	double subtract()
	{
		return number1-number2;
	}
	double multiply()
	{
		return number1*number2;
	}
	double divide()
	{
		if(number2==0)
		{
			System.out.println("Error: Cannot divide by zero.");
			return 0.0;
		}
		else
			
		{
		return number1/number2;
		}
	}
}


public class CalculatorDemo {
	public static void main(String[] args) {
		char ask='Y';
// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("--- Calculator Menu ---");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("Enter your choice (1-4):");
			int choice=sc.nextInt();
			System.out.println("Enter two numbers:");
			double n1=sc.nextDouble();
			double n2=sc.nextDouble();
			MyCalculator cal=new MyCalculator(n1,n2);
			switch(choice)
			{
				case 1:
					System.out.println("Result:"+cal.add());
					break;
				case 2:
					System.out.println("Result:"+cal.subtract());
					break;
				case 3:
					System.out.println("Result:"+cal.multiply());
					break;
				case 4:
					System.out.println("Result:"+cal.divide());
					break;
				default:
					System.out.println("Invalid");
					break;
			}
			System.out.println("Do you want to continue? (Y/N):");
			ask=sc.next().charAt(0);
		}while(ask=='Y' || ask=='y');
		
		System.out.println("Thank you for using the calculator");
		sc.close();
		}
}