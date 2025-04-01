package week3.assign;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		
		String[] split = text.split(" ");
		//System.out.println(split[4]);
		for (int i = 0; i < split.length; i++) {
		for (int j = 0; j < split.length; j++) {
			if(split[i].equals(split[j])) {
				count++;
			}
			}
		
		if(count>1) {
			text = text.replace(split[i], "");
		}
		count =0;
		}
		System.out.println(text);
		}
		
	}

//String text = "We learn java basics as part of java sessions in java week1 learn";
//int count = 0;
//String[] words = text.split(" ");
//for (int i = 0; i < words.length; i++) {
//for (int j = 0; j < words.length; j++) {
//if(words[i].equals(words[j])) {
//count++;
//}
//}
//if(count > 1) {
//text = text.replace(words[i], "");
//}
//count = 0;
//}
//System.out.println(text);
//
//
//}
//
//}




