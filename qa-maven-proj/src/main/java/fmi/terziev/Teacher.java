package fmi.terziev;

/*This is class providing information about the Student Marks*/
import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		/*Scanner class is used to get user input*/
		Scanner input = new Scanner(System.in);

		/*Getting users input for teacher's name from terminal and printing it back*/
        System.out.print("User: ");

        String teacher= input.nextLine();

        /*Getting users input for teacher's pass from terminal and printing it back*/
        System.out.print("password: ");

        String password= input.nextLine();

        /*If-else statement checking if the required input teacher password is available*/
        if (teacher.equals(teacher)){

            if (password.equals("123")){

                System.out.println("Hi teacher! Looks like you have access to our database.");

            }

            else{

                System.out.println("Sorry, wrong login details. Try again.");

            }

        }

	}

}
