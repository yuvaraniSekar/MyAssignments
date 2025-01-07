package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int firstNumber =0, secondNumber =1, range =8;
		int nextNumber;
		
		for(int i=1; i<=range; i++) {
			System.out.print(firstNumber + ", ");
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			
		}

	}

}
