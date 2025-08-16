package module1;

public class ControlStatementDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Name:Gayathri B Nair
		 * Date:15/07/2025
		 */
		float internalMarksForAttendance=0f;
		float attendancePercentage=82.35f;
		if(attendancePercentage>=90) {
			internalMarksForAttendance=10;
		}
		else {
			internalMarksForAttendance=attendancePercentage/10;
		}
		System.out.println("Internal Marks for Attendance:"+""+internalMarksForAttendance);

	}

}
