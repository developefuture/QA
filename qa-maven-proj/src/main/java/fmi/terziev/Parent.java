package fmi.terziev;

/*This is class providing information about the Student Marks*/
import java.util.Scanner;

public class Parent {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	/*Scanner class is used to get user input*/
	Scanner input = new Scanner(System.in);
	
	/*Getting users input for parent name from terminal and printing it back*/
    System.out.print("User: ");

    String parent= input.nextLine();

    /*Getting users input for parent pass from terminal and printing it back*/
    System.out.print("password: ");

    String password= input.nextLine();

    /*If-else statement checking if the required input name and password are available*/
    if (parent.equals(parent)){

        if (password.equals("555") & parent.equals("Ivan")){

            System.out.println("Hi Ivan! Looks like you have access to our database.");

        }

        else{

            System.out.println("Sorry, wrong login details. Try again.");

        }

    }
}
}


