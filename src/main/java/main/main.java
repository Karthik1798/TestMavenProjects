package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Hello Enter your First name");
		String firstname = scn.next();
		System.out.println("Enter your last name");
		String lastname = scn.next();
		
		System.out.println("Hello "+firstname+" "+lastname);

	}

}
