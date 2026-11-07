package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.Arrays;

public class Anagram_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="listena";
		String str1="silenta";
		
		char[] c1=str.toCharArray();
		char[] c2=str1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean anagram=Arrays.equals(c1, c2);
		
		if(anagram) {
			System.out.println(str+" and "+str1+" are Angrams.");
		}else {
			System.out.println(str+" and "+str1+" are Not Angrams.");
		}

	}

}
