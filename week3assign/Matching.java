package week3.assign;

public class Matching {
	
	//find the duplicate numbers

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};//declaring array value
		int[] b = {1,2,8,4,9,7};
		
		for(int i =0; i<a.length; i++) {//for loop declaration
			for(int j =0; j<b.length; j++) {//nested for loop
				if(a[i]==b[j]) {//condition to check the matches
					System.out.println("Matching elements are "+ a[i]);
				}
			}
		}

	}

}
