package fmi.terziev;

/*This is class providing information about the Student Marks*/
import java.util.Scanner;

public class Student {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	
		/*Scanner class is used to get user input*/
		Scanner input = new Scanner(System.in);

		/*Getting users input for student name from terminal and printing it back*/
        System.out.print("User: ");

        String student= input.nextLine();

        /*Getting users input for students pass from terminal and printing it back*/
        System.out.print("password: ");

        String password= input.nextLine();

        /*If-else statement checking if the required input password is available*/
        if (student.equals(student)){

            if (password.equals("123")){

                System.out.println("Hi student! Looks like you have access to our database.");

            }

            else{

                System.out.println("Sorry, wrong login details. Try again.");

            }

        }
	}
}

