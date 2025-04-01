package week3.assign;


import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		String s1 = "stops";
		String s2 ="potss";
		if(s1.length()==s2.length()) {
			char[] ch = s1.toCharArray();
			char[] ch1 = s2.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[i]);
			}
			//System.out.println(ch);
			Arrays.sort(ch);
			Arrays.sort(ch1);
			System.out.println(ch);
			System.out.println(ch1);
			//String string = ch.toString();
			//String string2 = ch1.toString();
			
			if(Arrays.equals(ch, ch1)) {
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not an Anagram.");
			}
			System.out.println(Arrays.equals(ch, ch1));
			
		}
		else
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
}

}
