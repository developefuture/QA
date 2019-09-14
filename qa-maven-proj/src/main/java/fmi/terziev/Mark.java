package fmi.terziev;

//Importing scanner class
import java.util.Scanner;

/*This is class providing information about the Student Marks*/
public class Mark {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*Scanner class is used to get user input*/
		Scanner input = new Scanner(System.in);

		/*Getting users input for student name from terminal and printing it back*/
        System.out.print("User: ");

        String student= input.nextLine();
        
        /*Getting users input for students pass from terminal and printing it back*/
        System.out.print("password: ");


        /*If-else statement checking if the required input name is available*/
        if (student.equals(student)){

            if (student.equals("Ivan")){

                System.out.println("Hi Ivan! Your score 98/100. Thanks for participating in this Exam.");

            }

            else if(student.equals("Petar")){

            	 System.out.println("Hi Petar! Your score 60/100. Thanks for participating in this Exam.");

            }
            else {
                System.out.println("Sorry, wrong login details. Try again.");
            }

        }

	}

}
