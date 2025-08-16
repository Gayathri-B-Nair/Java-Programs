package module1;
import java.util.Scanner;
class Boxnew{
	double width;
	double height;
	double depth;

	Boxnew(double width,double height,double depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
}
	double volume() {
		return width*height*depth;
	}
}

public class BoxthisKeyword {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width:");
		double width=sc.nextInt();
		System.out.println("Enter the height:");
		double height=sc.nextInt();
		System.out.println("Enter the depth:");
		double depth=sc.nextInt();
		Boxnew b1=new Boxnew(width,height,depth);
		System.out.println("Volume:"+b1.volume());
		sc.close();
	}

}