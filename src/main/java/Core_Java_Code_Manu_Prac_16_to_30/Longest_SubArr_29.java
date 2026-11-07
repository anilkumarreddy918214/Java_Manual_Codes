package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.HashSet;

public class Longest_SubArr_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcdabcbb";
		int max=0;
		int start=0;
		HashSet<Character> set=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(set.contains(ch)) {
				set.clear();
				start=i;
			}
			set.add(ch);
			if(set.size() > max) {
				max=set.size();
			}
		}
		
		System.out.println("The Length of the String is : "+max);
	}

}
