package fmi.terziev;

import java.util.Scanner;

public class Student {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	
		
		Scanner input = new Scanner(System.in);

        System.out.print("User: ");

        String student= input.nextLine();

        System.out.print("password: ");

        String password= input.nextLine();

        System.out.println("Your username is: " + student);

        System.out.println("Your password us: " + password);

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

