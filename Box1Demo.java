package module1;
class Box1{
	double width;
	double height;
	double depth;

	Box1(double w,double h,double d){
	width=w;
	height=h;
	depth=d;
}
	double volume() {
		return width*height*depth;
	}
}

public class Box1Demo {
	public static void main(String args[]) {
		/*Author:Gayathri B Nair
		 * Date:
		 */
		Box1 mybox1=new Box1(10,20,15);
		Box1 mybox2=new Box1(3,6,9);
		double vol;
		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
		vol=mybox2.volume();
		System.out.println("Volume is "+vol);
	}

}