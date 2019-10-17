package co.grandcircus;

import java.util.Scanner;

public class LearnSquareCubes {

	public static void main(String[] args) {
		
		char userReply = 0;
		int counter;
		long userNum;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Learning your Squares and Cubes!");
		do {	 
			System.out.println("Please enter an integer: ");
			userNum = scnr.nextInt();
			System.out.println();
			System.out.printf("%-10s  %-12s %-14s\n", "Numbers" , "Squares" , "Cubes");
			System.out.println("========    ========    ========");
		
		for (counter = 1; userNum >= counter; counter++) {
			System.out.println(counter + "           " + Math.round(Math.pow(counter, 2)) + "           " + Math.round(Math.pow(counter, 3)) );
		}
		System.out.println("Would you like to continue? (y/n) ");
		userReply = scnr.next().charAt(0);
		} while (userReply == 'y');
		 
	}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		

