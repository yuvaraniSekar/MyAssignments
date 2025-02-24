package week4assign;

import java.util.ArrayList;
import java.util.List;

public class FindInseration {

	
	
	public static void main(String[] args) {
		int[] a = {3, 2, 11, 4, 6, 7}; //Declaring array
		int[] b= {1, 2, 8, 4, 9, 7};
		List<Integer> compare = new ArrayList<Integer>();//syntax for list
		List<Integer> compare1 = new ArrayList<Integer>();
		for (int num : a) {//loop to get array values
			compare.add(num);
			}
		for (int value : b) {
			compare1.add(value);
			
		}
//		for (int i = 0; i < compare.size(); i++) {
//			for (int j = 0; j < compare1.size(); j++) {
//				if(compare.get(i).compareTo(compare1.get(j))) {
//					System.out.println("Equal numbers are:" + compare1);
//				}
//			}
//		}
		for (int number : compare) {
		if(compare1.contains(number)){
			System.out.println("Equal numbers are:" + number);
		}
		}
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				if(a[i] == b[j]) {
//					System.out.println("Equal number are:" + a[i]);
//				}
//			}
//			
	//	}
			}

}
