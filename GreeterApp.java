package greet_the_world;

import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		System.out.print("Hey there, Cutie. ");
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = scnr.nextInt();
		
		System.out.print("The square of that number is: ");
		System.out.print(number * number);
	}
}
