package module1;
class Demo1{
	private int privateVariable=10;
	public int getPrivateVariable() {
		return privateVariable;
	}
}
public class PrivateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:02/08/2025
		 */
		Demo1 demo=new Demo1();
		System.out.println("Private variable value is:");
		System.out.println(demo.getPrivateVariable());
	}

}