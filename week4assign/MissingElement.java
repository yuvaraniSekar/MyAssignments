package week4assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> missing = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			missing.add(arr[i]);
		}
		
		Collections.sort(missing);
		System.out.println(missing);
		System.out.println(missing.size());
		for (int i = 0; i < missing.size()-1; i++) {
			int integer = missing.get(i);
			int integer2 = missing.get(i+1);
			if(integer2-integer>1)
			{
				for (int j = integer+1; j < integer2; j++) {
					System.out.println(j);
				}
			}
			//System.out.println(i);
		}
		
		
		}

	}


