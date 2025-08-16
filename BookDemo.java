/*3 Create a class Book with:
• Variables: title, author, and price
• A constructor to initialize them
• Method to display book information
🟢Add two books and display their details.
*/
package tutorial4;
import java.util.Scanner;
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("\n--- Book Details ---");
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price+"\n");
	}
}
public class BookDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
/*Author:Gayathri B Nair
* Date:02/08/2025
*/
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter details of 2 books");
	for(int i=0;i<2;i++) {
		System.out.println("Enter details of book "+(i+1));
		System.out.println("Enter Title of book:");
		String title=sc.next();
		System.out.println("Enter Name of Author:");
		String author=sc.next();
		System.out.println("Enter the price of the book:");
		double price=sc.nextDouble();
		Book b1=new Book(title,author,price);
		b1.displayDetails();
	}
	sc.close();
	}
}