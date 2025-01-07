package week1.day2;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		int number = 13;
		boolean prime = true;
		
for (int i = 2; i < number; i++) {
	if(number%i==0) {
		System.out.println("Not prime number");
		prime = false;
		break;
	}
	
}
if(prime) {
	System.out.println("Prime number");
}
	}

}
