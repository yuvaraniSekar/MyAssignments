package week3.assign;

public class ReverseOddPosition {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i % 2 != 0) {
//				char[] charArray = split[i].toCharArray();
//				for (int j = charArray.length-1; j>=0; j--) {
//					System.out.println(charArray[j]);
				StringBuilder reverse = new StringBuilder(split[i]);
				System.out.print(reverse.reverse() + " ");
				}
			else {
				System.out.print(split[i] + " ");
			}
		}
//System.out.println(test);
	}

}

//String test = "I am a software tester"; 
//String[] words = test.split(" ");
//for (int i = 0; i < words.length; i++) {
//if(i%2 == 1) {
//// reverse logic 
//StringBuilder sb = new StringBuilder(words[i]);
//System.out.print(sb.reverse()+" ");
//} else {
//System.out.print(words[i]+" ");
//}
//}
//
//}
//
//}
