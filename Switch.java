//Input a character and use a switch statement to determine if it's a vowel or a consonant.

package tutorial2;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:24/07/2025
		 */
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String ch= sc.next().toLowerCase();
            switch (ch) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
            sc.close();

	}

}
