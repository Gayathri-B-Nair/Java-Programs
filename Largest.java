package module1;
import java.util.*;
public class Largest {
	public static void main(String[] args) {
		
		/*Author:Gayathri B Nair
		 * Date:15/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter three numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if((num1>num2) && (num1>num3))
			System.out.println("Largest number is "+num1);
		else if((num2>num1) && (num2>num3))
			System.out.println("Largest number is "+num2);
		else
			System.out.println("Largest number is "+num3);
		sc.close();
	}
}
