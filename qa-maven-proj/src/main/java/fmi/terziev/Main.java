package fmi.terziev;

/*This is class providing information about the Student Marks*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		/*Scanner class is used to get user input*/
		Scanner input = new Scanner(System.in);

		/*Getting users input for student name from terminal and printing it back*/
	        System.out.print("User: ");

	        String username= input.nextLine();

	        /*Getting users input for students pass from terminal and printing it back*/
	        System.out.print("password: ");

	        String password= input.nextLine();

	        /*If-else statement checking if the required input name is available*/
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
