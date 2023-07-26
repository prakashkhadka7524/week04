package week04;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		problemSolve(num1, num2);
		
	}
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
