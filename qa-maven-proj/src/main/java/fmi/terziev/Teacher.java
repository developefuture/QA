package fmi.terziev;

import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("User: ");

        String teacher= input.nextLine();

        System.out.print("password: ");

        String password= input.nextLine();

        System.out.println("Your username is: " + teacher);

        System.out.println("Your password us: " + password);

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
