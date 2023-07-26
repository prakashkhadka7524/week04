package week04;

public class Question11 {
	/*Write a method that takes two arrays of double and returns true if the average of the
	elements in the first array is greater than the average of the elements in the second 
	array.*/

	public static void main(String[] args) {
		double firstArray[] = {1,2, 4,5};
		double secondArray[]= {2,4,5,6,6};
		compareArray(firstArray, secondArray);
		
	}
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

}
