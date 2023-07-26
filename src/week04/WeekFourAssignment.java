package week04;

import java.util.Iterator;
import java.util.Scanner;

public class WeekFourAssignment {

	public static void main(String[] args) {
		int [] ages= {3,9,23,64,2,8,28,93}; // array with 8 elements
		int result = 0; // initialize the result variable
		for(int i=0; i<ages.length; i++) { // using for loop to check 
			 result= ages[ages.length-1]-ages[0];// writing the logic
		}
		System.out.println(result); // print the result
		
		int [] newAges= new int [ages.length+1];
		System.out.println("-------------------------");
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
        int sum = 0;
        int i;
        for (i = 0; i < names.length; i++) {
            String separateName = names[i];
            sum = sum + separateName.length();
        }
        System.out.println(sum); // sum of the characters
        double averageCharacter = sum / names.length; // averaging the characters
        System.out.println(averageCharacter);
        for (i = 0; i < names.length; i++) {
            String separateName = names[i];
            System.out.print(separateName+" ");
        }
        System.out.println();
        System.out.println("----------------------------");
       System.out.println(names[names.length-1]); // last elements of array
       System.out.println("----------------------------");
       System.out.println(names[0]);// first elements of array
       System.out.println("-----------------------------");
       
       
       int nameLengths[]= new int [names.length]; // length of nameLengths== names.length
       for (int j = 0; j < nameLengths.length; j++) {
		int nameLength= names[j].length();
		System.out.print(nameLength+" "); // printing the lengths of names
		
		System.out.println();
		
			}
       System.out.println("-----------------------------"); // Question 7
       Scanner scanner= new Scanner(System.in); // user input by scanner method
       String word= scanner.next(); // String input
       int n=scanner.nextInt(); // int input
       concat( word,  n);	// calling method
		
	}
	 static void concat(String word, int n){ // method
	        for (int i=0; i<n; i++){ // looping
	            System.out.print(word);
	        }
	  }
}


