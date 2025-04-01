package week3.assign;

public class OddIndex {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		int length = ch.length;
		System.out.println(length);
		for (int i =0; i <ch.length; i++) {
			if(i % 2 != 0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
System.out.println(ch);
	}

}
