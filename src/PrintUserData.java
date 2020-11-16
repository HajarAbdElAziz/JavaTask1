import java.util.Scanner;

public class PrintUserData {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hi user, Please enter your name:");		
		String name=in.next();
		System.out.println("Please enter your Email:");		
		String email=in.next();
		System.out.println("Please enter your Age:");		
		String age=in.next();
		System.out.println("Please enter your Faculty:");		
		String faculty=in.next();
		
		System.out.println("Thank you, Here are ur info:");
		System.out.println("Your Name: "+name); 
		System.out.println("Your Email: "+email); 
		System.out.println("Your Age: "+age); 
		System.out.println("Your Faculty: "+faculty); 
		in.close();
	}

}
