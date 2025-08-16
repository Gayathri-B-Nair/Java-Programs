package module1;
class Box2{
	int w,d,h;
	Box2(){
		w=2;
		d=3;
		h=4;
	}
	int volume() {
		return(w*d*h);
	}
}
public class Box2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:
		 */
		Box2 b2=new Box2();
		int vol=b2.volume();
		System.out.println("Dimensions of Box");
		System.out.println("w="+b2.w+" ,d="+b2.d+" ,h="+b2.h);
		System.out.println("Volume of box="+vol);
		

	}

}
