package module1;
class Demo{
	private int privateVariable=25;
	public int getPrivateVariable() {
		return privateVariable;
	}
	public void setPrivateVariable(int value) {
		privateVariable=value;
	}
	void printPrivate() {
		System.out.println(privateVariable);
	}
	public void setprintPrivate(int val) {
		// TODO Auto-generated method stub
		
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:02/08/2025
		 */
		Demo demo=new Demo();
		demo.setprintPrivate(25);
		System.out.println("Value form class:");
		demo.printPrivate();
		System.out.println("Value form main:");
		System.out.println(demo.getPrivateVariable());
	}

}