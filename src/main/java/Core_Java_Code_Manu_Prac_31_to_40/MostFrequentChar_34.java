package Core_Java_Code_Manu_Prac_31_to_40;

import java.util.HashMap;

public class MostFrequentChar_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programmming";
		
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		}
		char frechar=' ';
		int max=0;
		
		for(char ch:map.keySet()) {
			if(map.get(ch) > max) {
				max =map.get(ch);
				frechar=ch;
			}
		}
		 System.out.println("Most frequent character: " + frechar);
	     System.out.println("Frequency: " + max);

	}

}
