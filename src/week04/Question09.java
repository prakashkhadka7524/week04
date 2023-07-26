package week04;

import java.util.Scanner;

public class Question09 {
	// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.


	public static void main(String[] args) {
		int array[]= {10,20,30,40};	//array
		
		arrayNumbers(array);
		
	}
	static void arrayNumbers(int array[]) {
		int sum=0;
		for(int i=0; i<array.length; i++) { // looping the array
			sum=sum+array[i];
		}
		if(sum>100) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
