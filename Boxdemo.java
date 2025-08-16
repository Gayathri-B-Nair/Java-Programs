package module1;
import java.util.*;
class Box{
	double width;
	double height;
	double depth;
	
	void volume(double w,double d,double h) {
		width=w;
		depth=d;
		height=h;
		System.out.println("vol="+(width*height*depth));
		System.out.println("vol="+(w*h*d));
	}
}
public class Boxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Author:Gayathri B Nair
		 * Date:
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter width,height and depth:");
		double width=sc.nextInt();
		double height=sc.nextInt();
		double depth=sc.nextInt();
		Box mybox=new Box();
		mybox.volume(width,height,depth);
		sc.close();

	}

}
