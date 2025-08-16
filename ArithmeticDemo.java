package module1;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:13/07/2025
		 */
		
		int  counter=1+2;
		System.out.println("1+2= "+counter);
		int originalcounter=counter;
		
		counter=counter-1;
		System.out.println(originalcounter+"-1= " +counter);
		originalcounter=counter;
		
		counter=counter*2;
		System.out.println(originalcounter+"*2= " +counter);
		originalcounter=counter;
		
		counter=counter/2;
		System.out.println(originalcounter+"/2= " +counter);
		originalcounter=counter;
		
		counter=counter+8;
		System.out.println(originalcounter+"+8= " +counter);
		originalcounter=counter;
		
		counter=counter%7;
		System.out.println(originalcounter+"%7= " +counter);
		originalcounter=counter;
	}

}
