package week04;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean isHotOutside=sc.nextBoolean();
		double moneyInPocket=sc.nextDouble();
		willBuyDrink(isHotOutside, moneyInPocket);

	}
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if(isHotOutside==true|| moneyInPocket>=10.50) {
			return true;
		}
		else {
			return false;
		}
	}

}
