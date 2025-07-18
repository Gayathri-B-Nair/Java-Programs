package module1;
import java.util.*;
public class Details {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	long number;
	double cgpa;
	float attendancePercentage;

	System.out.println("Enter the full Name:");
	name=sc.nextLine();
	System.out.println("Enter the age:");
	age=sc.nextInt();
	System.out.println("Enter the mobile number:");
	number=sc.nextLong();
	System.out.println("Enter the cgpa:");
	cgpa=sc.nextDouble();
	System.out.println("Enter the attendancePercentage:");
	attendancePercentage=sc.nextFloat();
	System.out.println("     "
			+ " My Details        ");
	System.out.println(".........................");
	System.out.println("Full Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Mobile Number:"+number);
	System.out.println("CGPA:"+cgpa);
	if(attendancePercentage>=90)
	{
		System.out.println("Attendance Mark:10");
	}
	else
	{ 
		System.out.println("Attendance Mark:"+attendancePercentage/10);
	}
	sc.close();
 }

}
