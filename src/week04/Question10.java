package week04;

import java.util.Scanner;

public class Question10 {
	// Write a method that takes an array of double and returns the average of all the elements in the array.

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c= scanner.nextDouble();
		average(a,b,c);
		
	}
	static void average(double a, double b, double c ) {
		double sum=a+b+c;
		double averageNumber=sum/3;
		System.out.println(averageNumber);
	}

}
