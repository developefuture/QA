package fmi.terziev;

import java.util.Scanner;

public class Mark {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.print("User: ");

        String student= input.nextLine();

        System.out.print("password: ");

        String password= input.nextLine();

        System.out.println("Your username is: " + student);

        System.out.println("Your password us: " + password);

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
