package module1;
class Book1{
	String title;
	String author;
	double price;
	
	Book1(){
		title="Unknown";
		author="Not assigned";
		price=0.0;
	}
	Book1(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("--- Book Details ---");
		System.out.println("Tile:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
	}
}
public class MyBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1=new Book1();
		b1.displayDetails();
		Book1 b2=new Book1("Booknew","ABCD",450);
		b2.displayDetails();

	}

}