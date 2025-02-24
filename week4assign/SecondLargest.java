package week4assign;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int num[]= {3, 2, 11, 4, 6, 7};
		List<Integer> large = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			large.add(num[i]);
		}
		//large.size();
		Collections.sort(large);
		System.out.println("Second largest number is:" + large.get(4));
		//Arrays.sort(num);
		/*for (int i = 0; i < num.length; i++) {
			
		}*/
		//System.out.println(num[4]);
		
		
	}

}
