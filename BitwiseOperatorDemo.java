package module1;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Name:Gayathri B Nair
		 * Date:13/07/2025
		 */
		// Bitwise OR
		int firstNumber=12;
		int secondNumber=25;
		int result=firstNumber | secondNumber;
		System.out.println("The result after Bitwise OR Operation is: "+result);
		
		// Bitwise AND
		result=firstNumber & secondNumber;
		System.out.println("The result after Bitwise AND Operation is: "+result);
		
		//Bitwise XOR
		result=firstNumber ^ secondNumber;
		System.out.println("The result after Bitwise XOR Operation is: "+result);
		
		//Signed Left Shift
		
		firstNumber=212;
		System.out.println(firstNumber << 1);
		System.out.println(firstNumber << 0);
		System.out.println(firstNumber << 4);
		
		//Signed Right Shift
		System.out.println(firstNumber >> 1);
		System.out.println(firstNumber >> 0);
		System.out.println(firstNumber >> 8);
		
	}

}