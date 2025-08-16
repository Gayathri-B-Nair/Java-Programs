package module1;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/* Name:Gayathri B Nair
		 * Date:13/07/2025
		 */
		
		String username,password;
		username="user1";
		password="pass123";
		if(username=="user1" && password=="pass123") 
			System.out.println("Authorized Login Successful");
		else if(username=="user1" && password!="pass123")
			System.out.println("Incorrect Password");
		else if(username!="user1" && password=="pass123")
			System.out.println("User Not Registered");
		else 
			System.out.println("Incorrect UserID and Password");
		

	}

}
