package module1;

public class ModernSwitchExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:15/07/2025
		 */
		String grade="A";
		String result=switch(grade) {
		case "O" ->"Outstanding Performance";
		case "A+" ->"Excellent Performance";
		case "A" ->"Very Good Performance";
		case "B+" ->"Good Performance";
		case "B" ->"Above Average Performance";
		case "C" ->"Average Performance";
		case "P" ->"Pass";
		case "F" ->"Fail";
		default ->"Invalid Grade";
		};
		System.out.println("Grade: "+grade);
		System.out.println("Result: "+result);
		

	}

}
