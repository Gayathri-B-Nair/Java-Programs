package module1;
import java.util.Scanner;
public class MonthDays {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:15/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		String monthName;
		int year;
		int numberOfDays=0;
		System.out.println("Enter the year(YYYY):");
		year=sc.nextInt();
		System.out.println("Enter the Month Name:");
		monthName=sc.next();
		switch(monthName.toLowerCase()) {
		case "january" :case "march" :case "may" :case "july":
		case "august": case "october": case "december":
			numberOfDays=31;
			break;
		case "april": case "june": case "september": case "november":
			numberOfDays=30;
			break;
		case "february":
			if(((year%4==0) && (year%100==0)) || (year%400==0)) {
				numberOfDays=29;
			}
			else {
				numberOfDays=28;
			}
			break;
			default:
				System.out.println("Invalid month");
				break;
		}
		System.out.println("The number of days in "+monthName+" "+year+" is "+numberOfDays);
		sc.close();
	}

}
