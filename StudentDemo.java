package lab3;
import java.util.*;

class Student {
    String Name;
    long RegNo;
    String Course;
    float[] Marks;
    float totalMarks;
    int rank;

    Student(String Name, long RegNo, String Course, float[] Marks) {
        this.Name = Name;
        this.RegNo = RegNo;
        this.Course = Course;
        this.Marks = Marks;
        this.totalMarks = calculateTotal();
    }

    float calculateTotal() {
        float sum = 0;
        for (float mark : Marks) {
            sum += mark;
        }
        return sum;
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int N = sc.nextInt();

        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the details of student " + (i + 1));
            System.out.print("Enter the name of student: ");
            String Name = sc.next();

            System.out.print("Enter the registration number: ");
            long RegNo = sc.nextLong();

            System.out.print("Enter the course: ");
            String Course = sc.next();

            float[] Marks = new float[6];
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter the mark of subject " + (j + 1) + ": ");
                Marks[j] = sc.nextFloat();
            }

            students[i] = new Student(Name, RegNo, Course, Marks);
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (students[j].totalMarks < students[j + 1].totalMarks) {
                    
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        int rank = 1;
        students[0].rank = rank;
        for (int i = 1; i < N; i++) {
            if (students[i].totalMarks == students[i - 1].totalMarks) {
                students[i].rank = students[i - 1].rank; 
            } else {
                students[i].rank = i + 1;
            }
        }

        System.out.println("\nStudent Marks Report with Rank:");
        System.out.println( "Rank        Name                 RegNo             Total             Course");
        System.out.println("----------------------------------------------------------------------------");
        for (Student s : students) {
        	System.out.println(s.rank + "           " + s.Name + "                  " + s.RegNo + "              " + s.totalMarks + "            " + s.Course);

        }

        sc.close();
    }
}
