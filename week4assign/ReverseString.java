package week4assign;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		Arrays.sort(array);
		List<String> reverse = new ArrayList<String>();
		
		for (int i = array.length-1; i >=0; i--) {
			reverse.add(array[i]);
		}
		//reverse.s
		//Collections.sort(reverse);
//		Collections.reverse(reverse);
//		System.out.println(reverse);
//		for (int i = reverse.size()-1; i>=0 ; i--) {
		System.out.println(reverse);
//		}
	}

}
