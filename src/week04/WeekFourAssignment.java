package week04;

import java.util.Iterator;
import java.util.Scanner;

public class WeekFourAssignment {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		// Step 1 main
		int [] ages= {3,9,23,64,2,8,28,93}; // array with 8 elements
		int result = 0; // initialize the result variable
		for(int i=0; i<ages.length; i++) { // using for loop to check 
			 result= ages[ages.length-1]-ages[0];// writing the logic
		}
		System.out.println(result); // print the result
		int [] newAges= new int [ages.length+1];
		System.out.println("-------------------------");
		// Step 2
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
        // Step 3  only in main
       System.out.println(names[names.length-1]); // last elements of array
       System.out.println("----------------------------");
       // Step 4 only in main
       System.out.println(names[0]);// first elements of array
       System.out.println("-----------------------------");
       // Step 5 only in main
       int nameLengths[]= new int [names.length]; // length of nameLengths== names.length
       for (int j = 0; j < nameLengths.length; j++) {
    	 System.out.println("--------------------------");
    	 
    	  // Step 6 only in main
		int nameLength= names[j].length();
		System.out.print(nameLength+" "); // printing the lengths of names
		System.out.println();
			}
       System.out.println("-----------------------------"); 
       // Step 7 main 
       Scanner scanner= new Scanner(System.in); // user input by scanner method
       System.out.println("Enter a word");
       String word= scanner.next(); // String input
       System.out.println("Enter how many times you want to repeat");
       int n=scanner.nextInt(); // int input
       concat( word,  n);	// calling method	
       
       System.out.println("-------------------------");
       // Step 8 main
       System.out.println("Enter first name");
       String firstName=scanner.next();
       System.out.println("Enter last Name");
		String lastName=scanner.next();
		fullName(firstName, lastName);
		System.out.println("-----------------------");
		
		// Step 9 main
		int array[]= {10,20,30,40};	//array
		arrayNumbers(array);
		System.out.println("-----------------------");
		// Step 10 main
		System.out.println("Enter a number");
		double a=scanner.nextDouble();
		System.out.println("Enter second number");
		double b=scanner.nextDouble();
		System.out.println("Enter third number");
		double c= scanner.nextDouble();
		average(a,b,c);
		System.out.println("-------------------------");
		//Step 11 main
		double firstArray[] = {1,2, 4,5};
		double secondArray[]= {2,4,5,6,6};
		compareArray(firstArray, secondArray);
		System.out.println("--------------------------");
		// Step 12 main
		System.out.println(" Is it hot outside ? True Or False");
		boolean isHotOutside=scanner.nextBoolean();
		System.out.println("How much money you have on pocket");
		double moneyInPocket=scanner.nextDouble();
		willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("--------------------------");
		// Step 13 main
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		problemSolve(num1, num2);
		
		
	} 
	// end of main
	// Step 7 method
	 static void concat(String word, int n){ // method
	        for (int i=0; i<n; i++){ // looping
	            System.out.print(word);
	        }
	  }
	 // step 8 method
	  static void fullName(String firstName, String lastName) {
			System.out.println(firstName+" "+lastName); // printing 
		}
	  // Step 9 method
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
	  // Step 10 method
	  static void average(double a, double b, double c ) {
			double sum=a+b+c;
			double averageNumber=sum/3;
			System.out.println(averageNumber);
		}
	  // Step 11 method
	  
	  static void compareArray(double firstArray[], double secondArray[]) {
			double firstArraySum=0;
			double averageSecndArray=0;
			double averageFirstArray=0;
			
			for(int i=0; i<firstArray.length;i++) {
				firstArraySum=firstArraySum+firstArray[i];
				 averageFirstArray=firstArraySum/firstArray.length;
			}
			double secondArraySum=0;
			for(int j=0; j<secondArray.length;j++) {
				secondArraySum=secondArraySum+secondArray[j];
				 averageSecndArray=secondArraySum/secondArray.length;
			}
			if(averageFirstArray>averageSecndArray) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
			
		}
	  // Step 12 method 
	  static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			if(isHotOutside==true|| moneyInPocket>=10.50) {
				return true;
			}
			else {
				return false;
			}
		}
	  // Step 13 method
	  static void problemSolve(int num1,int num2) {
			int sum=num1+num2;
			int substract= num1-num2;
			int multiply= num1*num2;
			int divide=num1/num2;
			System.out.println(sum);
			System.out.println(substract);
			System.out.println(multiply);
			System.out.println(divide);
		}

	 
}


