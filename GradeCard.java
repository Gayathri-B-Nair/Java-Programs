package module1;
import java.util.*;
public class GradeCard {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:15/07/2025
		 */
		
		Scanner sc=new Scanner(System.in);
		int markScored;
		String grade;
		System.out.println("Enter the mark scored:");
		markScored=sc.nextInt();
		if(markScored>=90)
			grade="S";
		else if(markScored>=85 && markScored<90)
			grade="A+";
		else if(markScored>=80 && markScored<85)
			grade="A";
		else if(markScored>=75 && markScored<80)
			grade="B+";
		else if(markScored>=70 && markScored<75)
			grade="B";
		else if(markScored>=65 && markScored<70)
			grade="C+";
		else if(markScored>=60 && markScored<65)
			grade="C";
		else if(markScored>=55 && markScored<60)
			grade="D";
		else if(markScored>=50 && markScored<55)
			grade="P";
		else
			grade="F";
		System.out.println("Grade of th student who scored "+markScored+" is "+grade);
		sc.close();
	}

}
