package fmi.terziev;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

	        System.out.print("User: ");

	        String username= input.nextLine();

	        System.out.print("password: ");

	        String password= input.nextLine();

	        System.out.println("Your username is: " + username);

	        System.out.println("Your password us: " + password);

	        if (username.equals(username)){

	            if (password.equals("123")){

	                System.out.println("You have access to our database.");

	            }

	            else{

	                System.out.println("Şifre yanlış :(");

	            }

	        }
	}

}
