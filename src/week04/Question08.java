package week04;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String firstName=scanner.next();
		String lastName=scanner.next();
		fullName(firstName, lastName);
		
	}
	public static void fullName(String firstName, String lastName) {
		System.out.println(firstName+" "+lastName);
	}

}
