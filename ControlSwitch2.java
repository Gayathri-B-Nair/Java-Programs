package module1;

public class ControlSwitch2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:15/07/2025
		 */
		String levelString="Expert";
		int level=0;
		switch(levelString) {
		case "Beginner":level=1;
		break;
		case "Intermediate":level=2;
		break;
		case "Expert":level=3;
		break;
		default:level=0;
		break;
		
		}
		System.out.println("Your Level is: "+level);
	}

}
