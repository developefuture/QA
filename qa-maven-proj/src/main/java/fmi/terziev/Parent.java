package fmi.terziev;

import java.util.Scanner;

public class Parent {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

    System.out.print("User: ");

    String parent= input.nextLine();

    System.out.print("password: ");

    String password= input.nextLine();

    System.out.println("Your username is: " + parent);

    System.out.println("Your password us: " + password);

    if (parent.equals(parent)){

        if (password.equals("555") & parent.equals("Ivan")){

            System.out.println("Hi parent! Looks like you have access to our database.");

        }

        else{

            System.out.println("Sorry, wrong login details. Try again.");

        }

    }
}}


